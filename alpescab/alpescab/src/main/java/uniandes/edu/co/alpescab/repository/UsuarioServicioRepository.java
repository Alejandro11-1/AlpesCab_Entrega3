package uniandes.edu.co.alpescab.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import uniandes.edu.co.alpescab.modelo.UsuarioServicio;

import java.util.Optional;

public interface UsuarioServicioRepository extends MongoRepository<UsuarioServicio, String> {

    Optional<UsuarioServicio> findByEmail(String email);

    Optional<UsuarioServicio> findByCedula(String cedula);
}
