package com.portfolio.mm.Dto;

import javax.validation.constraints.NotBlank;


public class dtoSkills {
    private String descripcionS;
    private String imgS;
    @NotBlank
    private String nombreS;

    public dtoSkills() {
    }

    public dtoSkills(String descripcionS, String imgS, String nombreS) {
        this.descripcionS = descripcionS;
        this.imgS = imgS;
        this.nombreS = nombreS;
    }

    public String getDescripcionS() {
        return descripcionS;
    }

    public void setDescripcionS(String descripcionS) {
        this.descripcionS = descripcionS;
    }

    public String getImgS() {
        return imgS;
    }

    public void setImgS(String imgS) {
        this.imgS = imgS;
    }

    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }
 
    
}