package com.example.PruebaTia.Dtos;

public class EnemigosDTO {
    private String potencia;

    private String frente;

    private Long numeroTropas;

    public EnemigosDTO() {

    }

    public EnemigosDTO(String potencia, String frente, Long numeroTropas) {
        this.potencia = potencia;
        this.frente = frente;
        this.numeroTropas = numeroTropas;
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

    public Long getNumeroTropas() {
        return numeroTropas;
    }

    public void setNumeroTropas(Long numeroTropas) {
        this.numeroTropas = numeroTropas;
    }
}
