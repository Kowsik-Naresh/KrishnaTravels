package com.KT.KrishnaTravels.Modals;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "drivers")
public class DriverBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "driver_id")
    private Long driverId;

    @Column(nullable = false)
    private String driverName;

    @Column(length = 15, nullable = false)
    private String mobileNumber;

     
    @Column(name = "profile_image",columnDefinition="TEXT")
    private String profileImage;

      
    @Column(name = "license_image",columnDefinition="TEXT")
    private String licenseImage;

    @Column
    private int experience;

    @Column
    private LocalDate dateOfBirth;

    @Column
    private String email;

    @Column(name = "proof_number")
    private String proofNumber;

    // Constructors
    public DriverBean() {}

    public DriverBean(Long driverId, String driverName, String mobileNumber,
                      String profileImage, String licenseImage, int experience,
                      LocalDate dateOfBirth, String email, String proofNumber) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.mobileNumber = mobileNumber;
        this.profileImage = profileImage;
        this.licenseImage = licenseImage;
        this.experience = experience;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.proofNumber = proofNumber;
    }

    // Getters and Setters
    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getLicenseImage() {
        return licenseImage;
    }

    public void setLicenseImage(String licenseImage) {
        this.licenseImage = licenseImage;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProofNumber() {
        return proofNumber;
    }

    public void setProofNumber(String proofNumber) {
        this.proofNumber = proofNumber;
    }

    @Override
    public String toString() {
        return "DriverBean{" +
                "driverId=" + driverId +
                ", driverName='" + driverName + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", experience=" + experience +
                ", dateOfBirth=" + dateOfBirth +
                ", email='" + email + '\'' +
                ", proofNumber='" + proofNumber + '\'' +
                '}';
    }
}