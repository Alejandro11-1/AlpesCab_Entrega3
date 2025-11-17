package uniandes.edu.co.alpescab.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import uniandes.edu.co.alpescab.modelo.Ciudad;

public interface CiudadRepository extends MongoRepository<Ciudad, String> {

    boolean existsByNombre(String nombre);
}
