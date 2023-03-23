package examen.ista.web.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;

import examen.ista.web.modelo.Restaurante;

public interface RestauranteRepository extends  MongoRepository<Restaurante, Long>{

}
