/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.du.pucp.TemuFans.Transaccion.daoImpl;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Transaccion.model.Transaccion;

/**
 *
 * @author Leoncio
 */
public interface TransaccionDAO {
     public Integer insertar(Transaccion transaccion);
    
    public Integer modificar(Transaccion transaccion);
    
    public Integer eliminar(Transaccion transaccion);
    
    public ArrayList<Transaccion> listartodos();
}
