package com.userservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userservices.entity.UserInfo;
import com.userservices.service.UserService;
import com.userservices.vo.ResponseTemplateVO;

@RestController
@RequestMapping("/users")
public class UserController {
	private static final java.util.logging.Logger log = java.util.logging.Logger
			.getLogger(UserController.class.getName());
	@Autowired
	private UserService userService;

	@PostMapping("/")
	public UserInfo saveUser(@RequestBody UserInfo user) {
		log.info("InSide UserController- saveUser() method--");
		return userService.saveUser(user);
	}

	@GetMapping("/{userId}")
	public ResponseTemplateVO getUserwithDept(@PathVariable("userId") Long id) {
		log.info("InSide UserController- getUserById() method-- and search Id = " + id);
		return userService.getUserwithDept(id);

	}

}
