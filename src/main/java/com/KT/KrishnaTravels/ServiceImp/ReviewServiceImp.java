package com.KT.KrishnaTravels.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.KT.KrishnaTravels.Modals.ReviewBean;
import com.KT.KrishnaTravels.Repository.ReviewRepo;

import com.KT.KrishnaTravels.Service.ReviewService;

@Service
public class ReviewServiceImp implements ReviewService {

	@Autowired ReviewRepo reviewRepo;
	@Override
	public ReviewBean saveReview(ReviewBean reviewBean) {
		
		return reviewRepo.save(reviewBean) ;
	}
	
	

}
