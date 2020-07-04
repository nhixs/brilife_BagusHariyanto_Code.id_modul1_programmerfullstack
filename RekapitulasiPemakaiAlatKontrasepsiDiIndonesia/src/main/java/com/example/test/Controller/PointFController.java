package com.example.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.test.Entity.Kontrasepsi;
import com.example.test.Entity.PemakaiKontrasepsi;
import com.example.test.Entity.Propinsi;
import com.example.test.Service.KontrasepsiService;
import com.example.test.Service.PemakaiKontrasepsiService;
import com.example.test.Service.PropinsiService;

@Controller
public class PointFController {
	
	@Autowired
	private KontrasepsiService service;
	
	@Autowired
	private PropinsiService service_propinsi;
	
	@Autowired
	private PemakaiKontrasepsiService servicePemakai;
	
	@RequestMapping(value = "/data_entry", method = RequestMethod.GET)
	public String viewAddPage(Model model) {
		Kontrasepsi kontrasepsiForm = new Kontrasepsi();
		Propinsi propinsiForm = new Propinsi();
		
		model.addAttribute("propinsiForm", propinsiForm);
		model.addAttribute("kontrasepsiForm", kontrasepsiForm);
		
		List<Kontrasepsi> listKontrasepsis = service.listAll();
		List<Propinsi> listPropinsis =  service_propinsi.listAll();
		
		model.addAttribute("listKontrasepsis",listKontrasepsis);
		model.addAttribute("listPropinsis",listPropinsis);
		model.addAttribute("pemakaiKontrasepsi", new PemakaiKontrasepsi());
		return "data_entry";	
	}
	
	@RequestMapping(value = "list_pemakai", method = RequestMethod.GET)
	public String viewListPemakai(Model model) {
		List<PemakaiKontrasepsi>listPemakaiKontrasepsis =  servicePemakai.listAll();
		model.addAttribute("listPemakaiKontrasepsis",listPemakaiKontrasepsis);
		return "list_pemakai";
	}
	
	@RequestMapping(value = "/save_pemakai", method = RequestMethod.POST)
	public String savePemakai(@ModelAttribute("pemakaiKontrasepsi")PemakaiKontrasepsi pemakaiKontrasepsi) {
		servicePemakai.save(pemakaiKontrasepsi);
		return "redirect:/list_pemakai";
	}
	
	

}
