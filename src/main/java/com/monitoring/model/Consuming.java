package com.monitoring.model;


//import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "consuming")
public class Consuming {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="user")
    private String user;
    private String month;
    private double coldWaterCount;
    private double hotWaterCount;
    private double gasCount;

    public Consuming() {
    }

    public Consuming(String user) {
        this.user = user;
    }

        public Consuming(String user, String month, double coldWaterCount, double hotWaterCount, double gasCount) {
        this.user = user;
        this.month = month;
        this.coldWaterCount = coldWaterCount;
        this.hotWaterCount = hotWaterCount;
        this.gasCount = gasCount;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public double getColdWaterCount() {
        return coldWaterCount;
    }

    public void setColdWaterCount(double coldWaterCount) {
        this.coldWaterCount = coldWaterCount;
    }

    public double getHotWaterCount() {
        return hotWaterCount;
    }

    public void setHotWaterCount(double hotWaterCount) {
        this.hotWaterCount = hotWaterCount;
    }

    public double getGasCount() {
        return gasCount;
    }

    public void setGasCount(double gasCount) {
        this.gasCount = gasCount;
    }

    @Override
    public String toString() {
        return "Consuming{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", month='" + month + '\'' +
                ", coldWaterCount=" + coldWaterCount +
                ", hotWaterCount=" + hotWaterCount +
                ", gasCount=" + gasCount +
                '}';
    }
}



