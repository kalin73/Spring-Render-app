package com.example.demo.web;

import com.example.demo.domain.Car;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CarController {
    @GetMapping("/")
    public ModelAndView getAllCars(ModelAndView modelAndView) {
        List<Car> cars = List.of(new Car(1, "Audi", "Grey"),
                new Car(1, "BMW", "Black"));
        modelAndView.addObject("cars", cars);
        modelAndView.setViewName("index");

        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView getCarById(@PathVariable(name = "id") int id, ModelAndView modelAndView) {

        return modelAndView;
    }
}
