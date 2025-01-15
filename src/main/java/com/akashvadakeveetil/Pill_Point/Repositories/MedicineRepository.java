package com.akashvadakeveetil.Pill_Point.Repositories;

import com.akashvadakeveetil.Pill_Point.Models.Medicines;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepository extends JpaRepository<Medicines,Long> {
}
