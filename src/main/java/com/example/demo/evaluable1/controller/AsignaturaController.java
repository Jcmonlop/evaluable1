package com.example.demo.evaluable1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.evaluable1.model.Asignatura;

@Controller
@RequestMapping("/asignatura")
public class AsignaturaController {

	@ModelAttribute("titulo")
	public String titulo() {
		return "Asignaturas";
	}

	public static List<Asignatura> dameListaAsignaturas() {
		List<Asignatura> lista = new ArrayList<>();
		lista.add(new Asignatura(1, "Matemáticas", "Matemáticas avanzadas", "Ciencias", 6, 0));
		lista.add(new Asignatura(2, "Historia", "Historia antigua", "Sociales", 4, 0));
		lista.add(new Asignatura(3, "Literatura", "Literatura clásica", "Letras", 5, 0));
		lista.add(new Asignatura(4, "Biología", "Biología celular", "Ciencias", 7, 0));
		lista.add(new Asignatura(5, "Arte", "Arte contemporáneo", "Artísticos", 4, 0));
		lista.add(new Asignatura(6, "Química", "Química orgánica", "Ciencias", 6, 0));
		lista.add(new Asignatura(7, "Economía", "Economía mundial", "Sociales", 5, 0));
		lista.add(new Asignatura(8, "Física", "Física cuántica", "Ciencias", 7, 0));
		lista.add(new Asignatura(9, "Filosofía", "Filosofía moderna", "Letras", 4, 0));
		lista.add(new Asignatura(10, "Música", "Música clásica", "Artísticos", 3, 0));
		lista.add(new Asignatura(11, "Geografía", "Geografía del mundo", "Sociales", 4, 0));
		lista.add(new Asignatura(12, "Programación", "Programación en Java", "Ciencias", 5, 0));
		lista.add(new Asignatura(13, "Inglés", "Inglés avanzado", "Letras", 4, 0));
		lista.add(new Asignatura(14, "Dibujo", "Dibujo artístico", "Artísticos", 3, 0));
		lista.add(new Asignatura(15, "Psicología", "Psicología clínica", "Sociales", 6, 0));
		lista.add(new Asignatura(16, "Estudios Ambientales Avanzados", "Exploración del medio ambiente y sus desafíos",
				"Mixto", 5, 0));
		lista.add(new Asignatura(17, "Literatura", "Literatura contemporánea", "Letras", 5, 0));
		lista.add(new Asignatura(18, "Danza", "Danza moderna", "Artísticos", 3, 0));
		lista.add(new Asignatura(19, "Sociología", "Sociología urbana", "Sociales", 4, 0));
		lista.add(new Asignatura(20, "Ciencias Políticas", "Política comparada", "Sociales", 5, 0));
		return lista;
	}

	@GetMapping("/all")
	public String listaAsignaturas(Model m) {
		m.addAttribute("tituloH1", "Lista completa de asignaturas");
		m.addAttribute("listaAsignaturas", dameListaAsignaturas());
		return "asignatura/listado";
	}
// /asignatura/listado?tipo=Ciencias
	@GetMapping("/listado")
	public String listadosVarios(@RequestParam String tipo, Model m) {
		m.addAttribute("tituloH1", "Lista filtrada de asignaturas");
		m.addAttribute("listaAsignaturas", Asignatura.asignaturasPorTipo(tipo));
		return "asignatura/listado";
	}
	
	@GetMapping("/listado/sin")
	public String listadoSin(Model m) {
		m.addAttribute("tituloH1", "Listado sin numero de alumnos");
		m.addAttribute("listaAsignaturas", dameListaAsignaturas());
		return "asignatura/listado-sin";
	}
	
	@GetMapping("/listado/con")
	public String listadoCon(Model m) {
		m.addAttribute("tituloH1", "Listado con numero de alumnos");
		m.addAttribute("listaAsignaturas", dameListaAsignaturas());
		return "asignatura/listado-con";
	}

}
