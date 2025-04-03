package com.example.PruebaTia.Model;
import jakarta.persistence.*;

@Entity
@Table(name="tbl_tropas")
public class Tropas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTropa;
    @Column(length = 25)
    private String potencia;
    @Column(length = 25)
    private String frente;
    private int numeroTropas;
    @Column(length = 25)
    private String tipoTropas;
    @Column(length = 25)
    private String horaDespliegue;

    //getters and setters
    public Long getidTropa() {

        return idTropa;
    }

    public void setidTropa(Long idTropa) {

        this.idTropa = idTropa;
    }

    public String getPotencia() {

        return potencia;
    }

    public void setPotencia(String potencia) {

        this.potencia = potencia;
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
