package uniandes.edu.co.alpescab.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tarifas")
public class Tarifa {

    @Id
    private String id; 

    private String tipoServicio;

    @Indexed
    private String nivelTransporte;

    private Double valorTkm;

    public Tarifa() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getNivelTransporte() {
        return nivelTransporte;
    }

    public void setNivelTransporte(String nivelTransporte) {
        this.nivelTransporte = nivelTransporte;
    }

    public Double getValorTkm() {
        return valorTkm;
    }

    public void setValorTkm(Double valorTkm) {
        this.valorTkm = valorTkm;
    }
}
