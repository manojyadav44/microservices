package com.department.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.department.entity.Department;
import com.department.service.DepartmentService;


@RestController
@RequestMapping("/departments")
public class DepartmentController<departmentService> {

	private static final java.util.logging.Logger log = java.util.logging.Logger
			.getLogger(DepartmentController.class.getName());

	@Autowired
	DepartmentService departmentService;

	@PostMapping("/")
	public Department saveDept(@RequestBody Department dept) {
		log.info("Inside DeptController ---");
		//Department deptmnt=departmentService.saveDept(dept);
		//log.info(deptmnt.toString());
		return departmentService.saveDept(dept);
		}

	@GetMapping("/{deptId}")
	 public Department findByDeptId(@PathVariable("deptId")Long deptId) {				
		return departmentService.findByDeptId(deptId);
	 }
}
