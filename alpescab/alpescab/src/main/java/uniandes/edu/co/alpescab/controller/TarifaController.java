package uniandes.edu.co.alpescab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uniandes.edu.co.alpescab.modelo.Tarifa;
import uniandes.edu.co.alpescab.repository.TarifaRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tarifas")
public class TarifaController {

    @Autowired
    private TarifaRepository tarifaRepository;

    @PostMapping
    public ResponseEntity<Tarifa> crearTarifa(@RequestBody Tarifa tarifa) {
        tarifa.setId(null);

        Tarifa guardada = tarifaRepository.save(tarifa);
        return ResponseEntity.status(HttpStatus.CREATED).body(guardada);
    }
    @GetMapping
    public List<Tarifa> listarTodas() {
        return tarifaRepository.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Tarifa> obtenerPorId(@PathVariable String id) {
        Optional<Tarifa> tarifaOpt = tarifaRepository.findById(id);
        return tarifaOpt.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @GetMapping("/buscar")
    public ResponseEntity<Tarifa> buscarPorTipoYNivel(
            @RequestParam String tipoServicio,
            @RequestParam String nivelTransporte) {

        return tarifaRepository
                .findByTipoServicioAndNivelTransporte(tipoServicio, nivelTransporte)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
