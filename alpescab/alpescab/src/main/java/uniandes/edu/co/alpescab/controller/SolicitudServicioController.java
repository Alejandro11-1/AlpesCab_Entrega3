package uniandes.edu.co.alpescab.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import uniandes.edu.co.alpescab.modelo.SolicitudServicio;
import uniandes.edu.co.alpescab.repository.SolicitudServicioRepository;

@RestController
@RequestMapping("/api/solicitudes-servicio")
@CrossOrigin
public class SolicitudServicioController {

    private final SolicitudServicioRepository solicitudServicioRepository;

    public SolicitudServicioController(SolicitudServicioRepository solicitudServicioRepository) {
        this.solicitudServicioRepository = solicitudServicioRepository;
    }

    @GetMapping
    public List<SolicitudServicio> listarTodas() {
        return solicitudServicioRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SolicitudServicio> obtenerPorId(@PathVariable String id) {
        return solicitudServicioRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/usuario/{usuarioServicioId}")
    public List<SolicitudServicio> listarPorUsuario(@PathVariable String usuarioServicioId) {
        return solicitudServicioRepository.findByUsuarioServicioId(usuarioServicioId);
    }
    @PostMapping
    public ResponseEntity<SolicitudServicio> crear(@RequestBody SolicitudServicio solicitud) {
        if (solicitud.getEstado() == null || solicitud.getEstado().isBlank()) {
            solicitud.setEstado("CREADA");
        }
        SolicitudServicio creada = solicitudServicioRepository.save(solicitud);
        return ResponseEntity.ok(creada);
    }
}
