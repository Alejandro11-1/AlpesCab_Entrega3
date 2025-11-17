package uniandes.edu.co.alpescab.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uniandes.edu.co.alpescab.modelo.Viaje;
import uniandes.edu.co.alpescab.repository.ViajeRepository;

import java.util.List;

@RestController
@RequestMapping("/api/viajes")
public class ViajeController {

    private final ViajeRepository viajeRepository;

    public ViajeController(ViajeRepository viajeRepository) {
        this.viajeRepository = viajeRepository;
    }
    @GetMapping
    public List<Viaje> listarViajes() {
        return viajeRepository.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Viaje> obtenerViaje(@PathVariable String id) {
        return viajeRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Viaje crearViaje(@RequestBody Viaje viaje) {
        return viajeRepository.save(viaje);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Viaje> actualizarViaje(@PathVariable String id, @RequestBody Viaje viaje) {
        return viajeRepository.findById(id)
                .map(existente -> {
                    viaje.setId(id);
                    return ResponseEntity.ok(viajeRepository.save(viaje));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarViaje(@PathVariable String id) {
        if (!viajeRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        viajeRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
