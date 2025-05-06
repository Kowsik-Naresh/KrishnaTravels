package com.KT.KrishnaTravels.DTO;

import com.KT.KrishnaTravels.Modals.ReviewBean;

public class ReviewDetailsDTO {
	
	private ReviewBean reviewBean;
	private String userName;
	public ReviewBean getReviewBean() {
		return reviewBean;
	}
	public void setReviewBean(ReviewBean reviewBean) {
		this.reviewBean = reviewBean;
	}
	public ReviewDetailsDTO(ReviewBean reviewBean, String userName, String userProfileImage) {
		super();
		this.reviewBean = reviewBean;
		this.userName = userName;
		this.userProfileImage = userProfileImage;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserProfileImage() {
		return userProfileImage;
	}
	public void setUserProfileImage(String userProfileImage) {
		this.userProfileImage = userProfileImage;
	}
	private String userProfileImage;

}
