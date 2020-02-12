/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Utils.DataBase;
import entites.ReservationPersonnel;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nature
 */
public class ServiceReservationPersonnel {
 private Connection con;
    private Statement ste;

    public ServiceReservationPersonnel() {
        con = DataBase.getInstance().getConnection();

    }  
    public void ajouter(ReservationPersonnel rp) throws SQLException {
        ste = con.createStatement();
        String requeteInsert = "INSERT INTO `esprit`.`ReservationGuidePersonnel` (`id_reservation`, `date_db_res`, `date_fin_res`, `id`) "
                + "VALUES (NULL, '" + rp.getDatedb() + "', '" + rp.getDatefin() + "', '" + rp.getTelephone() +  "');";
        ste.executeUpdate(requeteInsert);
    }
    
}
