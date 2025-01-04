package com.akashvadakeveetil.Pill_Point.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private Long medicineId;
    private Long pharmacyId;
    private Long supplierId;
    private Integer quantity;
    private String status;
    private LocalDateTime orderDate;
    private LocalDateTime deliveredDate;

    public Orders() {
    }

    public Orders(Long orderId, Long medicineId, Long pharmacyId, Long supplierId, Integer quantity, String status, LocalDateTime orderDate, LocalDateTime deliveredDate) {
        this.orderId = orderId;
        this.medicineId = medicineId;
        this.pharmacyId = pharmacyId;
        this.supplierId = supplierId;
        this.quantity = quantity;
        this.status = status;
        this.orderDate = orderDate;
        this.deliveredDate = deliveredDate;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Long medicineId) {
        this.medicineId = medicineId;
    }

    public Long getPharmacyId() {
        return pharmacyId;
    }

    public void setPharmacyId(Long pharmacyId) {
        this.pharmacyId = pharmacyId;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDateTime getDeliveredDate() {
        return deliveredDate;
    }

    public void setDeliveredDate(LocalDateTime deliveredDate) {
        this.deliveredDate = deliveredDate;
    }
}
