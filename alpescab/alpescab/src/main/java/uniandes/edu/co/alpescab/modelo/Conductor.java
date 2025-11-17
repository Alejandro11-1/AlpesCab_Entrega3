package uniandes.edu.co.alpescab.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "conductores")
public class Conductor {

    @Id
    private String id;

    private String nombre;
    private String email;
    private String celular;
    private String cedula;
    private boolean activo;

    //Vehículos asociados al conductor
    private List<Vehiculo> vehiculos;

    public Conductor() {
    }

    public Conductor(String id, String nombre, String email, String celular,
                     String cedula, boolean activo, List<Vehiculo> vehiculos) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.celular = celular;
        this.cedula = cedula;
        this.activo = activo;
        this.vehiculos = vehiculos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}
