package web.dao;

import web.models.Car;

import java.util.List;

public interface ServiceInterfce {
    List<Car> carsImpl(long id);

    List<Car> carsImpl1();
}
