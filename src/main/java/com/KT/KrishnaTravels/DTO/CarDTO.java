package com.KT.KrishnaTravels.DTO;

public class CarDTO {

    private Long carId;
    private String carName;
    private String ownerName;
    private String ownerContact;
    private String location;
    private String pricePerDay;
    private String seatingCapacity;
    private String fuelType;
    private String transmission;
    private String carNumber;
    private boolean isActive;
    private String carPhoto;

    // Constructor
    public CarDTO(Long carId, String carName, String ownerName, String ownerContact, String location,
                  String pricePerDay, String seatingCapacity, String fuelType, String transmission,
                  String carNumber, boolean isActive, String carPhoto) {
        this.carId = carId;
        this.carName = carName;
        this.ownerName = ownerName;
        this.ownerContact = ownerContact;
        this.location = location;
        this.pricePerDay = pricePerDay;
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.carNumber = carNumber;
        this.isActive = isActive;
        this.carPhoto = carPhoto;
    }

    // Getters and Setters
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

    public String getOwnerContact() {
        return ownerContact;
    }

    public void setOwnerContact(String ownerContact) {
        this.ownerContact = ownerContact;
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

    public String getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(String seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getCarPhoto() {
        return carPhoto;
    }

    public void setCarPhoto(String carPhoto) {
        this.carPhoto = carPhoto;
    }
}
