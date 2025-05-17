package com.KT.KrishnaTravels.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.KT.KrishnaTravels.Modals.ReviewBean;

@Repository
public interface ReviewRepo  extends JpaRepository<ReviewBean,Long>{

		 public  ReviewBean save(ReviewBean review);
		 List<ReviewBean> findByReviewedCarId(Long reviewedCarId);
		 List<ReviewBean> findByReviewedDriverId(Long reviewedDriverId);

}
