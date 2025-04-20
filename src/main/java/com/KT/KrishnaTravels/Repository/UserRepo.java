package com.KT.KrishnaTravels.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.KT.KrishnaTravels.Modals.UserBean;

public interface UserRepo extends JpaRepository<UserBean,Long> {
	
	public UserBean findByMobileNumber(String mobile_number);
	
	public List<UserBean> findAll();
	
	public UserBean findByEmail(String email);
	
	public UserBean save(UserBean user);
	

}
