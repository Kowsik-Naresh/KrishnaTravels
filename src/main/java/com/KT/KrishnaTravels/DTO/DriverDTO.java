package com.KT.KrishnaTravels.DTO;

import java.util.List;

import com.KT.KrishnaTravels.Modals.DriverBean;

public class DriverDTO {


    private List<ReviewDetailsDTO> reviewDetailsDTOs;
    private DriverBean driverBean;
    private String driverRating;
    public String getDriverRating() {
		return driverRating;
	}
	public void setDriverRating(String driverRating) {
		this.driverRating = driverRating;
	}
	public DriverDTO() {
    	
    }
    public DriverBean getDriverBean() {
		return driverBean;
	}

	public void setDriverBean(DriverBean driverBean) {
		this.driverBean = driverBean;
	}

	public List<ReviewDetailsDTO> getReviewBean() {
		return reviewDetailsDTOs;
	}

	public void setReviewBean(List<ReviewDetailsDTO> reviewDetailsDTOs) {
		this.reviewDetailsDTOs = reviewDetailsDTOs;
	}

	
}
