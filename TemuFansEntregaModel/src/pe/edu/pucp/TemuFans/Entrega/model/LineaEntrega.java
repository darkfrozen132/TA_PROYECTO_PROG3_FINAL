/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Entrega.model;

import pe.edu.pucp.TemuFans.Inventario.model.Paquete;
import pe.edu.pucp.TemuFans.Inventario.model.Torre;

/**
 *
 * @author usuario
 */
public class LineaEntrega {
    private Paquete paquete;
    private Torre torre;

    public LineaEntrega(Paquete paquete, Torre torre) {
        this.paquete = paquete;
        this.torre = torre;
    }

    public LineaEntrega() {
        this.paquete = null;
        this.torre = null;
    }

    /**
     * @return the paquete
     */
    public Paquete getPaquete() {
        return paquete;
    }

    /**
     * @param paquete the paquete to set
     */
    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    /**
     * @return the torre
     */
    public Torre getTorre() {
        return torre;
    }

    /**
     * @param torre the torre to set
     */
    public void setTorre(Torre torre) {
        this.torre = torre;
    }
    
    
}
