package uniandes.edu.co.alpescab.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uniandes.edu.co.alpescab.modelo.ResenaConductor;
import uniandes.edu.co.alpescab.repository.ResenaConductorRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/resenas-conductor")
@CrossOrigin(origins = "*")
public class ResenaConductorController {

    private final ResenaConductorRepository repository;

    public ResenaConductorController(ResenaConductorRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<ResenaConductor> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResenaConductor> obtenerPorId(@PathVariable String id) {
        Optional<ResenaConductor> resena = repository.findById(id);
        return resena.map(ResponseEntity::ok)
                     .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/conductor/{conductorId}")
    public List<ResenaConductor> listarPorConductor(@PathVariable String conductorId) {
        return repository.findByConductorId(conductorId);
    }

    @GetMapping("/autor/{clienteId}")
    public List<ResenaConductor> listarPorAutorCliente(@PathVariable String clienteId) {
        return repository.findByAutorClienteId(clienteId);
    }

    @PostMapping
    public ResponseEntity<ResenaConductor> crear(@RequestBody ResenaConductor resena) {
        ResenaConductor creada = repository.save(resena);
        return ResponseEntity.status(HttpStatus.CREATED).body(creada);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResenaConductor> actualizar(@PathVariable String id,
                                                      @RequestBody ResenaConductor resena) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        resena.setId(id);
        ResenaConductor actualizada = repository.save(resena);
        return ResponseEntity.ok(actualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable String id) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
