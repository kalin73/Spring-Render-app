package org.example.springrenderapp.web;


import org.example.springrenderapp.domain.Car;
import org.example.springrenderapp.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping("/")
    public ModelAndView getAllCars(ModelAndView modelAndView) {
        var cars = this.carService.getAllCars();

        modelAndView.addObject("cars", cars);
        modelAndView.setViewName("index");

        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView getCarById(@PathVariable(name = "id") int id, ModelAndView modelAndView) {
        modelAndView.addObject("car", this.carService.getCarById(id));
        modelAndView.setViewName("car");

        return modelAndView;
    }
}
