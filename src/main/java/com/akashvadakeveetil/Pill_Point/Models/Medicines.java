package com.akashvadakeveetil.Pill_Point.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Medicines {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long medicineId;
    private String name;
    private String category;
    private String description;
    private Integer quantity;
    private Integer threshold;
    private Long manufacturerId;
    private Date expiryDate;

    public Medicines() {
    }

    public Medicines(Long medicineId, String name, String category, String description, Integer quantity, Integer threshold, Long manufacturerId, Date expiryDate) {
        this.medicineId = medicineId;
        this.name = name;
        this.category = category;
        this.description = description;
        this.quantity = quantity;
        this.threshold = threshold;
        this.manufacturerId = manufacturerId;
        this.expiryDate = expiryDate;
    }

    public Long getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Long medicineId) {
        this.medicineId = medicineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public Long getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Long manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}
