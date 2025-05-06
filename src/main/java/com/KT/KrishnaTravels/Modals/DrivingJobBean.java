package com.KT.KrishnaTravels.Modals;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "driving_jobs")
public class DrivingJobBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobId;

    @Column(nullable = false)
    private String jobName;

    @Column(length = 1000)
    private String jobDescription;

    private String jobLocation;

    private String jobRequiredExp;

    private String jobAgeLimit;

    private String jobType; 

    private String jobSalary;

    private String jobLicenseType;

    private String jobShift;

    private String contactNumber;

    private String jobOwnerId;

    private String jobPostedByName;

    private String jobImageUrl;

    private LocalDateTime jobClosingDate;

    private Boolean isActive;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = updatedAt = LocalDateTime.now();
        if (isActive == null) isActive = true;
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }

    // Getters and Setters

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public String getJobRequiredExp() {
        return jobRequiredExp;
    }

    public void setJobRequiredExp(String jobRequiredExp) {
        this.jobRequiredExp = jobRequiredExp;
    }

    public String getJobAgeLimit() {
        return jobAgeLimit;
    }

    public void setJobAgeLimit(String jobAgeLimit) {
        this.jobAgeLimit = jobAgeLimit;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getJobSalary() {
        return jobSalary;
    }

    public void setJobSalary(String jobSalary) {
        this.jobSalary = jobSalary;
    }

    public String getJobLicenseType() {
        return jobLicenseType;
    }

    public void setJobLicenseType(String jobLicenseType) {
        this.jobLicenseType = jobLicenseType;
    }

    public String getJobShift() {
        return jobShift;
    }

    public void setJobShift(String jobShift) {
        this.jobShift = jobShift;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getJobOwnerId() {
        return jobOwnerId;
    }

    public void setJobOwnerId(String jobOwnerId) {
        this.jobOwnerId = jobOwnerId;
    }

    public String getJobPostedByName() {
        return jobPostedByName;
    }

    public void setJobPostedByName(String jobPostedByName) {
        this.jobPostedByName = jobPostedByName;
    }

    public String getJobImageUrl() {
        return jobImageUrl;
    }

    public void setJobImageUrl(String jobImageUrl) {
        this.jobImageUrl = jobImageUrl;
    }

    public LocalDateTime getJobClosingDate() {
        return jobClosingDate;
    }

    public void setJobClosingDate(LocalDateTime jobClosingDate) {
        this.jobClosingDate = jobClosingDate;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean active) {
        isActive = active;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
