package uniandes.edu.co.alpescab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uniandes.edu.co.alpescab.modelo.Conductor;
import uniandes.edu.co.alpescab.repository.ConductorRepository;

import java.util.List;

@RestController
@RequestMapping("/api/conductores")
public class ConductorController {

    @Autowired
    private ConductorRepository conductorRepository;

    @PostMapping
    public ResponseEntity<Conductor> crearConductor(@RequestBody Conductor conductor) {
        conductor.setId(null); 
        if (!conductor.isActivo()) {  
            conductor.setActivo(true);
        }
        Conductor guardado = conductorRepository.save(conductor);
        return ResponseEntity.status(HttpStatus.CREATED).body(guardado);
    }

    @GetMapping
    public List<Conductor> listarTodos() {
        return conductorRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Conductor> obtenerPorId(@PathVariable String id) {
        return conductorRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
