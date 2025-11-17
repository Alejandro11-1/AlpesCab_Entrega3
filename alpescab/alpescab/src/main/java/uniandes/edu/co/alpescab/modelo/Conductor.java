package uniandes.edu.co.alpescab.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "conductores")
public class Conductor {

    @Id
    private String id;

    private String nombre;

    @Indexed(unique = true)
    private String email;

    private String celular;

    @Indexed(unique = true)
    private String cedula;

    private boolean activo;

    private List<Vehiculo> vehiculos;

    // ----- clases anidadas -----

    public static class Vehiculo {
        private String id;
        private String tipo;
        private String marca;
        private String modelo;
        private String color;
        private String placa;
        private String ciudadExpedicionId;
        private Integer capacidadPasajeros;
        private String nivelTransporte;
        private List<Disponibilidad> disponibilidades;

        public Vehiculo() {}

        // getters y setters
        public String getId() { return id; }
        public void setId(String id) { this.id = id; }

        public String getTipo() { return tipo; }
        public void setTipo(String tipo) { this.tipo = tipo; }

        public String getMarca() { return marca; }
        public void setMarca(String marca) { this.marca = marca; }

        public String getModelo() { return modelo; }
        public void setModelo(String modelo) { this.modelo = modelo; }

        public String getColor() { return color; }
        public void setColor(String color) { this.color = color; }

        public String getPlaca() { return placa; }
        public void setPlaca(String placa) { this.placa = placa; }

        public String getCiudadExpedicionId() { return ciudadExpedicionId; }
        public void setCiudadExpedicionId(String ciudadExpedicionId) { this.ciudadExpedicionId = ciudadExpedicionId; }

        public Integer getCapacidadPasajeros() { return capacidadPasajeros; }
        public void setCapacidadPasajeros(Integer capacidadPasajeros) { this.capacidadPasajeros = capacidadPasajeros; }

        public String getNivelTransporte() { return nivelTransporte; }
        public void setNivelTransporte(String nivelTransporte) { this.nivelTransporte = nivelTransporte; }

        public List<Disponibilidad> getDisponibilidades() { return disponibilidades; }
        public void setDisponibilidades(List<Disponibilidad> disponibilidades) { this.disponibilidades = disponibilidades; }
    }

    public static class Disponibilidad {
        private String id;
        private Integer diaSemana;
        private String horaInicio;
        private String horaFin;
        private String tipoServicio;

        public Disponibilidad() {}

        public String getId() { return id; }
        public void setId(String id) { this.id = id; }

        public Integer getDiaSemana() { return diaSemana; }
        public void setDiaSemana(Integer diaSemana) { this.diaSemana = diaSemana; }

        public String getHoraInicio() { return horaInicio; }
        public void setHoraInicio(String horaInicio) { this.horaInicio = horaInicio; }

        public String getHoraFin() { return horaFin; }
        public void setHoraFin(String horaFin) { this.horaFin = horaFin; }

        public String getTipoServicio() { return tipoServicio; }
        public void setTipoServicio(String tipoServicio) { this.tipoServicio = tipoServicio; }
    }

    public Conductor() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCelular() { return celular; }
    public void setCelular(String celular) { this.celular = celular; }

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }

    public List<Vehiculo> getVehiculos() { return vehiculos; }
    public void setVehiculos(List<Vehiculo> vehiculos) { this.vehiculos = vehiculos; }
}
