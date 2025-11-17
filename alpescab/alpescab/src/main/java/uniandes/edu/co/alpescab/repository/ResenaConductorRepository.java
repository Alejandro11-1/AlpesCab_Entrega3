package uniandes.edu.co.alpescab.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import uniandes.edu.co.alpescab.modelo.ResenaConductor;

import java.util.List;

public interface ResenaConductorRepository extends MongoRepository<ResenaConductor, String> {

    List<ResenaConductor> findByConductorId(String conductorId);

    List<ResenaConductor> findByAutorClienteId(String autorClienteId);

    List<ResenaConductor> findByViajeId(String viajeId);
}
