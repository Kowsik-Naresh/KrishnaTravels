package com.KT.KrishnaTravels.ServiceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.KT.KrishnaTravels.DTO.DriverDTO;
import com.KT.KrishnaTravels.DTO.ReviewDetailsDTO;
import com.KT.KrishnaTravels.Modals.DriverBean;
import com.KT.KrishnaTravels.Modals.ReviewBean;
import com.KT.KrishnaTravels.Modals.UserBean;
import com.KT.KrishnaTravels.Repository.DriverRepo;
import com.KT.KrishnaTravels.Service.DriverService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

@Service
public class DriverServiceImp implements DriverService{
    
	@Autowired
	DriverRepo driverRepo;
	
	@Autowired
	private EntityManager entityManager;

	
	@Override
	public List<DriverBean> getAllDrivers() {	
		return driverRepo.findAll();
	}

	@Override
	public DriverDTO getDriverByDriverId(Long driverId) {
		DriverDTO driverDTO=new DriverDTO();
		driverDTO.setDriverBean(driverRepo.findByDriverId(driverId));
		driverDTO.setReviewBean(getDriverReviewsByDriverId(driverId));
		return driverDTO;
	}

	@Override
	public DriverBean createDriver(DriverBean driver) {
		return driverRepo.save(driver);
	}

	@Override
	public List<ReviewDetailsDTO> getDriverReviewsByDriverId(Long driverId) {

		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Object[]> query = cb.createQuery(Object[].class);
		Root<ReviewBean> reviewRoot = query.from(ReviewBean.class);
		Join<ReviewBean, UserBean> userJoin = reviewRoot.join("user");

		Predicate driverPredicate = cb.equal(reviewRoot.get("reviewedDriverId"), driverId);

		query.multiselect(reviewRoot, userJoin.get("userName"), userJoin.get("profileImage"));
		query.where(driverPredicate);

		List<Object[]> result = entityManager.createQuery(query).getResultList();
		List<ReviewDetailsDTO> reviewDetailsDTOs = new ArrayList<>();

		for (Object[] entry : result) {
			ReviewBean review = (ReviewBean) entry[0];
			String userName = (String) entry[1];
			String userProfileImage = (String) entry[2];
			reviewDetailsDTOs.add(new ReviewDetailsDTO(review, userName, userProfileImage));
		}
		return reviewDetailsDTOs;

	}

}