package uniandes.edu.co.alpescab.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import uniandes.edu.co.alpescab.modelo.SolicitudServicio;

public interface SolicitudServicioRepository extends MongoRepository<SolicitudServicio, String> {
    List<SolicitudServicio> findByUsuarioServicioId(String usuarioServicioId);

    List<SolicitudServicio> findByUsuarioServicioIdAndTipoServicio(String usuarioServicioId, String tipoServicio);
}
