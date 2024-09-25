/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Empresa.daoImpl;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Empresa.dao.EmpresaDAO;
import pe.edu.pucp.TemuFans.Empresa.model.Empresa;
import pe.edu.pucp.TemuFans.db.DAOImpl;

/**
 *
 * @author Ricardo
 */
public class EmpresaDAOImpl extends DAOImpl implements EmpresaDAO {
     private Empresa empresa;

    public EmpresaDAOImpl() {
        super("Empresa");  
        this.empresa=null;
    }


     @Override
    public Integer insertar(Empresa empresa) {
        this.empresa = empresa;
        return insertar();  
    }


     @Override
    public Integer modificar(Empresa empresa) {
        this.empresa = empresa;
        return modificar();  
    }


     @Override
    public Integer eliminar(Empresa empresa) {
        this.empresa = empresa;
        return eliminar();  
    }

    @Override
    protected String obtenerListaDeAtributosParaInsert() {
        return "idEmpresa, idUsuario, nombreCEO";
    }

    @Override
    protected String obtenerListaDeValoresParaInsert() {
        String sql = "";
        sql = sql.concat(this.empresa.getIdEmpresa().toString());
        sql = sql.concat(", ");
        sql = sql.concat(this.empresa.getIdUsuario().toString());
        sql = sql.concat(", ");
        sql = sql.concat("'").concat(this.empresa.getNombreCEO()).concat("'");
        return sql;
    }

    @Override
    protected String obtenerListaDeAtributosYValoresParaUpdate() {
        String sql = "";
        sql = sql.concat("idEmpresa = " + this.empresa.getIdEmpresa().toString());
        sql = sql.concat(", ");
        sql = sql.concat("idUsuario = " + this.empresa.getIdUsuario().toString());
        sql = sql.concat(", ");
        sql = sql.concat("nombreCEO = '").concat(this.empresa.getNombreCEO()).concat("'");
        return sql;
    }

    @Override
    protected String obtenerCondicionWhereId() {
        // Retorna la condición WHERE para identificar la empresa por su ID
        return "idEmpresa = " + this.empresa.getIdEmpresa();
    }
    
    @Override
    public ArrayList<Empresa> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
