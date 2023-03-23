package examen.ista.web.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import examen.ista.web.modelo.Restaurante;

import examen.ista.web.repositorio.RestauranteRepository;



@Service
public class RestauranteServicelmpl extends GenericServicelmpl <Restaurante, Long> implements RestauranteService{

	@Autowired
   RestauranteRepository restauranteRepository;
    
    @Override
    public CrudRepository<Restaurante, Long> getDao() {
        return restauranteRepository;
    }  
	
}