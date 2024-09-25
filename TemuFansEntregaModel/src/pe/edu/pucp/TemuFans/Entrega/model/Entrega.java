/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Entrega.model;

import java.util.ArrayList;
import java.util.Date;
import pe.edu.pucp.TemuFans.Pedido.model.Pedido;

/**
 *
 * @author usuario
 */
public class Entrega {
    private Pedido pedido;
    private Date fechaEntrega;
    private ArrayList<LineaEntrega> lineasEntregas;

    public Entrega(Pedido pedido, Date fechaEntrega, ArrayList<LineaEntrega> lineasEntregas) {
        this.pedido = pedido;
        this.fechaEntrega = fechaEntrega;
        this.lineasEntregas = lineasEntregas;
    }

    public Entrega() {
        this.pedido = null;
        this.fechaEntrega = null;
        this.lineasEntregas = null;
    }

    /**
     * @return the pedido
     */
    public Pedido getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    /**
     * @return the fechaEntrega
     */
    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * @param fechaEntrega the fechaEntrega to set
     */
    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    /**
     * @return the lineasEntregas
     */
    public ArrayList<LineaEntrega> getLineasEntregas() {
        return lineasEntregas;
    }

    /**
     * @param lineasEntregas the lineasEntregas to set
     */
    public void setLineasEntregas(ArrayList<LineaEntrega> lineasEntregas) {
        this.lineasEntregas = lineasEntregas;
    }
    
    
}
