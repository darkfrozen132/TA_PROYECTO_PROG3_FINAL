/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Empresa.model;


public class CuentaBancaria {
    private Integer codigoInterbancario;
    private Integer idUsuario;
    private Integer idBanco;
    private Integer IBAN;
    private Estado estado;
    private Moneda moneda;
    
    public CuentaBancaria() {
        this.codigoInterbancario = null;
        this.idUsuario = null;
        this.idBanco = null;
        this.IBAN = null;
        this.estado = null;
        this.moneda = null;
    }
    
    public CuentaBancaria(Integer codigoInterbancario, Integer idUsuario, Integer idBanco, Integer IBAN, Estado estado, Moneda moneda) {
        this.codigoInterbancario = codigoInterbancario;
        this.idUsuario = idUsuario;
        this.idBanco = idBanco;
        this.IBAN = IBAN;
        this.estado = estado;
        this.moneda = moneda;
    }
    
    
    /**
     * @return the codigoInterbancario
     */
    public Integer getCodigoInterbancario() {
        return codigoInterbancario;
    }

    /**
     * @param codigoInterbancario the codigoInterbancario to set
     */
    public void setCodigoInterbancario(Integer codigoInterbancario) {
        this.codigoInterbancario = codigoInterbancario;
    }

    /**
     * @return the idUsuario
     */
    public Integer getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
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
     * @return the IBAN
     */
    public Integer getIBAN() {
        return IBAN;
    }

    /**
     * @param IBAN the IBAN to set
     */
    public void setIBAN(Integer IBAN) {
        this.IBAN = IBAN;
    }

    /**
     * @return the estado
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    /**
     * @return the moneda
     */
    public Moneda getMoneda() {
        return moneda;
    }

    /**
     * @param moneda the moneda to set
     */
    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }
    
    
}
