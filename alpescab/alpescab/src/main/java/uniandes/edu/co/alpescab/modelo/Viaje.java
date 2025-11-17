package uniandes.edu.co.alpescab.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "viajes")
public class Viaje {

    @Id
    private String id;
    
    private String idSolicitudServicio;
    private String idConductor;
    private String idVehiculo;
    private String idRuta;
    private String idTarifa;

    private LocalDateTime horaInicio;
    private LocalDateTime horaFin;

    private Integer duracionMin;
    private Double longitudKm;
    private Double costoTotal;
    private Double porcentajeComision;
    private Double valorNetoConductor;

    public Viaje() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdSolicitudServicio() {
        return idSolicitudServicio;
    }

    public void setIdSolicitudServicio(String idSolicitudServicio) {
        this.idSolicitudServicio = idSolicitudServicio;
    }

    public String getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(String idConductor) {
        this.idConductor = idConductor;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(String idRuta) {
        this.idRuta = idRuta;
    }

    public String getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(String idTarifa) {
        this.idTarifa = idTarifa;
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDateTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalDateTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalDateTime horaFin) {
        this.horaFin = horaFin;
    }

    public Integer getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(Integer duracionMin) {
        this.duracionMin = duracionMin;
    }

    public Double getLongitudKm() {
        return longitudKm;
    }

    public void setLongitudKm(Double longitudKm) {
        this.longitudKm = longitudKm;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(Double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public Double getValorNetoConductor() {
        return valorNetoConductor;
    }

    public void setValorNetoConductor(Double valorNetoConductor) {
        this.valorNetoConductor = valorNetoConductor;
    }
}
