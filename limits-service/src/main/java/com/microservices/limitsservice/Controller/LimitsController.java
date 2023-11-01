package com.microservices.limitsservice.Controller;

import com.microservices.limitsservice.Bean.Limits;
import com.microservices.limitsservice.Configuartion.LimitsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private LimitsConfiguration limitsConfiguration;
    @GetMapping("/limits")
    public Limits retriveLimits(){

        return new Limits(limitsConfiguration.getMinimum(), limitsConfiguration.getMaximum());
//        return new Limits(1,1000);
    }
}
