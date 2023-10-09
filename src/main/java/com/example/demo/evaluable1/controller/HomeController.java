package com.example.demo.evaluable1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	// home

	@GetMapping({ "/", "/home", "/home/", ""})
	public String homeHandler(Model model) {
		model.addAttribute("titulo", "Asignaturas");
		model.addAttribute("tituloH1", "Esta es la página 'Inicio' de las asignaturas");
		model.addAttribute("parrafo1",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis laoreet volutpat vehicula. "
						+ "Aliquam erat volutpat. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere "
						+ "cubilia curae;"
						+ "Nulla vestibulum lectus vitae hendrerit laoreet. Cras justo metus, mollis vitae velit in, "
						+ "ultricies iaculis turpis. Nam laoreet bibendum sapien, nec cursus ex. "
						+ "Aenean placerat dapibus urna vel tincidunt. Morbi bibendum sagittis nisi, "
						+ "ut interdum odio vehicula venenatis.");
		model.addAttribute("parrafo2",
				"Nam sagittis mattis tellus vitae aliquam. Proin hendrerit finibus ante, in consectetur ante lobortis et. "
						+ "Pellentesque ligula velit, porta sit amet luctus sit amet, consectetur non est. "
						+ "Nulla ornare purus quis diam blandit facilisis. Aliquam convallis non lorem in suscipit. "
						+ "Phasellus at est augue. Nulla at est gravida, porttitor enim vel, dignissim magna. "
						+ "Suspendisse nulla nibh, rutrum rutrum suscipit at, tempus viverra felis. ");
		model.addAttribute("parrafo3",
				"Nunc ut elit arcu. Morbi feugiat malesuada malesuada. Fusce efficitur turpis ac eros molestie, "
						+ "eu dignissim felis bibendum. Nam ut erat ac turpis gravida maximus. Cras sollicitudin dignissim nunc. "
						+ "Fusce vestibulum odio a ligula sodales egestas. Donec at dapibus nunc, sit amet mattis lorem."
						+ "Quisque et iaculis lectus, vitae pellentesque orci. Integer eget arcu ut lorem malesuada porttitor. "
						+ "Aenean maximus odio nec elementum maximus. ");
		return "home";
	}
}
