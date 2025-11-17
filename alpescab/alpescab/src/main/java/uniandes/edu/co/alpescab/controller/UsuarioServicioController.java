package uniandes.edu.co.alpescab.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import uniandes.edu.co.alpescab.modelo.UsuarioServicio;
import uniandes.edu.co.alpescab.repository.UsuarioServicioRepository;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios-servicio")
public class UsuarioServicioController {

    private final UsuarioServicioRepository repo;

    public UsuarioServicioController(UsuarioServicioRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<UsuarioServicio> listar() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public UsuarioServicio obtenerPorId(@PathVariable String id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrado"));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioServicio crear(@RequestBody UsuarioServicio usuario) {
        return repo.save(usuario);
    }

    @PutMapping("/{id}")
    public UsuarioServicio actualizar(@PathVariable String id, @RequestBody UsuarioServicio usuario) {
        UsuarioServicio existente = repo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrado"));

        existente.setNombre(usuario.getNombre());
        existente.setEmail(usuario.getEmail());
        existente.setCelular(usuario.getCelular());
        existente.setCedula(usuario.getCedula());
        existente.setTarjetas(usuario.getTarjetas());

        return repo.save(existente);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable String id) {
        if (!repo.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrado");
        }
        repo.deleteById(id);
    }
}
