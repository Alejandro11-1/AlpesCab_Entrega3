package uniandes.edu.co.alpescab.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import uniandes.edu.co.alpescab.modelo.Tarifa;

import java.util.Optional;

public interface TarifaRepository extends MongoRepository<Tarifa, String> {

    Optional<Tarifa> findByTipoServicioAndNivelTransporte(String tipoServicio, String nivelTransporte);
}
