package com.example.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.test.Entity.Kontrasepsi;
import com.example.test.Service.KontrasepsiService;

@Controller
public class KontrasepsiController {
	
	@Autowired
	private KontrasepsiService service;
	
	@RequestMapping(value = "/kontrasepsi", method = RequestMethod.GET)
	public String viewKontrasepsi(Model model) {
		Kontrasepsi kontrasepsiForm = new Kontrasepsi();
		model.addAttribute("kontrasepsiForm", kontrasepsiForm);
		List<Kontrasepsi> listKontrasepsis = service.listAll();
		model.addAttribute("listKontrasepsis",listKontrasepsis);
		return "kontrasepsi";	
	}
	
	@RequestMapping("/new_kontrasepsi")
	public String showNewKontrasepsiPage(Model model) {
		Kontrasepsi kontrasepsi = new Kontrasepsi();
		model.addAttribute("kontrasepsi", kontrasepsi);
		
		return "new_kontrasepsi";
	}
	
	@RequestMapping(value = "/save_kontrasepsi", method = RequestMethod.POST)
	public String saveKontrasepsi(@ModelAttribute("kontrasepsi")Kontrasepsi kontrasepsi) {
		service.save(kontrasepsi);
		return "redirect:/kontrasepsi";
	}
	
	@RequestMapping("/edit_kontrasepsi/{id}")
	public ModelAndView showEditKontrasepsiPage(@PathVariable(name = "id")int id) {
		ModelAndView mav = new ModelAndView("edit_propinsi");
		Kontrasepsi kontrasepsi = service.get(id);
		mav.addObject("kontrasepsi", kontrasepsi);
		return mav;
	}
	
	@RequestMapping("/delete_kontrasepsi/{id}")
	public String deleteKontrasepsi(@PathVariable(name = "id")int id) {
		service.delete(id);
		return "redirect:/propinsi";
	}
	

}
