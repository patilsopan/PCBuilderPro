package com.cdac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cdac.entity.Customer;
import com.cdac.entity.Employee;
import com.cdac.entity.Feedback;
import com.cdac.entity.Order;
import com.cdac.service.CustomerService;
import com.cdac.service.EmployeeService;
import com.cdac.service.FeedbackService;
import com.cdac.service.OrderService;

public class EmployeeController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private FeedbackService feedbackService;
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@ResponseBody
	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
	    return customerService.fetchAllCustomers();
	}
	
	@ResponseBody
	@GetMapping("/orders")
	public List<Order> getAllOrders() {
	    return orderService.fetchAllOrders();
	}
	
	@ResponseBody
	@GetMapping("/feedbacks")
	public List<Feedback> getAllFeedbacks() {
	    return feedbackService.fetchAllFeedbacks();
	}
	
	@ResponseBody
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
	    return employeeService.fetchAllEmployees();
	}
	
	@PutMapping("/updateemployee")
	public String employeeUpdate(@RequestBody Employee employee) {
		employeeService.update(employee);
		return "success";
	}
	
	@PutMapping("/updateorder")
	public String orderUpdate(@RequestBody Order order) {
		orderService.update(order);
		return "success";
	}
}
