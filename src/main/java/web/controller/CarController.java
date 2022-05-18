package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String addCars(@RequestParam(value = "count", defaultValue = "0") int count, Model model){
        List<Car> cars = new ArrayList<>();
        cars = CarService.getCarsByNumber(cars, count);
        model.addAttribute("car", cars);
        return "cars";
    }

}
