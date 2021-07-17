package com.example.springpaypalexample.springpaypalexample;

import lombok.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class PaypalConfig {

    @Value("${paypal.client.id}")
    private String clientId;
    @Value("${paypal.client.secret}")
    private String clientSecret;
    @Value(staticConstructor = "${paypal.mode}")
    private String mode;

    @Bean
    public Map<String,String> paypalSdkConfig(){
        Map<String,String> configMap = new HashMap<>();
        configMap.put("mode", mode);
        return configMap;
    }
}
