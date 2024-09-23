package com.iambstha.location_producer.service;

import com.iambstha.location_producer.constant.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public boolean updateLocation(String location){
        kafkaTemplate.send(AppConstant.LOCATION, location);
        return true;
    }

    public boolean updateAddress(String address){
        kafkaTemplate.send(AppConstant.ADDRESS, address);
        return true;
    }

}
