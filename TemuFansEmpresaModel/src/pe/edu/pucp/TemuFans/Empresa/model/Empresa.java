/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Empresa.model;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Inventario.model.Almacen;
import pe.edu.pucp.TemuFans.Persona.model.Usuario;

public class Empresa {
    private ArrayList<Usuario> personas;
    private ArrayList<Almacen> almacenes;
    
    public Empresa() {
        this.personas = null;
        this.almacenes = null;
    }

    public Empresa(ArrayList<Usuario> personas, ArrayList<Almacen> almacenes) {
        this.personas = personas;
        this.almacenes = almacenes;
    }
    
    
    /**
     * @return the personas
     */
    public ArrayList<Usuario> getPersonas() {
        return personas;
    }

    /**
     * @param personas the personas to set
     */
    public void setPersonas(ArrayList<Usuario> personas) {
        this.personas = personas;
    }

    /**
     * @return the almacenes
     */
    public ArrayList<Almacen> getAlmacenes() {
        return almacenes;
    }

    /**
     * @param almacenes the almacenes to set
     */
    public void setAlmacenes(ArrayList<Almacen> almacenes) {
        this.almacenes = almacenes;
    }
    
    
}
