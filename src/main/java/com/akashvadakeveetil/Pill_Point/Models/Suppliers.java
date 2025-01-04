package com.akashvadakeveetil.Pill_Point.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Suppliers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long supplierId;
    private String supplierName;
    private String contactNo;
    private Long medicineId;
    private String address;
    private Integer stockAvailable;
    private String supplierType;

    public Suppliers() {
    }

    public Suppliers(Long supplierId, String supplierName, String contactNo, Long medicineId, String address, Integer stockAvailable, String supplierType) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.contactNo = contactNo;
        this.medicineId = medicineId;
        this.address = address;
        this.stockAvailable = stockAvailable;
        this.supplierType = supplierType;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public Long getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Long medicineId) {
        this.medicineId = medicineId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getStockAvailable() {
        return stockAvailable;
    }

    public void setStockAvailable(Integer stockAvailable) {
        this.stockAvailable = stockAvailable;
    }

    public String getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType;
    }
}
