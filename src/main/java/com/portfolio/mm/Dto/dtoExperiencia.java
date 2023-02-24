package com.portfolio.mm.Dto;


import javax.validation.constraints.NotBlank;

public class dtoExperiencia {
    
    private String fechaE;
    private String imgE;
    
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
   
   
    
    //Constructores
    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE, String fechaE, String imgE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.fechaE = fechaE;
        this.imgE = imgE;
    }

    //Getter & Setters
    public String getFechaE() {
        return fechaE;
    }

    public void setFechaE(String fechaE) {
        this.fechaE = fechaE;
    }

    public String getImgE() {
        return imgE;
    }

    public void setImgE(String imgE) {
        this.imgE = imgE;
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
   
    
    
}