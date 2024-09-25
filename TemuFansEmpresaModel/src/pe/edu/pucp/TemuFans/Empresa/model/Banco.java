/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Empresa.model;

/**
 *
 * @author Ricardo
 */
public class Banco {
    private Integer idBanco;
    private String razonSocial;
    private String swift_bic;
    private Integer telefono;

    public Banco(Integer idBanco, String razonSocial, String swift_bic, Integer telefono) {
        this.idBanco = idBanco;
        this.razonSocial = razonSocial;
        this.swift_bic = swift_bic;
        this.telefono = telefono;
    }
    public Banco() {
        this.idBanco = null;
        this.razonSocial = null;
        this.swift_bic = null;
        this.telefono = null;
    }
    /**
     * @return the idBanco
     */
    public Integer getIdBanco() {
        return idBanco;
    }

    /**
     * @param idBanco the idBanco to set
     */
    public void setIdBanco(Integer idBanco) {
        this.idBanco = idBanco;
    }

    /**
     * @return the razonSocial
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * @param razonSocial the razonSocial to set
     */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    /**
     * @return the swift_bic
     */
    public String getSwift_bic() {
        return swift_bic;
    }

    /**
     * @param swift_bic the swift_bic to set
     */
    public void setSwift_bic(String swift_bic) {
        this.swift_bic = swift_bic;
    }

    /**
     * @return the telefono
     */
    public Integer getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
    
    
}
