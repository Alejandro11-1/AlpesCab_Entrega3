package uniandes.edu.co.alpescab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uniandes.edu.co.alpescab.modelo.Conductor;
import uniandes.edu.co.alpescab.modelo.Vehiculo;
import uniandes.edu.co.alpescab.repository.ConductorRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/conductores")
public class ConductorController {

    @Autowired
    private ConductorRepository conductorRepository;

    // RF2 - Registrar un conductor 
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Conductor crearConductor(@RequestBody Conductor conductor) {
        return conductorRepository.save(conductor);
    }

    @GetMapping
    public List<Conductor> obtenerTodos() {
        return conductorRepository.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Conductor> obtenerPorId(@PathVariable String id) {
        return conductorRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // RF3 - Registrar un vehículo para un usuario conductor
    @PostMapping("/{conductorId}/vehiculos")
    public ResponseEntity<Vehiculo> registrarVehiculoParaConductor(
            @PathVariable String conductorId,
            @RequestBody Vehiculo vehiculo) {

        Optional<Conductor> conductorOpt = conductorRepository.findById(conductorId);
        if (conductorOpt.isEmpty()) {
            // Conductor no existe 404
            return ResponseEntity.notFound().build();
        }

        Conductor conductor = conductorOpt.get();
        if (conductor.getVehiculos() == null) {
            conductor.setVehiculos(new ArrayList<>());
        }

        if (vehiculo.getId() == null || vehiculo.getId().isEmpty()) {
            String nuevoId = conductorId + "_V" + (conductor.getVehiculos().size() + 1);
            vehiculo.setId(nuevoId);
        }

        // Agregar el vehículo a la lista embebida
        conductor.getVehiculos().add(vehiculo);

        // Guardar el conductor actualizado
        conductorRepository.save(conductor);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(vehiculo);
    }
}
