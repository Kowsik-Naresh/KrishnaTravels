package com.KT.KrishnaTravels.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.KT.KrishnaTravels.Modals.UserBean;
import com.KT.KrishnaTravels.Repository.UserRepo;
import com.KT.KrishnaTravels.Service.UserService;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	UserRepo userRepo;

	@Override
	public UserBean createUser(UserBean user) {
		return userRepo.save(user);
	}

	@Override
	public UserBean findUserByMobileNumber(String mobileNumber) {
		return userRepo.findByMobileNumber(mobileNumber);
	}

	@Override
	public UserBean findUserByEmail(String email) {
		return userRepo.findByEmail(email);
	}

	@Override
	public List<UserBean> findAllUsers() {
		return userRepo.findAll();
	}

}
