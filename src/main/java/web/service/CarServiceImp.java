package web.service;

import web.model.Car;
import java.util.Arrays;
import java.util.List;

public class CarServiceImp implements CarService {

    private List<Car> carList = Arrays.asList(
            new Car("Vesta", 2022, 11000),
            new Car("Granta", 2021, 9000),
            new Car("Logan", 2018, 12000),
            new Car("SX4", 2014, 14000),
            new Car("Duster", 2020, 15000)
            );

    @Override
    public List<Car> listCarsFromRequest(int count) {
        return carList.subList(0, count);
    }
}
