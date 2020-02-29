package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.HostelBlock;
import com.app.repository.HostelBlockRepository;


@RestController
@RequestMapping("/home")
public class HostelRestController {
	
	

	@Autowired
	private HostelBlockRepository hostelBlockService;
	
	@PostMapping("/saveDetails")
	public void saveDetails(@RequestBody HostelBlock hsb ) {
	    hostelBlockService.save(hsb);
	}
	 @GetMapping({"/", "/hello"})
	    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
	        model.addAttribute("name", name);
	        return "hello";
	    }
	

}
