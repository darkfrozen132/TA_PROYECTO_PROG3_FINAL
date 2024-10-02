/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pe.edu.pucp.TemuFans.Pedido.model;

import pe.edu.pucp.TemuFans.Inventario.model.Paquete;

/*
 *
 * @author Alvaro P.
 *
 */
public class LineaPedidoCompra {
    private Integer cantidad;
    private double subtotal;
    private Paquete paquete;
    
    public LineaPedidoCompra(){
        cantidad = 0;
        subtotal = 0;
    }
    
    public LineaPedidoCompra(Integer cantidad, double subtotal, Paquete paquete){
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.paquete = paquete;
    }

    /**
     * @return the cantidad
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
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
    
    
}
