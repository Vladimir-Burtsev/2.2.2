package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class Service {
    private static int CAR_ID;
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(++CAR_ID, "car1", 1));
        cars.add(new Car(++CAR_ID, "car2", 2));
        cars.add(new Car(++CAR_ID, "car3", 3));
        cars.add(new Car(++CAR_ID, "car4", 4));
        cars.add(new Car(++CAR_ID, "car5", 5));
    }

    public List<Car> showCars(int value) {
        return cars.stream().limit(value).toList();
    }
}
