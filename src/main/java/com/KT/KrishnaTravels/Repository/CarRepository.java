package com.KT.KrishnaTravels.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.KT.KrishnaTravels.Modals.CarBean;

@Repository
public interface CarRepository extends JpaRepository<CarBean, Long> {

	CarBean findByCarId(Long carId);
}
