package com.KT.KrishnaTravels.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.KT.KrishnaTravels.Modals.DriverBean;

@Repository
public interface DriverRepo  extends  JpaRepository<DriverBean,Long>{
	
	List<DriverBean> findAll();
	
	DriverBean findByDriverId(Long driverId);
	
	DriverBean save(DriverBean driver);
}