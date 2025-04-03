package com.example.PruebaTia.Dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;

public class TropasRequestDTO {

    private String potencia;
    private String frente;

    @JsonProperty("numero_tropas")
    private Integer numeroTropas;
    @JsonProperty("tipo_tropas")
    private String tipoTropas;

    @JsonProperty("hora_despliegue")
    private String horaDespliegue;

    public TropasRequestDTO(String potencia, String frente, int numeroTropas, String tipoTropas, String horaDespliegue) {
        this.potencia = potencia;
        this.frente = frente;
        this.numeroTropas = numeroTropas;
        this.tipoTropas = tipoTropas;
        this.horaDespliegue = horaDespliegue;
    }

    public TropasRequestDTO() {
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

    public Integer getNumeroTropas() {
        return numeroTropas;
    }

    public void setNumeroTropas(Integer numeroTropas) {
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

    @Override
    public String toString() {
        return "TropasRequestDTO{" +
                "potencia='" + potencia + '\'' +
                ", frente='" + frente + '\'' +
                ", numeroTropas=" + numeroTropas +
                ", tipoTropas='" + tipoTropas + '\'' +
                ", horaDespliegue='" + horaDespliegue + '\'' +
                '}';
    }
}
