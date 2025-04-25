package com.KT.KrishnaTravels.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.KT.KrishnaTravels.Modals.ReviewBean;
import com.KT.KrishnaTravels.Service.ReviewService;
import com.KT.KrishnaTravels.predefind.KrishnaTravelsResponseBean;

@RestController
@RequestMapping(value="review")
public class ReviewController {
	
	@Autowired ReviewService reviewService;
	
	public String getReviewModule() {
		return "ReviewModule";
		
	}
	
	/** 
	 * 
	 * API call for saving review details for a driver by user 
	 * 
	 * @param ReviewBean contains review details
	 * @return  KrishnaTravelsResponseBean contains saved review details
	 * 
	 * */
	@PostMapping(value="/saveReview")
	public KrishnaTravelsResponseBean saveReview( @RequestBody ReviewBean reviewBean)
	{
	KrishnaTravelsResponseBean response = new KrishnaTravelsResponseBean();
	
	response.setData(reviewService.saveReview(reviewBean));
	return response;
	}
}
