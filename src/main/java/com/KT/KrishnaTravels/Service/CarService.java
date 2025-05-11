package com.KT.KrishnaTravels.Service;

import com.KT.KrishnaTravels.DTO.CarDTO;
import com.KT.KrishnaTravels.Modals.CarBean;
import com.KT.KrishnaTravels.Modals.ReviewBean;

import java.util.List;

public interface CarService {

    /**
     * Fetches all cars.
     *
     * @return a list of CarBean objects representing all cars.
     */
    public List<CarBean> getAllCars();

    /**
     * Fetches a car based on the provided car ID.
     *
     * @param carId the ID of the car to be fetched.
     * @return a CarDTO object representing the car with the given car ID.
     */
    public CarDTO getCarByCarId(Long carId);

    /**
     * Creates a new car.
     *
     * @param car the CarBean object containing the car's information to be created.
     * @return the created CarBean object with the assigned ID and other relevant information.
     */
    public CarBean createCar(CarBean car);

    /**
     * Fetches reviews for a car based on car ID.
     *
     * @param carId the ID of the car whose reviews are to be fetched.
     * @return a list of ReviewBean objects representing reviews for the car.
     */
    public List<ReviewBean> getCarReviewsByCarId(Long carId);
}
