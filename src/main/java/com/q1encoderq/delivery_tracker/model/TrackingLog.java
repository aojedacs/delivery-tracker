package com.q1encoderq.delivery_tracker.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tracking_logs")
@Data
public class TrackingLog {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String vehicleId;
    private Double latitude;
    private Double longitude;

    @Enumerated(EnumType.STRING)
    private TrackingStatus status;

}
