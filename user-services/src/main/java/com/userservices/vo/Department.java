package com.userservices.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
	private long id;
	private String deptName;
	private String deptAddress;
	private String deptCode;

}
