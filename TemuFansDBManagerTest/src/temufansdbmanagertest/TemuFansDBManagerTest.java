/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temufansdbmanagertest;

import java.sql.Connection;
import pe.edu.pucp.TemuFans.config.DBManager;


public class TemuFansDBManagerTest {

    public static void main(String[] args) {
        //DBManager dbManager = new DBManager();
        DBManager dbManager = null;
        System.out.println(dbManager);
        dbManager = DBManager.getInstance();
        System.out.println(dbManager);
        dbManager = DBManager.getInstance();
        System.out.println(dbManager);
        dbManager = DBManager.getInstance();
        System.out.println(dbManager);
        Connection conexion = dbManager.getConnection();        
    }
    
}
