package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService{
    private  List<Car> listCars;


    public CarServiceImp() {
        listCars=new ArrayList<>();
        listCars.add(new Car("Mercedes-Benz",200,12));
        listCars.add(new Car("BMW",5,12));
        listCars.add(new Car("Lada",11,2));
        listCars.add(new Car("Kia",5,2));
        listCars.add(new Car("Mazda",3,3));
    }

    @Override
    public List<Car> getAllCars() {
        return listCars;
    }

    @Override
    public List<Car> getAmountCar(int amount) {
        return listCars.stream().limit(amount).collect(Collectors.toList());
    }
}
