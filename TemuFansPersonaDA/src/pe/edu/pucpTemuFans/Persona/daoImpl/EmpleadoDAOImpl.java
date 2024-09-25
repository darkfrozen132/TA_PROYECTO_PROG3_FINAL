/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucpTemuFans.Persona.daoImpl;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Persona.dao.EmpleadoDAO;
import pe.edu.pucp.TemuFans.Persona.model.Empleado;
import pe.edu.pucp.TemuFans.db.DAOImpl;

/**
 *
 * @author usuario
 */

public class EmpleadoDAOImpl extends DAOImpl implements EmpleadoDAO{
    private Empleado empleado;

    public EmpleadoDAOImpl() {
        super("Empleado");
        this.empleado = null;
    }
    @Override
    protected  String obtenerListaDeAtributosParaInsert(){
        return "idEmpleado,idUsuario,sueldo";
    }
    @Override
    protected  String obtenerListaDeValoresParaInsert(){
        String sql = "";
        sql = sql.concat(this.empleado.getIdEmpleado().toString());
        sql = sql.concat(", ");
        sql = sql.concat("'" + this.empleado.getIdUsuario() + "'");
        sql = sql.concat(", ");
        sql = sql.concat("'" + this.empleado.getSueldo().toString()+ "'");        
        return sql;
    }
    @Override
    protected  String obtenerListaDeAtributosYValoresParaUpdate(){
        String sql = "";
        sql = sql.concat("idCliente = " + this.empleado.getIdEmpleado().toString());
        sql = sql.concat(", ");
        sql = sql.concat("idUsuario = '" + this.empleado.getIdUsuario() + "'");
        sql = sql.concat(", ");
        sql = sql.concat("sueldo = '" + this.empleado.getSueldo() + "'");        
        return sql;
    }

    @Override
    public Integer insertar(Empleado empleado) {
        this.empleado=empleado;
        return this.insertar();
    }

    @Override
    public Integer modificar(Empleado empleado) {
        this.empleado=empleado;
        return this.modificar();
    }

    @Override
    public Integer eliminar(Empleado empleado) {
        this.empleado=empleado;
        return this.eliminar();
    }

    @Override
    public ArrayList<Empleado> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    protected String obtenerCondicionWhereId(){
        return "idEmpleado="+empleado.getIdEmpleado().toString(); 
    }

    
}
