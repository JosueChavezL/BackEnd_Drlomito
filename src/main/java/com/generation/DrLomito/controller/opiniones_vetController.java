package com.generation.DrLomito.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.generation.DrLomito.model.Opiniones_vet;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(path="/api/opiniones_vet/")
public class opiniones_vetController {
	
	private final Opiniones_vet opiniones_vetService;


	@Autowired
	public opiniones_vetController(Opiniones_vet opiniones_vetService) {
		super();
		this.opiniones_vetService = opiniones_vetService;
	}
	@GetMapping
	public List<Opiniones_vet> getAllOpiniones_vet(){
		return  opiniones_vetService.getOpiniones_vet();
	
	@GetMapping (path="{opiniones_vet}")
	public Opiniones_vet getOpiniones_vet(@PathVariable("opiniones_vet") Opiniones_vet id){
		return  opiniones_vetService.addOpinion_vet(id);
	}//Get
	
	@DeleteMapping (path="{opiniones_vet}")
	public Opiniones_vet deleteOpiniones_vet(@PathVariable("opiniones_vet") Long id){
		return  opiniones_vetService.deleteOpinion_vet(id);
	}//Delete
	
	@PostMapping
	public Opiniones_vet addOpiniones_vet(@RequestBody Opiniones_vet Opiniones_vet) {
		return Opiniones_vet.addOpiniones_vet(Opiniones_vet);
	}//post
	
	@PutMapping (path="{opiniones_vet}")
	public Opiniones_vet updateOpiniones_vet(@PathVariable("opiniones_vet") Long id,
		@RequestParam(required = false) String opiniones_nombre_autor,
		@RequestParam(required = false) String opiniones_calificacion,
		@RequestParam(required = false) Long usuarios_usuario_id){
			return Opiniones_vet.updateOpiniones_vet(id, opiniones_nombre_autor, opiniones_calificacion,usuarios_usuario_id);
	}//Opiniones 
	
}
