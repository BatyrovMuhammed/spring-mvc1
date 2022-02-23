package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.models.Car;

@Controller
@RequestMapping("/")
public class CarController {

    private final CarDao carDao;

    @Autowired
    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }


    @GetMapping("/car")
    public String carsUrls(Model model){
        model.addAttribute("cars",carDao.carsImpl1());
        return "/cars";
    }


    @GetMapping("/cars")
    public String carsUrl(@RequestParam("number")int number, Model model){
        model.addAttribute("cars",carDao.carsImpl(number));
//        System.out.println(carDao.carsImpl(number));
        return "/cars";
    }
}
