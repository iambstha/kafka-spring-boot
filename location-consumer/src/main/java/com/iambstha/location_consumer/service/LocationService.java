package com.iambstha.location_consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @KafkaListener(topics = "location", groupId = "user-group")
    public void consumeLocation(String location){
        System.out.println(location);
    }

    @KafkaListener(topics = "address", groupId = "user-group")
    public void consumeAddress(String address){
        System.out.println(address);
    }

}
