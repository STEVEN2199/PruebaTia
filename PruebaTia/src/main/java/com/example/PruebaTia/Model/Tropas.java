package com.example.PruebaTia.Model;
import jakarta.persistence.*;

@Entity
@Table(name="tbl_tropas")
public class Tropas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTropa;

    @Column(length = 25, name = "potenciaId")
    private Long potenciaId;

    @Column(length = 25, name = "frente")
    private String frente;

    @Column(length = 25, name = "numeroTropas")
    private int numeroTropas;

    @Column(length = 25, name = "tipoTropas")
    private String tipoTropas;

    @Column(length = 25, name = "horaDespliegue")
    private String horaDespliegue;

    public Long getIdTropa() {
        return idTropa;
    }

    public void setIdTropa(Long idTropa) {
        this.idTropa = idTropa;
    }

    public Long getPotenciaId() {
        return potenciaId;
    }

    public void setPotenciaId(Long potenciaId) {
        this.potenciaId = potenciaId;
    }

    public String getFrente() {
        return frente;
    }

    public void setFrente(String frente) {
        this.frente = frente;
    }

    public int getNumeroTropas() {
        return numeroTropas;
    }

    public void setNumeroTropas(int numeroTropas) {
        this.numeroTropas = numeroTropas;
    }

    public String getTipoTropas() {
        return tipoTropas;
    }

    public void setTipoTropas(String tipoTropas) {
        this.tipoTropas = tipoTropas;
    }

    public String getHoraDespliegue() {
        return horaDespliegue;
    }

    public void setHoraDespliegue(String horaDespliegue) {
        this.horaDespliegue = horaDespliegue;
    }
}
