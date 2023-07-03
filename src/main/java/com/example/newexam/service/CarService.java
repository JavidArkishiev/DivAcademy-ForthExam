package com.example.newexam.service;

import com.example.newexam.entity.Car;
import com.example.newexam.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarService {
    private final CarRepository carRepository;

    public List<Car> getAllCar() {
        return carRepository.findAll();
    }

    public Car create(Car car) {
        return carRepository.save(car);
    }

    public void deleteCar(Integer id) {
        carRepository.deleteById(id);
    }

    public Car updateCar(Integer id, Car car) {
        Optional<Car> foundStudent = carRepository.findById(id);
        if (foundStudent.isPresent()) {
            Car newCar = foundStudent.get();
            newCar.setYear(car.getYear());
            newCar.setId(car.getId());
            newCar.setPrice(car.getPrice());
            newCar.setModel(car.getModel());
            newCar.setMarca(car.getMarca());
            newCar.setManufacture_place(car.getManufacture_place());
            return carRepository.save(new Car());


        }
        return null;
    }
}
