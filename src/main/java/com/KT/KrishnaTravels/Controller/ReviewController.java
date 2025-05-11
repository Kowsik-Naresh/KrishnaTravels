package com.KT.KrishnaTravels.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.KT.KrishnaTravels.Modals.ReviewBean;
import com.KT.KrishnaTravels.Service.ReviewService;
import com.KT.KrishnaTravels.predefind.KrishnaTravelsResponseBean;

@RestController
@RequestMapping("/reviews") // Adjusted URL to be more RESTful
public class ReviewController {

    @Autowired 
    private ReviewService reviewService;

    @GetMapping
    public String getReviewModule() {
        return "Review Module";
    }

    /**
     * API call for saving review details for a driver or car by user
     *
     * @param reviewBean contains review details
     * @return KrishnaTravelsResponseBean contains saved review details
     */
    @PostMapping(value = "/saveReview")
    public KrishnaTravelsResponseBean saveReview(@RequestBody ReviewBean reviewBean) {
        KrishnaTravelsResponseBean response = new KrishnaTravelsResponseBean();
        // Save the review through the service layer
        response.setData(reviewService.saveReview(reviewBean));
        return response;
    }
}
