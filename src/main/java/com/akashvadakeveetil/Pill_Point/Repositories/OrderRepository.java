package com.akashvadakeveetil.Pill_Point.Repositories;

import com.akashvadakeveetil.Pill_Point.Models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders,Long> {
}
