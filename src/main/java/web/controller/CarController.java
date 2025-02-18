package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.Service;

@Controller
public class CarController {
    private Service service;

    @Autowired
    public CarController(Service service) {
        this.service = service;
    }

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", defaultValue = "5", required = false) int value, Model model) {
        model.addAttribute("count", service.showCars(value));
        System.out.println(service.showCars(value));
        return "showCars";
    }
}
