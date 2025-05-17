package com.KT.KrishnaTravels.DTO;

import java.util.List;

import com.KT.KrishnaTravels.Modals.DriverBean;

public class AllDriversDTO {
 private DriverBean Driver;
 private Integer rating;
public DriverBean getDriver() {
	return Driver;
}
public void setDriver(DriverBean driver) {
	Driver = driver;
}
public Integer getRating() {
	return rating;
}
public void setRating(Integer rating) {
	this.rating = rating;
}
 
}
