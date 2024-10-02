/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Transaccion.model;

import java.util.Date;

/**
 *
 * @author Leoncio
 */
public class Transaccion {
    private String id_transaccion;
    private Date fecha_emision;
    private double subtotal;
    private double impuestos;
    private double total;
    private TipoTransaccion tipoTransaccion;
           
}
