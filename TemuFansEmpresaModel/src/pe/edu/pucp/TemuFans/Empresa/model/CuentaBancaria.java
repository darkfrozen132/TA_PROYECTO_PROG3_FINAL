/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Empresa.model;


public class CuentaBancaria {
    private Integer numeroCuenta;
    private Integer CCI;
    private String nombreTitular;
    private String nombreBanco;
    private Estado estado;
    
    public CuentaBancaria() {
        this.numeroCuenta = null;
        this.CCI = null;
        this.nombreTitular = null;
        this.nombreBanco = null;
        this.estado = null;
    }

    public CuentaBancaria(Integer numeroCuenta, Integer CCI, String nombreTitular, String nombreBanco, Estado estado) {
        this.numeroCuenta = numeroCuenta;
        this.CCI = CCI;
        this.nombreTitular = nombreTitular;
        this.nombreBanco = nombreBanco;
        this.estado = estado;
    }
    
    
    /**
     * @return the numeroCuenta
     */
    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * @param numeroCuenta the numeroCuenta to set
     */
    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * @return the CCI
     */
    public Integer getCCI() {
        return CCI;
    }

    /**
     * @param CCI the CCI to set
     */
    public void setCCI(Integer CCI) {
        this.CCI = CCI;
    }

    /**
     * @return the nombreTitular
     */
    public String getNombreTitular() {
        return nombreTitular;
    }

    /**
     * @param nombreTitular the nombreTitular to set
     */
    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    /**
     * @return the nombreBanco
     */
    public String getNombreBanco() {
        return nombreBanco;
    }

    /**
     * @param nombreBanco the nombreBanco to set
     */
    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
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
    
}
