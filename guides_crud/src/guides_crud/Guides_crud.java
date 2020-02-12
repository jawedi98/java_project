/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guides_crud;

import Service.ServiceGuide;
import java.sql.SQLException;
import java.util.List;
import entites.Guide;
import Utils.DataBase;
import entites.Guide;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nature
 */
public class Guides_crud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiceGuide ser = new ServiceGuide();
        
        Guide p1 = new Guide("eya", "ben fadhel", 10, "cite", 6);
        Guide p2 = new Guide(23,"aaaa", "bbbbb", 10, "cite", 6);
          
       
        
        try {
            ser.ajouter(p2);
           // ser.update(p2, "aaaa", "bbbbb");
          //  List<Guide> list = ser.trier();
            List<Guide> list = ser.RECHERCHER(12);
            System.out.println(list);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author House
 */
