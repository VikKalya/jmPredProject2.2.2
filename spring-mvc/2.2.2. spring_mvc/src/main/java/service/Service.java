package service;

import model.Car;

import java.util.List;

public interface Service {
    List <Car> getCarCount(List<Car> cars, int count);
}
