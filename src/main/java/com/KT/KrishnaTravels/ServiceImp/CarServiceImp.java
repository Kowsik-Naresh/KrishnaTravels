package com.KT.KrishnaTravels.ServiceImp;

import com.KT.KrishnaTravels.Modals.CarBean;
import com.KT.KrishnaTravels.Modals.ReviewBean;
import com.KT.KrishnaTravels.Repository.CarRepository;
import com.KT.KrishnaTravels.Repository.ReviewRepo;
import com.KT.KrishnaTravels.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private ReviewRepo reviewRepository;

    @Override
    public List<CarBean> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public CarBean getCarByCarId(Long carId) {
        return carRepository.findByCarId(carId);
      
    }

    @Override
    public CarBean createCar(CarBean car) {
        return carRepository.save(car);
    }

    @Override
    public List<ReviewBean> getCarReviewsByCarId(Long carId) {
        return reviewRepository.findByReviewedCarId(carId); // This should be defined in the ReviewRepo
    }
}
