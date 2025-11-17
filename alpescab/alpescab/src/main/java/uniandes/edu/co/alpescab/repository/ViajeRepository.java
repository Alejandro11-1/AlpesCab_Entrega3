package uniandes.edu.co.alpescab.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import uniandes.edu.co.alpescab.modelo.Viaje;

public interface ViajeRepository extends MongoRepository<Viaje, String> {
}
