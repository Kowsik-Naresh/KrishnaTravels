package com.KT.KrishnaTravels.Service;

import java.util.List;
import com.KT.KrishnaTravels.Modals.UserBean;

/**
 * Service interface for managing user-related operations in the Krishna Travels application.
 */
public interface UserService {

    /**
     * Creates a new user.
     *
     * @param user the {@link UserBean} object containing user details
     * @return the created {@link UserBean} with any generated fields (e.g., ID)
     */
    public UserBean createUser(UserBean user);

    /**
     * Finds a user by their mobile number.
     *
     * @param mobileNumber the user's mobile number
     * @return the {@link UserBean} if found, or {@code null} if not found
     */
    public UserBean findUserByMobileNumber(String mobileNumber);

    /**
     * Finds a user by their email address.
     *
     * @param email the user's email address
     * @return the {@link UserBean} if found, or {@code null} if not found
     */
    public UserBean findUserByEmail(String email);

    /**
     * Retrieves a list of all users.
     *
     * @return a list of all {@link UserBean} objects
     */
    public List<UserBean> findAllUsers();
}
