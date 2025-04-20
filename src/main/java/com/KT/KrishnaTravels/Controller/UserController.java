package com.KT.KrishnaTravels.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.KT.KrishnaTravels.Modals.UserBean;
import com.KT.KrishnaTravels.Service.UserService;
import com.KT.KrishnaTravels.predefind.KrishnaTravelsResponseBean;

/**
 * REST controller for handling user-related operations in the Krishna Travels application.
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    /**
     * Test endpoint to confirm user module is working.
     *
     * @return a confirmation string
     */
    @GetMapping
    public String getCarModule() {
        return "User Module";
    }

    /**
     * Retrieves all users from the system.
     *
     * @return a {@link KrishnaTravelsResponseBean} containing a list of all users and a success or error message
     */
    @GetMapping(value = "/getAllUsers")
    public KrishnaTravelsResponseBean getAllUer() {
        KrishnaTravelsResponseBean response = new KrishnaTravelsResponseBean();
        try {
            response.setData(userService.findAllUsers());
            response.setSuccessMSG("All user details fetched successfully");
        } catch (Exception e) {
            response.setData(e.toString());
            response.setErrorMSG("Failure in fetching user details");
        }
        return response;
    }

    /**
     * Creates a new user in the system.
     *
     * @param user the {@link UserBean} object to be created
     * @return a {@link KrishnaTravelsResponseBean} containing the created user and a success or error message
     */
    @PostMapping(value = "/createUser")
    public KrishnaTravelsResponseBean creteUser(@RequestBody UserBean user) {
        KrishnaTravelsResponseBean response = new KrishnaTravelsResponseBean();
        try {
            response.setData(userService.createUser(user));
            response.setSuccessMSG("User created successfully");
        } catch (Exception e) {
            response.setData(e.toString());
            response.setErrorMSG("Failure at user creation");
        }
        return response;
    }

    /**
     * Finds a user by their mobile number.
     *
     * @param mobileNumber the mobile number of the user
     * @return a {@link KrishnaTravelsResponseBean} containing the user data and a success or error message
     */
    @GetMapping(value = "/findUserByMoileNumber")
    public KrishnaTravelsResponseBean findUserByMoileNumber(@RequestParam String mobileNumber) {
        KrishnaTravelsResponseBean response = new KrishnaTravelsResponseBean();
        try {
            response.setData(userService.findUserByMobileNumber(mobileNumber));
            if(response.getData()==null) {
            	response.setIsAutorised(false);
            }else {
            	response.setIsAutorised(true);
            }
            response.setSuccessMSG("User fetched successfully by mobile number");
        } catch (Exception e) {
            response.setData(e.toString());
            response.setErrorMSG("Failure in finding user by mobile number");
        }
        return response;
    }

    /**
     * Finds a user by their email address.
     *
     * @param email the email address of the user
     * @return a {@link KrishnaTravelsResponseBean} containing the user data and a success or error message
     */
    @GetMapping(value = "/findUserByEmail")
    public KrishnaTravelsResponseBean findUserByEmail(@RequestParam String email) {
        KrishnaTravelsResponseBean response = new KrishnaTravelsResponseBean();
        try {
            response.setData(userService.findUserByEmail(email));
            if(response.getData()==null) {
            	response.setIsAutorised(false);
            }else {
            	response.setIsAutorised(true);
            }
            response.setSuccessMSG("User fetched successfully by email");
        } catch (Exception e) {
            response.setData(e.toString());
            response.setErrorMSG("Failure in finding user by email");
        }
        return response;
    }
}
