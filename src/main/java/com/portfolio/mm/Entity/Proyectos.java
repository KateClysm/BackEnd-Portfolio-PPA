package com.portfolio.mm.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreP;
    private String descripcionP;
    private String fechaP;
    private String linkP;
    private String gitP;
    private String imgP;
    
    //Constructores
    public Proyectos() {
    }

    public Proyectos(String nombreP, String descripcionP, String fechaP, String linkP, String gitP, String imgP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.fechaP = fechaP;
        this.linkP = linkP;
        this.gitP = gitP;
        this.imgP = imgP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public String getFechaP() {
        return fechaP;
    }

    public void setFechaP(String fechaP) {
        this.fechaP = fechaP;
    }

    public String getLinkP() {
        return linkP;
    }

    public void setLinkP(String linkP) {
        this.linkP = linkP;
    }

    public String getGitP() {
        return gitP;
    }

    public void setGitP(String gitP) {
        this.gitP = gitP;
    }

    public String getImgP() {
        return imgP;
    }

    public void setImgP(String imgP) {
        this.imgP = imgP;
    }     
}