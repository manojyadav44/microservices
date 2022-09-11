package com.userservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.userservices.entity.UserInfo;
import com.userservices.repository.UserRepository;
import com.userservices.vo.Department;
import com.userservices.vo.ResponseTemplateVO;

@Service
public class UserService {
	private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(UserService.class.getName());

	public static final String URL = "http://localhost:9001/departments/";
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Autowired
	private RestTemplate restTemplate;

	public UserInfo saveUser(UserInfo user) {
		log.info("InSide UserService- saveUser() method--");
		return userRepository.save(user);

	}

	public ResponseTemplateVO getUserwithDept(Long userId) {
		log.info("InSide UserService-ResponseTemplateVO- getUserwithDept() method-- and get user details based on user Id = " + userId);
		ResponseTemplateVO vo=new ResponseTemplateVO();		
		UserInfo userdata= userRepository.findByUserId(userId);	
		
		//Long userId=userdata.getDeptId();
		log.info("InSide UserService-ResponseTemplateVO- Calling service call to Department service to get the department object= " );
		Department department=restTemplate.getForObject("http://localhost:9001/departments/"+userdata.getDeptId(),Department.class);
		vo.setUserInfo(userdata);
		vo.setDepartment(department);
		return vo;
	}

}
