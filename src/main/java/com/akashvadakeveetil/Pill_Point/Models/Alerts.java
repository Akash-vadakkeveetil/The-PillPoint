package com.akashvadakeveetil.Pill_Point.Models;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class Alerts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long alertId;
    private Long pharmacyId;
    private Long medicineId;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    private Boolean resolved;
    private String alertMessage;
    private String alertType;

    private LocalDateTime resolvedAt;

    public Alerts() {
    }

    public Alerts(Long alertId, Long pharmacyId, Long medicineId, LocalDateTime createdAt, Boolean resolved, String alertMessage, String alertType, LocalDateTime resolvedAt) {
        this.alertId = alertId;
        this.pharmacyId = pharmacyId;
        this.medicineId = medicineId;
        this.createdAt = createdAt;
        this.resolved = resolved;
        this.alertMessage = alertMessage;
        this.alertType = alertType;
        this.resolvedAt = resolvedAt;
    }

    public void setResolved(Boolean resolved) {
        this.resolved = resolved;
        if (Boolean.TRUE.equals(resolved)) {
            this.resolvedAt = LocalDateTime.now(); // Set current timestamp
        }
    }

    // Getters and Setters
    public Long getAlertId() {
        return alertId;
    }

    public void setAlertId(Long alertId) {
        this.alertId = alertId;
    }

    public Long getPharmacyId() {
        return pharmacyId;
    }

    public void setPharmacyId(Long pharmacyId) {
        this.pharmacyId = pharmacyId;
    }

    public Long getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Long medicineId) {
        this.medicineId = medicineId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public Boolean getResolved() {
        return resolved;
    }

    public String getAlertMessage() {
        return alertMessage;
    }

    public void setAlertMessage(String alertMessage) {
        this.alertMessage = alertMessage;
    }

    public String getAlertType() {
        return alertType;
    }

    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    public LocalDateTime getResolvedAt() {
        return resolvedAt;
    }
}
