/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Empresa.daoImpl;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Empresa.dao.CuentaBancariaDAO;
import pe.edu.pucp.TemuFans.Empresa.model.CuentaBancaria;
import pe.edu.pucp.TemuFans.db.DAOImpl;

/**
 *
 * @author Ricardo
 */
public class CuentaBancariaDAOImpl extends DAOImpl implements CuentaBancariaDAO{
    private CuentaBancaria cuentaBancaria;

    public CuentaBancariaDAOImpl() {
        super("CuentaBancaria");
        this.cuentaBancaria=null;
    }
    @Override
    protected String obtenerListaDeAtributosParaInsert() {
        return "codigoInterbancario, idUsuario, idBanco, IBAN, estado, moneda";
    }

    @Override
    protected String obtenerListaDeValoresParaInsert() {
        String sql = "";
        sql = sql.concat(this.cuentaBancaria.getCodigoInterbancario().toString());
        sql = sql.concat(", ");
        sql = sql.concat(this.cuentaBancaria.getIdUsuario().toString());
        sql = sql.concat(", ");
        sql = sql.concat(this.cuentaBancaria.getIdBanco().toString());
        sql = sql.concat(", ");
        sql = sql.concat(this.cuentaBancaria.getIBAN().toString());
        sql = sql.concat(", ");
        sql = sql.concat("'").concat(this.cuentaBancaria.getEstado().toString()).concat("'");
        sql = sql.concat(", ");
        sql = sql.concat("'").concat(this.cuentaBancaria.getMoneda().toString()).concat("'");
        return sql;
    }

    @Override
    protected String obtenerListaDeAtributosYValoresParaUpdate() {
        String sql = "";
        sql = sql.concat("codigoInterbancario = " + this.cuentaBancaria.getCodigoInterbancario().toString());
        sql = sql.concat(", ");
        sql = sql.concat("idUsuario = " + this.cuentaBancaria.getIdUsuario().toString());
        sql = sql.concat(", ");
        sql = sql.concat("idBanco = " + this.cuentaBancaria.getIdBanco().toString());
        sql = sql.concat(", ");
        sql = sql.concat("IBAN = " + this.cuentaBancaria.getIBAN().toString());
        sql = sql.concat(", ");
        sql = sql.concat("estado = '" + this.cuentaBancaria.getEstado().toString() + "'");
        sql = sql.concat(", ");
        sql = sql.concat("moneda = '" + this.cuentaBancaria.getMoneda().toString() + "'");
        return sql;
    }

    @Override
    public Integer insertar(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria=cuentaBancaria;
        return this.insertar();
    }

    @Override
    public Integer modificar(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria=cuentaBancaria;
        return this.modificar();
    }

    @Override
    public Integer eliminar(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria=cuentaBancaria;
        return this.eliminar();
    }

    @Override
    public ArrayList<CuentaBancaria> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected String obtenerCondicionWhereId() {
        return "codigoInterbancario = " + this.cuentaBancaria.getCodigoInterbancario();
    }
    
}
