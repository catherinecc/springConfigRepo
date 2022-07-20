package com.catherine.limitsservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties("limits-service")
public class LimitsServiceConfiguration {
	int minimum;
	int maximum;

}
