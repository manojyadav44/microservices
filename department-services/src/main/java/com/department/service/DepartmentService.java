package com.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.entity.Department;
import com.department.repository.DepartmentRepository;

@Service
public class DepartmentService {
	private static final java.util.logging.Logger log = java.util.logging.Logger
			.getLogger(DepartmentService.class.getName());
	@Autowired
	DepartmentRepository departmentRepository;

	public Department saveDept(Department dept) {
		log.info("Inside DeptService---");
		return departmentRepository.save(dept);
	}

	@SuppressWarnings("deprecation")
	public Department findByDeptId(Long deptId) {
		// TODO Auto-generated method stub
		return departmentRepository.getById(deptId);
	}

}
