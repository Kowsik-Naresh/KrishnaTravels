package com.KT.KrishnaTravels.Modals;

import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class CarBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String carName;
    private String ownerName;
    private String ownerContact;
    private String location;
    private String pricePerDay;
    private String seatingCapacity;
    private String fuelType;
    private String transmission;
    private String carNumber;

    @Column(length = 100000)
    private String carPhoto; // base64 encoded image

    // Constructors
    public CarBean() {}

    public CarBean(String carName, String ownerName, String ownerContact, String location,
                   String pricePerDay, String seatingCapacity, String fuelType,
                   String transmission, String carNumber, String carPhoto) {
        this.carName = carName;
        this.ownerName = ownerName;
        this.ownerContact = ownerContact;
        this.location = location;
        this.pricePerDay = pricePerDay;
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.carNumber = carNumber;
        this.carPhoto = carPhoto;
    }

    // Getters and Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getCarName() { return carName; }

    public void setCarName(String carName) { this.carName = carName; }

    public String getOwnerName() { return ownerName; }

    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    public String getOwnerContact() { return ownerContact; }

    public void setOwnerContact(String ownerContact) { this.ownerContact = ownerContact; }

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }

    public String getPricePerDay() { return pricePerDay; }

    public void setPricePerDay(String pricePerDay) { this.pricePerDay = pricePerDay; }

    public String getSeatingCapacity() { return seatingCapacity; }

    public void setSeatingCapacity(String seatingCapacity) { this.seatingCapacity = seatingCapacity; }

    public String getFuelType() { return fuelType; }

    public void setFuelType(String fuelType) { this.fuelType = fuelType; }

    public String getTransmission() { return transmission; }

    public void setTransmission(String transmission) { this.transmission = transmission; }

    public String getCarNumber() { return carNumber; }

    public void setCarNumber(String carNumber) { this.carNumber = carNumber; }

    public String getCarPhoto() { return carPhoto; }

    public void setCarPhoto(String carPhoto) { this.carPhoto = carPhoto; }
}
