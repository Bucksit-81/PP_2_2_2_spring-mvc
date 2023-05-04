package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList; {
            carList = new ArrayList<>();
            carList.add(new Car("Hyundai", "Solaris", 2012));
            carList.add(new Car("Volkswagen", "Polo", 2012));
            carList.add(new Car("Ford", "Focus-3", 2011));
            carList.add(new Car("Toyota", "Camry", 1997));
            carList.add(new Car("VAZ", "21065", 1999));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}