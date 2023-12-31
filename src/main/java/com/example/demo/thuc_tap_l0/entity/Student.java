package com.example.demo.thuc_tap_l0.entity;

import com.example.demo.thuc_tap_l0.entity.People;

import java.time.LocalDate;
import java.util.Date;


public class Student extends People {

    private String code;

    private String school;

    private Integer startYear;

    private Float average;

    public enum rank {
        LEAST, WEAK, AVERAGE, RATHER, GOOD, EXCELLENT
    }

    public Student() {

    }

    public Student(String name, LocalDate dateOfBirth, String address, Float height, Float weight, String code, String school, Integer startYear, Float average) {
        super(name, dateOfBirth, address, height, weight);
        this.code = code;
        this.school = school;
        this.startYear = startYear;
        this.average = average;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public Float getAverage() {
        return average;
    }

    public void setAverage(Float average) {
        this.average = average;
    }


    @Override
    public String toString() {

        return super.toString() +
                ", code:'" + code + '\'' +
                ", school:'" + school + '\'' +
                ", startYear:" + startYear +
                ", average:" + average +
                ", rankEnum:'" + getRankEnum() + '\'' +
                '}';
    }


    public rank getRankEnum() {
        rank rankEnum;
        if (average >= 9) {
            rankEnum = rank.EXCELLENT;
        } else if (average >= 7.5) {
            rankEnum = rank.GOOD;
        } else if (average >= 6.5) {
            rankEnum = rank.RATHER;
        } else if (average >= 5) {
            rankEnum = rank.AVERAGE;
        } else if (average >= 3) {
            rankEnum = rank.WEAK;
        } else {
            rankEnum = rank.LEAST;
        }
        return rankEnum;
    }

}
