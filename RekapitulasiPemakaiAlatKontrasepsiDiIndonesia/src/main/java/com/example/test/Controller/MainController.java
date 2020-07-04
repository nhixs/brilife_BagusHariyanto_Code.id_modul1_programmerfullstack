package com.example.test.Controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.test.Entity.Kontrasepsi;

public class MainController {
	
	@RequestMapping("")
	public String viewKontrasepsi(Model model) {
		model.addAttribute("index");
		return "index";	
	}

}
