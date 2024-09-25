/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package pe.edu.pucp.TemuFans.Pedido.dao;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Pedido.model.PedidoCompra;

/**
 *
 * @author Alvaro P.
 *
 */
public interface PedidoCompraDAO {
    public Integer insertar(PedidoCompra cliente);
    
    public Integer modificar(PedidoCompra cliente);
    
    public Integer eliminar(PedidoCompra cliente);
    
    public ArrayList<PedidoCompra> listarTodos();
}
