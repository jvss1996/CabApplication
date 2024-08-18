package com.shekhawat.cab_book_driver.controller;

import com.shekhawat.cab_book_driver.service.CabLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/location")
public class CabLocationController {

    @Autowired
    private CabLocationService cabLocationService;

    @PutMapping
    public ResponseEntity updateLocation() {
        int range = 100;
        while (range > 100) {
            System.out.println(Math.random() + ", " + Math.random());
            range--;
        }
        return new ResponseEntity<>(Map.of("message", "Location Updated Successfully"), HttpStatus.OK);
    }
}
