/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Empresa.daoImpl;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Empresa.dao.BancoDAO;
import pe.edu.pucp.TemuFans.Empresa.model.Banco;
import pe.edu.pucp.TemuFans.db.DAOImpl;



/**
 *
 * 
 */
public class BancoDAOImpl extends DAOImpl implements BancoDAO{
    private Banco banco;


    public BancoDAOImpl() {
        super("Banco");  
    }

   
    @Override
    public Integer insertar(Banco banco) {
        this.banco = banco;
        return insertar();  
    }

  
    @Override
    public Integer modificar(Banco banco) {
        this.banco = banco;
        return modificar();  
    }

   
    @Override
    public Integer eliminar(Banco banco) {
        this.banco = banco;
        return eliminar();  
    }

    @Override
    protected String obtenerListaDeAtributosParaInsert() {
        
        return "idBanco, razonSocial, swift_bic, telefono";
    }

    @Override
    protected String obtenerListaDeValoresParaInsert() {
       
        String sql = "";
        sql = sql.concat(this.banco.getIdBanco().toString());  
        sql = sql.concat(", ");
        sql = sql.concat("'").concat(this.banco.getRazonSocial()).concat("'"); 
        sql = sql.concat(", ");
        sql = sql.concat("'").concat(this.banco.getSwift_bic()).concat("'"); 
        sql = sql.concat(", ");
        sql = sql.concat(this.banco.getTelefono().toString());  
        return sql;
    }

    @Override
    protected String obtenerListaDeAtributosYValoresParaUpdate() {
       
        String sql = "";
        sql = sql.concat("idBanco = " + this.banco.getIdBanco().toString()); 
        sql = sql.concat(", ");
        sql = sql.concat("razonSocial = '").concat(this.banco.getRazonSocial()).concat("'");
        sql = sql.concat(", ");
        sql = sql.concat("swift_bic = '").concat(this.banco.getSwift_bic()).concat("'");
        sql = sql.concat(", ");
        sql = sql.concat("telefono = ").concat(this.banco.getTelefono().toString());
        return sql;
    }

    @Override
    protected String obtenerCondicionWhereId() {
       
        return "idBanco = " + this.banco.getIdBanco();
    }

    @Override
    public ArrayList<Banco> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}
