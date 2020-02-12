package IGuide;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import entites.Guide;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author nature
 * @param <T>
 */
public interface IGuide<T> {
    void ajouter(T t) throws SQLException;
    void supprimer (Guide g) ;
    void update(Guide g,String nom, String prenom) ;
    List<T> readAll() throws SQLException;
    List<T> trier() throws SQLException;
    List<T> RECHERCHER(int idd) throws SQLException;
}
