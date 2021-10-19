package com.example.demo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class EditorialControlador {

	@GetMapping("/editoriales")
	public String editoriales() {
		return "editoriales.html";
	}
	
}
