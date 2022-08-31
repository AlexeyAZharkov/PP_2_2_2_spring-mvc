package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarServiceImp implements CarService {
//    private List<Car> carList = new ArrayList<>();
    private List<Car> carList = Arrays.asList(
            new Car("Vesta", 2022, 11000),
            new Car("Granta", 2021, 9000),
            new Car("Logan", 2018, 12000),
            new Car("SX4", 2014, 14000),
            new Car("Duster", 2020, 15000)
            );

//    private List<Integer> numbers = Arrays.asList(1, 2, 5, 9, 11);

//    intList.add

    //    CarServiceImp.addCar(new Car("Vesta", 2022, 11000));
//		carServiceImp.addCar(new Car("Granta", 2021, 9000));
//		carServiceImp.addCar(new Car("Logan", 2018, 12000));
//		carServiceImp.addCar(new Car("SX4", 2014, 14000));
//		carServiceImp.addCar(new Car("Duster", 2020, 15000));

//    @Override
//    public void addCar(Car car) {
//        carList.add(car);
//    }

    @Override
    public List<Car> listCarsFromRequest(int count) {
        return carList.subList(0, count);
    }
}
