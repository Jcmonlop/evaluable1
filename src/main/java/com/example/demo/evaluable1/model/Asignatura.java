package com.example.demo.evaluable1.model;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.evaluable1.controller.AsignaturaController;

public class Asignatura {
	
	// propiedades
	
	private int id;
	private String nombre;
	private String descripcion;
	private String tipo;
	private int numeroCreditos;
	private int alumnosMatriculados;
	
	// constructor
	
	public Asignatura(int id, String nombre, String descripcion, String tipo, int numeroCreditos,
			int alumnosMatriculados) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.numeroCreditos = numeroCreditos;
		this.alumnosMatriculados = alumnosMatriculados;
	}
	
	// getters
	
	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public int getNumeroCreditos() {
		return numeroCreditos;
	}

	public int getAlumnosMatriculados() {
		return alumnosMatriculados;
	}
	
	public static List<Asignatura> asignaturasPorTipo(String tipo) {
		List<Asignatura> listaFiltrada = new ArrayList<>();
		for (Asignatura a : AsignaturaController.dameListaAsignaturas()) {
			if (tipo.equalsIgnoreCase(a.getTipo())) { 
				listaFiltrada.add(a);
			}		
		}
		return listaFiltrada;		
	}

}
