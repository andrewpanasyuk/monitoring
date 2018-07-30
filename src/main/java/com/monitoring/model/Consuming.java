package com.monitoring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Month;
import java.time.Year;

@Entity
@Table(name = "consuming")
public class Consuming {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min=1, max=10, message="incorrect value for: user name")
    private String user;

    @NotNull
    private Year year;

    @NotNull
    private Month month;

    @NotNull
    @Digits(integer=5, fraction=3, message="incorrect value for: cold water")
    private double coldWater;

    @NotNull
    @Digits(integer=5, fraction=3, message="incorrect value for: hot water")
    private double hotWater;

    @NotNull
    @Digits(integer=5, fraction=3, message="incorrect value for: gas")
    private double gas;

    public Consuming() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public double getColdWater() {
        return coldWater;
    }

    public void setColdWater(double coldWater) {
        this.coldWater = coldWater;
    }

    public double getHotWater() {
        return hotWater;
    }

    public void setHotWater(double hotWater) {
        this.hotWater = hotWater;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Consuming{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", coldWater=" + coldWater +
                ", hotWater=" + hotWater +
                ", gas=" + gas +
                '}';
    }
}



