/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package pe.edu.pucp.TemuFans.Pedido.dao;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Pedido.model.PedidoVenta;

/**
 *
 * @author Alvaro P.
 *
 */
public interface PedidoVentaDAO {
    public Integer insertar(PedidoVenta cliente);
    
    public Integer modificar(PedidoVenta cliente);
    
    public Integer eliminar(PedidoVenta cliente);
    
    public ArrayList<PedidoVenta> listarTodos();
}
