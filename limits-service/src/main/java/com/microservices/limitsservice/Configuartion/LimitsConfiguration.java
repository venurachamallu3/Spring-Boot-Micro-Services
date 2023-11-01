package com.microservices.limitsservice.Configuartion;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties("limits-service")
@Component
public class LimitsConfiguration {

    private int minimum;
    private int maximum;
}
