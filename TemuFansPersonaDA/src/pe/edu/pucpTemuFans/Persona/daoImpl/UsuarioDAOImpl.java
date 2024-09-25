/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucpTemuFans.Persona.daoImpl;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Persona.dao.UsuarioDAO;
import pe.edu.pucp.TemuFans.Persona.model.Usuario;
import pe.edu.pucp.TemuFans.db.DAOImpl;

/**
 *
 * @author usuario
 */
public class UsuarioDAOImpl extends DAOImpl implements UsuarioDAO{
    private Usuario usuario;
    
    public UsuarioDAOImpl() {
        super("Usuario");
        this.usuario = null;
    }

    @Override
    public Integer insertar(Usuario usuario) {
        this.usuario=usuario;
        return this.insertar();
    }

    @Override
    public Integer modificar(Usuario usuario) {
       this.usuario=usuario;
        return this.modificar();
    }

    @Override
    public Integer eliminar(Usuario usuario) {
        this.usuario=usuario;
        return this.eliminar();
    }

    @Override
    public ArrayList<Usuario> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected  String obtenerListaDeAtributosParaInsert(){
        return "idUsuario,tipo_usuario,tipo_doi,doi,nombre,correo,direccion,telefono";
    }
    @Override
    protected  String obtenerListaDeValoresParaInsert(){
        String sql = "";
        sql = sql.concat("'" + this.usuario.getId().toString() + "'");
        sql = sql.concat(", ");
        sql = sql.concat("'"+this.usuario.getTipo_usuario());
        sql = sql.concat(", ");
        sql = sql.concat("'" + this.usuario.getTipo_de_doi() + "'");
        sql = sql.concat(", ");
        sql = sql.concat("'" + this.usuario.getDoi()+ "'");        
        sql = sql.concat(", ");
        sql = sql.concat("'" + this.usuario.getNombre()+ "'");        
        sql = sql.concat(", ");
        sql = sql.concat("'" + this.usuario.getCorreo()+ "'");        
        sql = sql.concat(", ");
        sql = sql.concat("'" + this.usuario.getDireccion()+ "'");        
        sql = sql.concat(", ");
        sql = sql.concat("'" + this.usuario.getTelefono()+ "'");        
        
        return sql;
    }
       @Override
    protected String obtenerListaDeAtributosYValoresParaUpdate() {
        String sql = "";
        // Asumimos que "this.usuario" tiene los atributos correctos.
        sql = sql.concat("idUsuario = " + this.usuario.getId().toString());
        sql = sql.concat(", ");
        sql = sql.concat("tipo_usuario = '" + this.usuario.getTipo_usuario() + "'");
        sql = sql.concat(", ");
        sql = sql.concat("tipo_doi = '" + this.usuario.getTipo_de_doi() + "'");
        sql = sql.concat(", ");
        sql = sql.concat("doi = '" + this.usuario.getDoi() + "'");
        sql = sql.concat(", ");
        sql = sql.concat("nombre = '" + this.usuario.getNombre() + "'");
        sql = sql.concat(", ");
        sql = sql.concat("correo = '" + this.usuario.getCorreo() + "'");
        sql = sql.concat(", ");
        sql = sql.concat("direccion = '" + this.usuario.getDireccion() + "'");
        sql = sql.concat(", ");
        sql = sql.concat("telefono = '" + this.usuario.getTelefono() + "'");

        return sql;
    }

    
    
    @Override
    protected String obtenerCondicionWhereId(){
        return "idProveedor="+usuario.getId().toString(); 
    }
    
}
