package uniandes.edu.co.alpescab.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "resenas_cliente")
public class ResenaCliente {

    @Id
    private String id;

    private Integer calificacion;
    private String comentario;
    private LocalDate fecha;

    private String autorConductorId;
    private String clienteId;
    private String viajeId;
    public ResenaCliente() {
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

    public String getAutorConductorId() {
        return autorConductorId;
    }

    public void setAutorConductorId(String autorConductorId) {
        this.autorConductorId = autorConductorId;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public String getViajeId() {
        return viajeId;
    }

    public void setViajeId(String viajeId) {
        this.viajeId = viajeId;
    }
}
