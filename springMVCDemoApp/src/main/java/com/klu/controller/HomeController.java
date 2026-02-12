package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import com.klu.model.Message;
import com.klu.service.MessageService;
/* give reponds to html */
@Controller
public class HomeController {
	@Autowired
	private MessageService messageService;
	@GetMapping("/box")
	public String home (Model model) {
		Message msg = new Message(messageService.getMessage());
		model.addAttribute("message",msg);
		return "home";
	}

}
