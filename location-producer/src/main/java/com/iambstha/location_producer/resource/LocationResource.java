package com.iambstha.location_producer.resource;

import com.iambstha.location_producer.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class LocationResource {

    @Autowired
    private LocationService locationService;

    @PutMapping("/location")
    public ResponseEntity updateLocation() throws InterruptedException {
        int range = 10;
        while(range > 0){
            locationService.updateLocation(Math.random() + "," + Math.random());
            Thread.sleep(1000);
            range--;
        }
        return new ResponseEntity<>(Map.of("message","location updated"), HttpStatus.OK);
    }

    @PutMapping("/address")
    public ResponseEntity updateAddress() throws InterruptedException {
        int range = 10;
        while(range > 0){
            locationService.updateAddress("Nepal");
            Thread.sleep(1000);
            range--;
        }
        return new ResponseEntity<>(Map.of("message","address updated"), HttpStatus.OK);
    }


}
