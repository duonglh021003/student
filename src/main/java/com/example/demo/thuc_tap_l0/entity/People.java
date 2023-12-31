package com.example.demo.thuc_tap_l0.entity;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class People implements Serializable {

    private static int nextId = 1;
    private int id;

    private String name;

    private LocalDate dateOfBirth;

    private String address;

    private Float height;

    private Float weight;

    public People() {

    }

    public People(String name, LocalDate dateOfBirth, String address, Float height, Float weight) {
        this.id = nextId++;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.height = height;
        this.weight = weight;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        People.nextId = nextId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "id:" + id +
                ", name:'" + name + '\'' +
                ", dateOfBirth:'" + dateOfBirth + '\'' +
                ", address:'" + address + '\'' +
                ", height:" + height +
                ", weight:" + weight;
    }
}
