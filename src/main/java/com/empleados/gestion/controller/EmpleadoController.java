package com.empleados.gestion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empleados.gestion.model.Empleado;
import com.empleados.gestion.repository.EmpleadoRepository;



@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class EmpleadoController {
	
	@Autowired
	private EmpleadoRepository repository;
	
	@GetMapping("/empleados")
	public List<Empleado> listAll(){
		return repository.findAll();
	}
	
}
