package com.KT.KrishnaTravels.Modals;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Review")
public class ReviewBean {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ReviewId;
    
    @Column(name = "reviewed_user_id")
    private Long RevieweduserId;

    private String ReviewText;

    private Integer ReviewRating;

    private LocalDateTime createdAt;
    
    // For driver reviews
    @Column(name = "reviewed_driver_id")
    private Long reviewedDriverId;
    
    
    
    // For car reviews
    @Column(name = "reviewed_car_id")
    private Long reviewedCarId; // New field for car review

    // Relationship with DriverBean
    @ManyToOne
    @JoinColumn(name = "reviewed_driver_id", referencedColumnName = "driver_id", insertable = false, updatable = false)
    private DriverBean driver;

    @ManyToOne
    @JoinColumn(name = "car_id", referencedColumnName = "car_id") 
    private CarBean car;


    // Relationship with UserBean (Reviewer's info)
    @ManyToOne
    @JoinColumn(name = "reviewed_user_id", referencedColumnName = "user_id", insertable = false, updatable = false)
    private UserBean user;

    // Getters and Setters
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

    public Long getReviewedCarId() {
        return reviewedCarId; // Getter for car review
    }

    public void setReviewedCarId(Long reviewedCarId) {
        this.reviewedCarId = reviewedCarId; // Setter for car review
    }

    public DriverBean getDriver() {
        return driver;
    }

    public void setDriver(DriverBean driver) {
        this.driver = driver;
    }

    public CarBean getCar() {
        return car;
    }

    public void setCar(CarBean car) {
        this.car = car;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }
}
