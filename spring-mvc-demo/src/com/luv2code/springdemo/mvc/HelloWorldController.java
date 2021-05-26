package com.luv2code.springdemo.mvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	// need a controller method to show the initial HTML form

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// need a controller method to read form data and
	// add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		// read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		// convert the data to all caps
		theName = theName.toUpperCase();
		// create the message 
		String result = "YO! " + theName; 
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	
	// 
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		// read the request parameter from the HTML form
		// String theName = request.getParameter("studentName"); NO LONGER NEEDED WITH REQUEST PARAM
		// convert the data to all caps
		theName = theName.toUpperCase();
		// create the message 
		String result = "Hello Sir! " + theName; 
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
}
