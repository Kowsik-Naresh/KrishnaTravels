package com.KT.KrishnaTravels.ServiceImp;

import com.KT.KrishnaTravels.DTO.CarDTO;
import com.KT.KrishnaTravels.Modals.CarBean;
import com.KT.KrishnaTravels.Modals.ReviewBean;
import com.KT.KrishnaTravels.Repository.CarRepository;
import com.KT.KrishnaTravels.Repository.ReviewRepo;
import com.KT.KrishnaTravels.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public CarDTO getCarByCarId(Long carId) {
        Optional<CarBean> car = carRepository.findById(carId);
        if (car.isPresent()) {
            // Map CarBean to CarDTO
            CarBean carBean = car.get();
            return new CarDTO(carBean.getCarId(), carBean.getCarName(), carBean.getOwnerName(), carBean.getLocation(), carBean.getPricePerDay());
        }
        return null; // Or throw an exception if needed
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
