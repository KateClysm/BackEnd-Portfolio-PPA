package com.portfolio.mm.Dto;

import javax.validation.constraints.NotBlank;


public class dtoEducacion {
    
    private String fechaE;
    
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
   

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String descripcionE, String fechaE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.fechaE = fechaE;
    }  

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getFechaE() {
        return fechaE;
    }

    public void setFechaE(String fechaE) {
        this.fechaE = fechaE;
    }   
}