package uniandes.edu.co.alpescab.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import uniandes.edu.co.alpescab.modelo.Conductor;

import java.util.Optional;

public interface ConductorRepository extends MongoRepository<Conductor, String> {

    Optional<Conductor> findByEmail(String email);

    Optional<Conductor> findByCedula(String cedula);
}
