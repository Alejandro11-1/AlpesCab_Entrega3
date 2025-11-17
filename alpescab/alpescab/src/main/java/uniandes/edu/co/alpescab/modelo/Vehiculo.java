package uniandes.edu.co.alpescab.modelo;

import java.util.List;

public class Vehiculo {

    private String id;
    private String tipo;
    private String marca;
    private String modelo;
    private String color;
    private String placa;
    private String ciudadExpedicionId;
    private Integer capacidadPasajeros;
    private String nivelTransporte;

    //Disponibilidades del vehículo
    private List<Disponibilidad> disponibilidades;

    public Vehiculo() {
    }

    public Vehiculo(String id, String tipo, String marca, String modelo,
                    String color, String placa, String ciudadExpedicionId,
                    Integer capacidadPasajeros, String nivelTransporte,
                    List<Disponibilidad> disponibilidades) {
        this.id = id;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
        this.ciudadExpedicionId = ciudadExpedicionId;
        this.capacidadPasajeros = capacidadPasajeros;
        this.nivelTransporte = nivelTransporte;
        this.disponibilidades = disponibilidades;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCiudadExpedicionId() {
        return ciudadExpedicionId;
    }

    public void setCiudadExpedicionId(String ciudadExpedicionId) {
        this.ciudadExpedicionId = ciudadExpedicionId;
    }

    public Integer getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(Integer capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getNivelTransporte() {
        return nivelTransporte;
    }

    public void setNivelTransporte(String nivelTransporte) {
        this.nivelTransporte = nivelTransporte;
    }

    public List<Disponibilidad> getDisponibilidades() {
        return disponibilidades;
    }

    public void setDisponibilidades(List<Disponibilidad> disponibilidades) {
        this.disponibilidades = disponibilidades;
    }
}
