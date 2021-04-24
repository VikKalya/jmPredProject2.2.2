package com.kalyanov.service;

import com.kalyanov.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class ServiceCar implements Servicee {

    private List<Car> listCar;

    {
        listCar = new ArrayList<>();
        listCar.add(new Car(1L,"mazda", "x5"));
        listCar.add(new Car(2L,"bmw", "x5"));
        listCar.add(new Car(3L,"mersedec", "c"));
        listCar.add(new Car(4L,"toyotta", "mark2"));
        listCar.add(new Car(5L,"maz", "x5"));
    }

     public List<Car> getListCar(){

         return listCar;
    }


    @Override
    public List <Car> getCarCount(int count) {

        return listCar.stream().limit(count).collect(Collectors.toList());
    }
}
