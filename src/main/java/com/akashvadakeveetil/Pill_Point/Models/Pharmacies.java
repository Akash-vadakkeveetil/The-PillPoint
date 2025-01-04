package com.akashvadakeveetil.Pill_Point.Models;

import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
public class Pharmacies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pharmacyId;
    private Long medicineId;
    private Integer currentStock;

    @UpdateTimestamp
    private LocalDateTime lastUpdated;

    private String pharmacyName;
    private String pharmacyAddress;
    private String contactNo;

    @Column(unique = true)
    private Long licenseNo;

    public Pharmacies() {
    }

    public Pharmacies(Long pharmacyId, Long medicineId, Integer currentStock, LocalDateTime lastUpdated, String pharmacyName, String pharmacyAddress, String contactNo, Long licenseNo) {
        this.pharmacyId = pharmacyId;
        this.medicineId = medicineId;
        this.currentStock = currentStock;
        this.lastUpdated = lastUpdated;
        this.pharmacyName = pharmacyName;
        this.pharmacyAddress = pharmacyAddress;
        this.contactNo = contactNo;
        this.licenseNo = licenseNo;
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

    public Integer getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(Integer currentStock) {
        this.currentStock = currentStock;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    public String getPharmacyAddress() {
        return pharmacyAddress;
    }

    public void setPharmacyAddress(String pharmacyAddress) {
        this.pharmacyAddress = pharmacyAddress;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public Long getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(Long licenseNo) {
        this.licenseNo = licenseNo;
    }
}
