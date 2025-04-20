package com.KT.KrishnaTravels.Service;


import java.util.List;

import com.KT.KrishnaTravels.Modals.DriverBean;

public interface DriverService {
	
	/**
     * Fetches all drivers.
     *
     * @return a list of DriverBean objects representing all drivers.
     */
	public List<DriverBean> getAllDrivers();
	
	/**
     * Fetches a driver based on the provided driver ID.
     *
     * @param driverId the ID of the driver to be fetched.
     * @return a DriverBean object representing the driver with the given driver ID.
     */
	public DriverBean getDriverByDriverId(Long driverId);
	
	/**
     * Creates a new driver.
     *
     * @param driver the DriverBean object containing the driver's information to be created.
     * @return the created DriverBean object with the assigned ID and other relevant information.
     */
	public DriverBean createDriver(DriverBean driver);

}