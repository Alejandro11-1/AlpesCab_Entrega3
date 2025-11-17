package uniandes.edu.co.alpescab.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "solicitudes_servicio")
public class SolicitudServicio {

    @Id
    private String id; 

    private String fechaHoraSolicitud;
    private String estado; 
    private String tipoServicio;
    private String usuarioServicioId;

    public SolicitudServicio() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechaHoraSolicitud() {
        return fechaHoraSolicitud;
    }

    public void setFechaHoraSolicitud(String fechaHoraSolicitud) {
        this.fechaHoraSolicitud = fechaHoraSolicitud;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getUsuarioServicioId() {
        return usuarioServicioId;
    }

    public void setUsuarioServicioId(String usuarioServicioId) {
        this.usuarioServicioId = usuarioServicioId;
    }
}
