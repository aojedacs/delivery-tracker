package com.q1encoderq.delivery_tracker.service;

import com.q1encoderq.delivery_tracker.model.TrackingLog;
import com.q1encoderq.delivery_tracker.repository.TrackingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrackingServcie {

    @Autowired
    private TrackingRepository repository;

    @Autowired
    private KafkaProducerService kafkaService;

    public TrackingLog processUpdate(TrackingLog log){

        TrackingLog savedLog = repository.save(log);

        String message = "Vehicle " + log.getVehicleId()
                + " in: " + log.getLatitude()
                + ", " +log.getLongitude();

        kafkaService.sendMessage(message);

        return savedLog;
    }
}
