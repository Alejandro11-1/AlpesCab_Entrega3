package uniandes.edu.co.alpescab.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "usuarios_servicio")
public class UsuarioServicio {

    @Id
    private String id;

    private String nombre;
    private String email;
    private String celular;
    private String cedula;
    private List<TarjetaCredito> tarjetas;

    public static class TarjetaCredito {
        private String id;
        private String nombre;
        private String nombreTitular;
        private String fechaVencimiento;
        private String cvv;

        public TarjetaCredito() {
        }

        public TarjetaCredito(String id, String nombre, String nombreTitular,
                              String fechaVencimiento, String cvv) {
            this.id = id;
            this.nombre = nombre;
            this.nombreTitular = nombreTitular;
            this.fechaVencimiento = fechaVencimiento;
            this.cvv = cvv;
        }

        public String getId() { return id; }
        public void setId(String id) { this.id = id; }

        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }

        public String getNombreTitular() { return nombreTitular; }
        public void setNombreTitular(String nombreTitular) { this.nombreTitular = nombreTitular; }

        public String getFechaVencimiento() { return fechaVencimiento; }
        public void setFechaVencimiento(String fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }

        public String getCvv() { return cvv; }
        public void setCvv(String cvv) { this.cvv = cvv; }
    }

    public UsuarioServicio() {
    }

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

    public List<TarjetaCredito> getTarjetas() { return tarjetas; }
    public void setTarjetas(List<TarjetaCredito> tarjetas) { this.tarjetas = tarjetas; }
}
