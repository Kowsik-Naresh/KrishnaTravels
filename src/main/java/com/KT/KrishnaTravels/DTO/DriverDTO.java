package com.KT.KrishnaTravels.DTO;

import java.time.LocalDate;

public class DriverDTO {

    private String driverName;
    private String mobileNumber;
    private byte[] profileImage;
    private byte[] licenseImage;
    private int experience;
    private LocalDate dateOfBirth;
    private String email;
    private String proofNumber;

    // Constructor, Getters and Setters
    public DriverDTO(String driverName, String mobileNumber, byte[] profileImage, byte[] licenseImage,
                     int experience, LocalDate dateOfBirth, String email, String proofNumber) {
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

    public byte[] getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(byte[] profileImage) {
        this.profileImage = profileImage;
    }

    public byte[] getLicenseImage() {
        return licenseImage;
    }

    public void setLicenseImage(byte[] licenseImage) {
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
}
