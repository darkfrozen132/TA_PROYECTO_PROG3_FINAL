/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Empresa.model;


public class Empresa {
    private Integer idEmpresa;
    private Integer idUsuario;
    private String nombreCEO;

    public Empresa(Integer idEmpresa, Integer idUsuario, String nombreCEO) {
        this.idEmpresa = idEmpresa;
        this.idUsuario = idUsuario;
        this.nombreCEO = nombreCEO;
    }

    public Empresa() {
        this.idEmpresa = null;
        this.idUsuario = null;
        this.nombreCEO = null;
    }

    /**
     * @return the idEmpresa
     */
    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    /**
     * @param idEmpresa the idEmpresa to set
     */
    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
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
     * @return the nombreCEO
     */
    public String getNombreCEO() {
        return nombreCEO;
    }

    /**
     * @param nombreCEO the nombreCEO to set
     */
    public void setNombreCEO(String nombreCEO) {
        this.nombreCEO = nombreCEO;
    }
    
    
}
