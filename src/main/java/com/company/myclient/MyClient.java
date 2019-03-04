package com.company.myclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

@Component
public class MyClient {

    private RestTemplate restTemplate;

    @Autowired
    public MyClient(RestTemplateBuilder restTemplateBuilder, ResponseErrorHandler myResponseErrorHandler) {
        this.restTemplate = restTemplateBuilder
                .errorHandler(myResponseErrorHandler)
                .build();
    }
    //other codes here
}
