package org.example.springrenderapp.web;


import org.example.springrenderapp.domain.Car;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CarController {
    private static List<Car> cars = List.of(new Car(1, "Audi", "Grey"),
            new Car(2, "BMW", "Black"));

    @GetMapping("/")
    public ModelAndView getAllCars(ModelAndView modelAndView) {

        modelAndView.addObject("cars", cars);
        modelAndView.setViewName("index");

        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView getCarById(@PathVariable(name = "id") int id, ModelAndView modelAndView) {
        modelAndView.addObject("car", cars.stream().filter(c -> c.id() == id).findFirst().orElseThrow());
        modelAndView.setViewName("car");

        return modelAndView;
    }
}
