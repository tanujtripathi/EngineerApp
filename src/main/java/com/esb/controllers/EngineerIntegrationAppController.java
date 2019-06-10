package com.esb.controllers;

import com.esb.entity.Engineer;
import com.esb.repository.EngineerRepository;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author tanuj.tripathi@bt.com
 */
@RestController
@PropertySource("classpath:constants.properties")
public class EngineerIntegrationAppController {

    public static final String YES = "yes";
    public static final String NO = "no";

    @Autowired
    private EngineerRepository engineerRepository;

    /**
     * @param referenceId must be passed to assign the appointment to the Engineer
     */
    @GetMapping("/getAvailableEngineers/{referenceId}")
    public String getAvailableEngineers(@PathVariable String referenceId) {

        // Getting the first enginner that is available
        Engineer engineer = engineerRepository.findFirst1ByAvailable(YES);

        // If any engineer is available
        if (ObjectUtils.allNotNull(engineer)) {
            engineer.setReferenceNumber(Long.valueOf(referenceId));
            engineer.setAvailable(NO);
            engineerRepository.save(engineer);
            return YES;
        } else {
            return NO;
        }
    }

    /**
     * @param referenceId must be passed to cancel the appointment
     * @return
     */
    @GetMapping("/cancelAppointment/{referenceId}")
    public String cancelAppointment(@PathVariable String referenceId) {

        //Getting the first enginner with the provided referenceId
        Engineer engineer = engineerRepository.findByReferenceNumber(Long.valueOf(referenceId));

        // If any engineer is found
        if (ObjectUtils.allNotNull(engineer)) {
            engineer.setReferenceNumber(null);
            engineer.setAvailable(YES);
            engineerRepository.save(engineer);
            return YES;
        } else {
            return NO;
        }
    }
}
