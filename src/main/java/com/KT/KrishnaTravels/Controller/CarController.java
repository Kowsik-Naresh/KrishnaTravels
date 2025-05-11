package com.KT.KrishnaTravels.Controller;

import com.KT.KrishnaTravels.Modals.CarBean;
import com.KT.KrishnaTravels.Modals.ReviewBean;
import com.KT.KrishnaTravels.Service.CarService;
import com.KT.KrishnaTravels.predefind.KrishnaTravelsResponseBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/cars")
@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public String getCarsModule() {
        return "Cars module";
    }

    @GetMapping("/allCars")
    public KrishnaTravelsResponseBean getAllCars() {
        KrishnaTravelsResponseBean response = new KrishnaTravelsResponseBean();
        response.setData(carService.getAllCars());
        return response;
    }

    @GetMapping("/getCarById")
    public KrishnaTravelsResponseBean getCarById(@RequestParam(required = true) Long carId) {
        KrishnaTravelsResponseBean response = new KrishnaTravelsResponseBean();
        response.setData(carService.getCarByCarId(carId));
        return response;
    }

    @PostMapping("/createCar")
    public KrishnaTravelsResponseBean createCar(@RequestBody CarBean car) {
        KrishnaTravelsResponseBean response = new KrishnaTravelsResponseBean();
        response.setData(carService.createCar(car));
        return response;
    }

    @GetMapping("/getCarReviews")
    public KrishnaTravelsResponseBean getCarReviews(@RequestParam(required = true) Long carId) {
        KrishnaTravelsResponseBean response = new KrishnaTravelsResponseBean();
        response.setData(carService.getCarReviewsByCarId(carId));
        return response;
    }
}
