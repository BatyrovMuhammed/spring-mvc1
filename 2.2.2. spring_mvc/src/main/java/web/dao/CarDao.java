package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao implements ServiceInterfce {

    private static int CAR_COUNT;
    private  List<Car> carsList;

    {
        carsList = new ArrayList<>();

        carsList.add(new Car(++CAR_COUNT, "BMW", 2013, "w43w"));
        carsList.add(new Car(++CAR_COUNT, "Mers", 2013, "w3rr"));
        carsList.add(new Car(++CAR_COUNT, "Audi", 2013, "100e"));
        carsList.add(new Car(++CAR_COUNT, "Lexus", 2013, "570"));
        carsList.add(new Car(++CAR_COUNT, "Ferrari", 1983, "fk"));
    }
    @Override
    public List<Car> carsImpl(long id) {
        List<Car> carsList1 = new ArrayList<>();
        for (int i = 0; i < id; i++) {
            if (id <=5) {
                carsList1.add(carsList.get(i));
            } else {
                return carsList;
            }
        }
        return carsList1;
    }

    @Override
    public List<Car> carsImpl1() {
        return carsList;
    }
}
