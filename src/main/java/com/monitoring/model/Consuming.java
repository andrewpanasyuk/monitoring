package com.monitoring.model;


//import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.Month;

@Entity
@Table(name = "consuming")
public class Consuming {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String user;

    @NotNull
    private Month month;

    @NotNull
    @Digits(integer=5, fraction=2, message="....")
    private BigDecimal coldWaterCount;

    @NotNull
    private double hotWaterCount;

    @NotNull
    private double gasCount;

    public Consuming() {
    }

    public Consuming(String user) {
        this.user = user;
    }

        public Consuming(String user, Month month, BigDecimal coldWaterCount, double hotWaterCount, double gasCount) {
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

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public BigDecimal getColdWaterCount() {
        return coldWaterCount;
    }

    public void setColdWaterCount(BigDecimal coldWaterCount) {
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



