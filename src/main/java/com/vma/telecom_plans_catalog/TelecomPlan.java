package com.vma.telecom_plans_catalog;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class TelecomPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private Integer dataGb;

    public TelecomPlan() {
    }

    public TelecomPlan(Long id, String name, Double price, Integer dataGb) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.dataGb = dataGb;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getDataGb() {
        return dataGb;
    }

    public void setDataGb(Integer dataGb) {
        this.dataGb = dataGb;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TelecomPlan that = (TelecomPlan) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(price, that.price) && Objects.equals(dataGb, that.dataGb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, dataGb);
    }
}
