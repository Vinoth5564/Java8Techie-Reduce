package com.techie.dto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.techie.modle.Employee;

public class EmployeeDataBase {

	public static List<Employee> getEmployees(){
		
		List<Employee> listEmp = Stream.of(new Employee(1, 95656, "A", "Emp1"),
				new Employee(5, 956562, "A", "Emp2"),
				new Employee(2, 956356, "B", "Emp3"),
				new Employee(3, 95646, "B", "Emp4"),
				new Employee(4, 95556, "A", "Emp15"))
				.collect(Collectors.toList());
		return listEmp;
		
	}
	
}
