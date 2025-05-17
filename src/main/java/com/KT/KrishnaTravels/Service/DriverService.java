package com.KT.KrishnaTravels.Service;


import java.util.List;

import com.KT.KrishnaTravels.DTO.AllDriversDTO;
import com.KT.KrishnaTravels.DTO.DriverDTO;
import com.KT.KrishnaTravels.DTO.ReviewDetailsDTO;
import com.KT.KrishnaTravels.Modals.DriverBean;
import com.KT.KrishnaTravels.Modals.ReviewBean;

public interface DriverService {
	
	/**
     * Fetches all drivers.
     *
     * @return a list of DriverBean objects representing all drivers.
     */
	public List<AllDriversDTO> getAllDrivers();
	 
	/**
     * Fetches a driver based on the provided driver ID.
     *
     * @param driverId the ID of the driver to be fetched.
     * @return a driverDTO object representing the driver with the given driver ID.
     */
	public DriverDTO getDriverByDriverId(Long driverId);
	
	/**
     * Creates a new driver.
     *
     * @param driver the DriverBean object containing the driver's information to be created.
     * @return the created DriverBean object with the assigned ID and other relevant information.
     */
	public DriverBean createDriver(DriverBean driver);
     
	
	public List<ReviewDetailsDTO> getDriverReviewsByDriverId(Long driverId);

}