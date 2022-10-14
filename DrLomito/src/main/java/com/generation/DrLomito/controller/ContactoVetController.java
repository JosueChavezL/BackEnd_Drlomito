package com.generation.DrLomito.controller;
import com.generation.DrLomito.model.ContactoVet;
import com.generation.DrLomito.service.ContactoVetService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/drlomito")

public class ContactoVetController {
	private final ContactoVetService contactoVetService;
	
	@Autowired
	public ContactoVetController(ContactoVetService contactoVetService) {
		super();
		this.contactoVetService = contactoVetService;
	}
	
	@GetMapping
	public List<ContactoVet> getAllProductos(){
		return contactoVetService.getProductos();
	}
	
	@GetMapping(path="{prodId}")
	public  ContactoVet getProducto(@PathVariable("prodId") Long id){
		return contactoVetService.getProductos(id);
	}
	@DeleteMapping(path="{prodId}")
	public  ContactoVet deleteProducto(@PathVariable("prodId") Long id){
	 return contactoVetService.deleteProducto(id);
	 }
	@PostMapping
	public ContactoVet addProducto(@RequestBody ContactoVet contactoVet) {
		return contactoVetService.addProducto(contactoVet);
	}
	@PutMapping(path="{prodId}")
	public ContactoVet updateProducto (@PathVariable("prodId")Long id,
			@RequestParam (required = false) String veterinario_direccion, 
			@RequestParam (required = false) String veterinario_telefono1,
			@RequestParam (required = false) String veterinario_telefono2,
			@RequestParam (required = false) Integer veterinario_horario_inicio,
			@RequestParam (required = false) Integer veterinario_horario_cierre,
			@RequestParam (required = false) Boolean veterinario_atencion_urgencia,
			@RequestParam (required = false) Long  usuarios_usuario_id)
	
	{return contactoVetService.updateProducto(id, veterinario_direccion, veterinario_telefono1, veterinario_telefono2, veterinario_horario_inicio, veterinario_horario_cierre, usuarios_usuario_id, false);}
	
}