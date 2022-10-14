package com.generation.DrLomito.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import com.generation.DrLomito.model.Opiniones_vet;

@Service
public class opiniones_vetService {
	private final List<com.generation.DrLomito.service.opiniones_vetRepository> opiniones_vetRepository;
	
	@Autowired
	public opiniones_vetService(List<com.generation.DrLomito.service.opiniones_vetRepository> opiniones_vetRepository) {
		super();
		this.opiniones_vetRepository = opiniones_vetRepository;
	}//constructor opiniones_vetRepository

	public List <opiniones_vetRepository> getOpiniones_vetRepository() {
		return opiniones_vetRepository;
	}//getOpiniones
	
	public Opiniones_vet getOpiniones_vet(Long id) {
		return opiniones_vetRepository.findById(id).orElseThrow(()->new 
				IllegalArgumentException("Opinión" + id + "no es válida."));
		
		public Opiniones_vet deleteOpiniones_vet(Long id) {
			Opiniones_vet tmpUs = null;
			if(((CrudRepository<Opiniones_vet, Long>) opiniones_vetRepository).existsById(id)) {
				tmpUs = ((CrudRepository<Opiniones_vet, Long>) opiniones_vetRepository).findById(id).get();
				((CrudRepository<Opiniones_vet, Long>) opiniones_vetRepository).deleteById(id);
			}//ifExist
				return tmpUs;
		}//deleteUsuario
		
		public Opiniones_vet addOpinion(Opiniones_vet Opiniones_vet) {
			return opiniones_vetRepository.save(Opiniones_vet);
		}//addUsuarios
		
		public Opiniones_vet updateOpiniones(Long id, String opiniones_nombre_autor, String opiniones_calificacion, String usuarios_usuario_id) {
			Opiniones_vet tmpUs = null;
			if(opiniones_vetRepository.existsById(id)) {
				tmpUs = opiniones_vetRepository.findById(id).get();
				if(opiniones_nombre_autor!=null) tmpUs.setOpiniones_nombre_autor(opiniones_nombre_autor);
				if(opiniones_calificacion!=null) tmpUs.setOpiniones_calificacion(opiniones_calificacion);
				if(usuarios_usuario_id!=null) tmpUs.setUsuarios_usuario_id(usuarios_usuario_id);
				
			}
	
		
		}
		
	
	

}//class opiniones_vetService
