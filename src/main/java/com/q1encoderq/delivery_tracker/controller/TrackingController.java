package com.q1encoderq.delivery_tracker.controller;

import com.q1encoderq.delivery_tracker.model.TrackingLog;
import com.q1encoderq.delivery_tracker.service.TrackingServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/tracking")
public class TrackingController {

    @Autowired
    private TrackingServcie trackingServcie;

    @PostMapping
    public TrackingLog sendUpdate(@RequestBody TrackingLog log){
        return trackingServcie.processUpdate(log);
    }

    @GetMapping("/test")
    public String test() {
        return "El controlador está vivo!";
    }


}
