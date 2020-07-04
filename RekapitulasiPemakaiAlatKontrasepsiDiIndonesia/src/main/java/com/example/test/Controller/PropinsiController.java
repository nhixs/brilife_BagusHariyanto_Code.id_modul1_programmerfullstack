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

import com.example.test.Entity.Propinsi;
import com.example.test.Service.PropinsiService;


@Controller
public class PropinsiController {
	
	@Autowired
	private PropinsiService service;
	
	@RequestMapping(value = "/propinsi", method = RequestMethod.GET)
	public String viewPropinsi(Model model) {
		Propinsi propinsiForm = new Propinsi();
		model.addAttribute("propinsiForm",propinsiForm);
		List<Propinsi> listPropinsis = service.listAll();
		model.addAttribute("listPropinsis", listPropinsis);
		return "propinsi";
	}
	
	@RequestMapping("/new_propinsi")
	public String showNewPropinsiPage(Model model) {
		Propinsi propinsi = new Propinsi();
		model.addAttribute("propinsi", propinsi);
		
		return "new_propinsi";
	}
	// post propinsi data
	@RequestMapping(value = "/save_propinsi", method = RequestMethod.POST)
	public String savePropinsi(@ModelAttribute("propinsi")Propinsi propinsi) {
		service.save(propinsi);
		return "redirect:/propinsi";
	}
	
	@RequestMapping("/edit_propinsi/{id}")
	public ModelAndView showEditPropinsiPage(@PathVariable(name = "id")int id) {
		ModelAndView mav = new ModelAndView("edit_propinsi");
		Propinsi propinsi =  service.get(id);
		mav.addObject("propinsi", propinsi);
		
		return mav;
	}
	
	@RequestMapping("/delete_propinsi/{id}")
	public String delePropinsi(@PathVariable(name = "id")int id){
		service.delete(id);
		return "redirect:/propinsi";
	}
	

}
