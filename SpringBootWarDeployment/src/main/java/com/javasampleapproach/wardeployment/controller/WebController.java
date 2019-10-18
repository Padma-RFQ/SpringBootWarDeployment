package com.javasampleapproach.wardeployment.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Employee;

@RestController
public class WebController {
	   @RequestMapping("/")
	    public List<Employee> getEmployees()
	    {
	      List<Employee> employeesList = new ArrayList<Employee>();
	      employeesList.add(new Employee(1,"lokesh","gupta","howtodoinjava@gmail.com"));
	      return employeesList;
	    }
}