package com.example.demo;

import java.sql.Driver;

public class SchoolBus {
    public String uniformedDriver;
    public String studentPassenger;
    public String yelloBus;


    public String getUniformedDriver(String newvalue) {
        return uniformedDriver;


    }

    public void setUniformedDriver(String uniformedDriver) {
        this.uniformedDriver = uniformedDriver;
    }

    public String getStudentPassenger() {
        return studentPassenger;

    }

    public void setStudentPassenger(String studentPassenger) {
        this.studentPassenger = studentPassenger;
    }

    public String getYelloBus() {
        return yelloBus;
    }

    public void setYelloBus(String yelloBus) {
        this.yelloBus = yelloBus;
    }
}
