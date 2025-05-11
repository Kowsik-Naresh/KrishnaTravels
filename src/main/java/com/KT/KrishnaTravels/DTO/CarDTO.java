package com.KT.KrishnaTravels.DTO;

public class CarDTO {

    private Long carId;
    private String carName;
    private String ownerName;
    private String location;
    private String pricePerDay;

    // Constructor, Getters, and Setters

    public CarDTO(Long carId, String carName, String ownerName, String location, String pricePerDay) {
        this.carId = carId;
        this.carName = carName;
        this.ownerName = ownerName;
        this.location = location;
        this.pricePerDay = pricePerDay;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(String pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}
