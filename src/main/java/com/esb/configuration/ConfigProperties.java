package com.esb.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * @author tanuj.tripathi@bt.com
 */
@Configuration
@PropertySources({
        @PropertySource("classpath:constants.properties"),
        @PropertySource("classpath:application.properties")
})
@ConfigurationProperties()
public class ConfigProperties {

    //TODO: Initialize any constants
}