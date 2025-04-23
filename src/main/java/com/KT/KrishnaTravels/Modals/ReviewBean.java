package com.KT.KrishnaTravels.Modals;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Review")
public class ReviewBean {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long ReviewId;
	 public Long getReviewId() {
		return ReviewId;
	}


	public void setReviewId(Long reviewId) {
		ReviewId = reviewId;
	}


	public Long getRevieweduserId() {
		return RevieweduserId;
	}


	public void setRevieweduserId(Long revieweduserId) {
		RevieweduserId = revieweduserId;
	}


	public String getReviewText() {
		return ReviewText;
	}


	public void setReviewText(String reviewText) {
		ReviewText = reviewText;
	}


	public Integer getReviewRating() {
		return ReviewRating;
	}


	public void setReviewRating(Integer reviewRating) {
		ReviewRating = reviewRating;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	public Long getReviewedDriverId() {
		return reviewedDriverId;
	}


	public void setReviewedDriverId(Long reviewedDriverId) {
		this.reviewedDriverId = reviewedDriverId;
	}


	private Long RevieweduserId;
	 
	 private String ReviewText;
	 
	  private Integer ReviewRating;
	  
	  private LocalDateTime createdAt;
	  
	  
	  private Long reviewedDriverId;
	 

}
