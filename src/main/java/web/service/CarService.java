package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    public static List<Car> getCarsByNumber(List<Car> cars, int count){
        cars.add(new Car("BWM", "Black", 42));
        cars.add(new Car("VOLVO", "White", 1213-3-11));
        cars.add(new Car("AUDI", "Red", 552211));
        cars.add(new Car("MAZDA", "Yellow", 1233-33333));
        cars.add(new Car("CITROEN", "Blue", 6233-21));
        if(count > 0 & count < 5){
            return cars.stream().limit(count).collect(Collectors.toList());
        }
        return cars;
    }
}
