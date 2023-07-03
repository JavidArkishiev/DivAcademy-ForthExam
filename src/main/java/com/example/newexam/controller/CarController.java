package com.example.newexam.controller;

import com.example.newexam.entity.Car;
import com.example.newexam.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CarController {

    private final CarService carService;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Car> getAllCar() {
        return carService.getAllCar();

    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Car create(@RequestBody Car car) {
        return carService.create(car);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCar(@PathVariable Integer id) {
        carService.deleteCar(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Car updateCar(@PathVariable Integer id,@RequestBody Car car){
        return carService.updateCar(id,car);

    }


}
