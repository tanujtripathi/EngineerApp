package com.esb.repository;

import com.esb.entity.Engineer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author tanuj.tripathi@bt.com
 */
public interface EngineerRepository extends JpaRepository<Engineer, Long> {

    Engineer findFirst1ByAvailable(String available);

    Engineer findByReferenceNumber(Long referenceNumber);
}
