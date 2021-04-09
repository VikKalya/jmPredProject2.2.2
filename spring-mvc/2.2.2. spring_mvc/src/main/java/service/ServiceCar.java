package service;

import model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class ServiceCar implements Service{

    @Override
    public List <Car> getCarCount(List <Car> cars, int count) {

        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
