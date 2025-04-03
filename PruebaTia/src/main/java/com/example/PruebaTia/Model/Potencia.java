package com.example.PruebaTia.Model;
import jakarta.persistence.*;

@Entity
@Table(name="tbl_potencia")
public class Potencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPotencia;
    private String potencia;
    private String hostilidad;
    private String ubicacion;

    //getters and setters
    public Long getidPotencia() {

        return idPotencia;
    }

    public void setidPotencia(Long idPotencia) {

        this.idPotencia = idPotencia;
    }

    public String getpotencia() {

        return potencia;
    }

    public void setpotencia(String potencia) {

        this.potencia = potencia;
    }

    public String getHostilidad() {

        return hostilidad;
    }

    public void setHostilidad(String hostilidad) {

        this.hostilidad = hostilidad;
    }

    public String getUbicacion() {

        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {

        this.ubicacion = ubicacion;
    }
}