/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temufanspersonatest;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import pe.edu.pucp.TemuFans.Persona.dao.ClienteDAO;
import pe.edu.pucp.TemuFans.Persona.model.Cliente;
import pe.edu.pucp.TemuFans.Persona.model.Usuario;
import pe.edu.pucpTemuFans.Persona.daoImpl.ClienteDAOImpl;
/**
 *
 * @author leoncio
 */
public class TemuFansPersonaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");        
        Cliente a1= new Cliente("1","1","1","Juan","asdsda",7945);
        ClienteDAO a2=new ClienteDAOImpl();
        a2.insertar(a1);
    }
    
}
