package uniandes.edu.co.alpescab.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uniandes.edu.co.alpescab.modelo.ResenaCliente;
import uniandes.edu.co.alpescab.repository.ResenaClienteRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/resenas-cliente")
@CrossOrigin(origins = "*")
public class ResenaClienteController {

    private final ResenaClienteRepository repository;

    public ResenaClienteController(ResenaClienteRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<ResenaCliente> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResenaCliente> obtenerPorId(@PathVariable String id) {
        Optional<ResenaCliente> resena = repository.findById(id);
        return resena.map(ResponseEntity::ok)
                     .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/cliente/{clienteId}")
    public List<ResenaCliente> listarPorCliente(@PathVariable String clienteId) {
        return repository.findByClienteId(clienteId);
    }

    @GetMapping("/autor/{conductorId}")
    public List<ResenaCliente> listarPorAutorConductor(@PathVariable String conductorId) {
        return repository.findByAutorConductorId(conductorId);
    }

    @PostMapping
    public ResponseEntity<ResenaCliente> crear(@RequestBody ResenaCliente resena) {
        ResenaCliente creada = repository.save(resena);
        return ResponseEntity.status(HttpStatus.CREATED).body(creada);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResenaCliente> actualizar(@PathVariable String id,
                                                    @RequestBody ResenaCliente resena) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        resena.setId(id);
        ResenaCliente actualizada = repository.save(resena);
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
