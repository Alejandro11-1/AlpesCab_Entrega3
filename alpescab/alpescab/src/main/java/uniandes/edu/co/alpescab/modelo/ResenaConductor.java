package uniandes.edu.co.alpescab.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "resenas_conductor")
public class ResenaConductor {

    @Id
    private String id;

    private Integer calificacion;
    private String comentario;
    private LocalDate fecha;
    private String autorClienteId;
    private String conductorId;
    private String viajeId;

    public ResenaConductor() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getAutorClienteId() {
        return autorClienteId;
    }

    public void setAutorClienteId(String autorClienteId) {
        this.autorClienteId = autorClienteId;
    }

    public String getConductorId() {
        return conductorId;
    }

    public void setConductorId(String conductorId) {
        this.conductorId = conductorId;
    }

    public String getViajeId() {
        return viajeId;
    }

    public void setViajeId(String viajeId) {
        this.viajeId = viajeId;
    }
}
