/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucpTemuFans.Persona.daoImpl;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Persona.dao.ClienteDAO;
import pe.edu.pucp.TemuFans.Persona.model.Cliente;
import pe.edu.pucp.TemuFans.db.DAOImpl;

/**
 *
 * @author usuario
 */
public class ClienteDAOImpl extends DAOImpl implements ClienteDAO{
    private Cliente cliente;
    
    public ClienteDAOImpl() {
        super("Cliente");
        this.cliente = null;
    }
    @Override
    protected  String obtenerListaDeAtributosParaInsert(){
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    protected  String obtenerListaDeValoresParaInsert(){
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    protected  String obtenerListaDeAtributosYValoresParaUpdate(){
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer insertar(Cliente cliente) {
        this.cliente=cliente;
        return this.insertar();
    }

    @Override
    public Integer modificar(Cliente cliente) {
        
        return this.modificar(" ");
    }

    @Override
    public Integer eliminar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Cliente> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
