package uniandes.edu.co.alpescab.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uniandes.edu.co.alpescab.modelo.Ciudad;
import uniandes.edu.co.alpescab.repository.CiudadRepository;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/ciudades")
public class CiudadController {

    private final CiudadRepository ciudadRepository;

    public CiudadController(CiudadRepository ciudadRepository) {
        this.ciudadRepository = ciudadRepository;
    }

    @PostMapping
    public ResponseEntity<Ciudad> crearCiudad(@RequestBody Ciudad ciudad) {
        Ciudad guardada = ciudadRepository.save(ciudad);
        return ResponseEntity
                .created(URI.create("/api/ciudades/" + guardada.getId()))
                .body(guardada);
    }
    @GetMapping
    public List<Ciudad> listarCiudades() {
        return ciudadRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ciudad> buscarPorId(@PathVariable String id) {
        return ciudadRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
