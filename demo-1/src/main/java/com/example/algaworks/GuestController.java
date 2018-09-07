package com.example.algaworks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.algaworks.model.repository.GuestCrudRepository;

@Controller
public class GuestController {
	
	private static final String GUEST_LIST = "/guestList";
	
	@Autowired
	private GuestCrudRepository guestCrudRepository;
	
	@GetMapping("/getMappingConvidados")
	public ModelAndView listGuests() {
		ModelAndView mv = new ModelAndView("getMappingGuestList");
		mv.addObject("guests", guestCrudRepository.findAll());
		return mv;
	}

	@RequestMapping(GUEST_LIST)
	public String list() {
		return "guestList";
	}
	
	@RequestMapping("/guestListPage")
	public String listPage() {
		return "guestListPage";
	}
	
}