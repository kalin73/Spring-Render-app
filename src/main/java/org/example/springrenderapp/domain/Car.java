package org.example.springrenderapp.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String brand;
    private String model;
    private String color;
    private String image;

    public Car() {
    }

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public Integer getId() {
        return id;
    }

    public Car setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public Car setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Car setColor(String color) {
        this.color = color;
        return this;
    }

    public String getImage() {
        return image;
    }

    public Car setImage(String image) {
        this.image = image;
        return this;
    }
}
