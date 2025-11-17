package uniandes.edu.co.alpescab.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import uniandes.edu.co.alpescab.modelo.ResenaCliente;

import java.util.List;

public interface ResenaClienteRepository extends MongoRepository<ResenaCliente, String> {

    List<ResenaCliente> findByClienteId(String clienteId);

    List<ResenaCliente> findByAutorConductorId(String autorConductorId);

    List<ResenaCliente> findByViajeId(String viajeId);
}
