package com.techie.controller;

import java.util.Arrays;
import java.util.List;
import com.techie.dto.EmployeeDataBase;
public class Service {
	public static void main(String[] args) {	

		List<Integer> numbers = Arrays.asList(8,6,43,78,9);	
		
		
		int nmber = numbers.stream().reduce(0,(a,b) -> a+b);
		System.out.println(nmber);
		int numSumOfreferece = numbers.stream().reduce(0,(a,b)-> a>b?a:b);
		System.out.println(numSumOfreferece);		
		double avg =  EmployeeDataBase.getEmployees().stream().filter(emp -> emp.getAvg().equalsIgnoreCase("A"))
				.map(emp -> emp.getSal())
				.mapToDouble(i->i)
				.average().getAsDouble();
		System.out.println(avg);
		double sal = EmployeeDataBase.getEmployees().stream().filter(emp -> emp.getAvg().equalsIgnoreCase("A"))
				.map(emp -> emp.getSal())
				.mapToDouble(i -> i)
				.sum();
		System.out.println(sal);	

	}
}
