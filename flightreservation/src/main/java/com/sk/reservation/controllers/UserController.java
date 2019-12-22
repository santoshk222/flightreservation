package com.sk.reservation.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sk.reservation.entities.User;
import com.sk.reservation.repos.UserRepository;
import com.sk.reservation.util.FlightConstant;
import com.sk.reservation.util.UserConstants;

@Controller
@RequestMapping(UserConstants.USER_ROOT_PATH)
public class UserController {

	public static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserRepository userRepo;

	@RequestMapping(value = UserConstants.USER_SHOW_PATH)
	public String showRegistrationPage() {
		return UserConstants.USER_SHOW_FILE;
	}

	@RequestMapping(value = UserConstants.USER_REGISTER_PATH, method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap map) {
		User savedUser = userRepo.save(user);
		map.addAttribute("msg", "User is registred with username: " + savedUser.getFirstname());
		return UserConstants.USER_SHOW_FILE;
	}

	@RequestMapping(value = UserConstants.USER_SHOW_LOGIN_PATH)
	public String showLogin() {
		return UserConstants.USER_SHOW_LOGIN_FILE;
	}

	@RequestMapping(value = UserConstants.USER_LOGIN_PATH)
	public String Login(@RequestParam("username") String username, @RequestParam("password") String password,
	                    ModelMap map) {
		User user = null;
		try {
			user = userRepo.findByEmail(username);
			if (user != null && user.getPassword() != null && user.getPassword().equals(password)) {
				map.addAttribute("msg", "Logged in!!");
				return FlightConstant.FLIGHT_SEARCH_FILE;
			} else {
				map.addAttribute("msg", "Login unsuccessfull!!");
			}
		} catch (Exception e) {
			LOGGER.debug("Error in Login: " + e.getMessage());
			map.addAttribute("msg", "Login unsuccessfull!!");
		}
		return UserConstants.USER_SHOW_LOGIN_FILE;
	}

}
