package org.example.springrenderapp.service;

import org.example.springrenderapp.domain.Car;
import org.example.springrenderapp.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private final CarRepository carRepository;
    private static List<Car> cars = List.of(new Car("Audi", "Grey"),
            new Car("BMW", "Black"));

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void addCars() {
        this.carRepository.saveAll(cars);
    }

    public List<Car> getAllCars() {
        return this.carRepository.findAll();
    }

    public Car getCarById(int id) {
        return this.carRepository.findById(id).orElseThrow();
    }
}
