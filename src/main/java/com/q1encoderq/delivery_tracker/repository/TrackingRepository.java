package com.q1encoderq.delivery_tracker.repository;

import com.q1encoderq.delivery_tracker.model.TrackingLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackingRepository extends JpaRepository<TrackingLog,Long> {
}
