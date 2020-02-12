/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IGuide;

import entites.Guide;
import entites.ReservationPersonnel;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author nature
 */
public interface IReservationPersonnel <T> {
    void ajouter(T t) throws SQLException;
    void supprimer (ReservationPersonnel rp) ;
    void update(Guide g,String nom, String prenom) ;
    List<T> readAll() throws SQLException;
    List<T> trier() throws SQLException;
    
}