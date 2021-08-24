package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {
	@GetMapping("home")
	public String home() {
		return "home";
	}
	
	@PostMapping("details")
	public String details(@RequestParam("emp_name")String emp_name,
			@RequestParam("emp_id")String emp_id,
			@RequestParam("emp_email")String emp_email,
			@RequestParam("emp_no")String emp_no, ModelMap modelMap) {
		modelMap.put("emp_name", emp_name);
		modelMap.put("emp_id", emp_id);
		modelMap.put("emp_email", emp_email);
		modelMap.put("emp_no", emp_no);
		return "details";
	}
}
