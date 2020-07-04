package com.example.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.test.Entity.Kontrasepsi;
import com.example.test.Entity.Propinsi;
import com.example.test.Service.KontrasepsiService;
import com.example.test.Service.PropinsiService;

@Controller
public class PointFController {
	
	@Autowired
	private KontrasepsiService service;
	
	@Autowired
	private PropinsiService service_propinsi;
	
	@RequestMapping(value = "/pointF", method = RequestMethod.GET)
	public String viewKontrasepsi(Model model) {
		Kontrasepsi kontrasepsiForm = new Kontrasepsi();
		Propinsi propinsiForm = new Propinsi();
		model.addAttribute("propinsiForm", propinsiForm);
		model.addAttribute("kontrasepsiForm", kontrasepsiForm);
		List<Kontrasepsi> listKontrasepsis = service.listAll();
		List<Propinsi> listPropinsis =  service_propinsi.listAll();
		model.addAttribute("listKontrasepsis",listKontrasepsis);
		model.addAttribute("listPropinsis",listPropinsis);
		return "pointF";	
	}

}
