package com.akashvadakeveetil.Pill_Point.Repositories;

import com.akashvadakeveetil.Pill_Point.Models.Alerts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertRepository extends JpaRepository<Alerts,Long> {
}
