package com.KT.KrishnaTravels.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.KT.KrishnaTravels.Modals.DriverBean;
import com.KT.KrishnaTravels.Service.DriverService;
import com.KT.KrishnaTravels.predefind.KrishnaTravelsResponseBean;


@RequestMapping("/drivers")
@RestController
public class DriverController {
	
	@Autowired
	DriverService driverService;

    @GetMapping
    public String getDriversModule() {
        return "Drivers module";
    }
    
	/**
	 * API for getting all Driver
	 * 
	 * @return List<KrishnaTravelsResponseBean> containing all drivers data
	 */   
    @GetMapping("/allDrivers")
    public KrishnaTravelsResponseBean getAllDrivers() {
    	KrishnaTravelsResponseBean response=new KrishnaTravelsResponseBean();
    	response.setData(driverService.getAllDrivers());
    	return response;
    }
    
    /**
     * API for getting driver based on driverId
     * 
     * @param driverId the ID of the driver to retrieve
     * @return KrishnaTravelsResponseBean containing driver data
     */
    @GetMapping("/getDriverById")
    public KrishnaTravelsResponseBean getDriverById(@RequestParam(required=true) Long driverId) {
    	KrishnaTravelsResponseBean response=new KrishnaTravelsResponseBean();
    	response.setData(driverService.getDriverByDriverId(driverId));
    	return response;
    }
    
	/**
	 * API for creating Driver
	 * @param DriverBean
	 * @return KrishnaTravelsResponseBean with success or error message
	 */
    @PostMapping("/createDriver")
    public KrishnaTravelsResponseBean createDriver(@RequestBody DriverBean driver) {
    	KrishnaTravelsResponseBean response=new KrishnaTravelsResponseBean();
    	response.setData(driverService.createDriver(driver));
    	return response;
    }
    
	/**
	 * 
	 * API for getting all reviews of particular user
	 * @param driverId
	 * @return KrishnaTravelsResponseBean containing reviews data of driver
	 */
    @GetMapping("/getDriverReviews")
    public KrishnaTravelsResponseBean getDriverReviewsByDriverId(@RequestParam(required=true) Long driverId) {
    	KrishnaTravelsResponseBean response=new KrishnaTravelsResponseBean();
    	response.setData(driverService.getDriverReviewsByDriverId(driverId));
    	return response;

    }
    
}

