package org.example.springrenderapp;

import org.example.springrenderapp.service.CarService;
import org.springframework.boot.CommandLineRunner;


public class ConsoleRunner implements CommandLineRunner {
    private final CarService carService;

    public ConsoleRunner(CarService carService) {
        this.carService = carService;
    }

    @Override
    public void run(String... args) throws Exception {
        this.carService.addCars();
    }
}
