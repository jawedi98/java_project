/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import IGuide.IGuide;
import entites.Guide;
import java.sql.SQLException;
import java.util.List;
import java.sql.*;
import Utils.DataBase;
import entites.Guide;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author House
 */
public class ServiceGuide implements IGuide<Guide>
{

    private Connection con;
    private Statement ste;

    public ServiceGuide() {
        con = DataBase.getInstance().getConnection();

    }

    
    public void ajouter(Guide g) throws SQLException {
        ste = con.createStatement();
        String requeteInsert = "INSERT INTO `esprit`.`guides` (`id`, `nom`, `prenom`, `telephone`, `adresse`, `etat`) "
                + "VALUES (NULL, '" + g.getNom() + "', '" + g.getPrenom() + "', '" + g.getTelephone() + "', '" + g.getAdresse() + "', '" + g.getEtat() + "');";
        ste.executeUpdate(requeteInsert);
        JOptionPane.showMessageDialog(null, "guide ajouté");
    }
    
    public void ajouter1(Guide g) throws SQLException
    {
    PreparedStatement pre=con.prepareStatement("INSERT INTO `esprit`.`guides` ( `nom`, `prenom`, `telephone`) VALUES ( ?, ?, ?);");
    pre.setString(1, g.getNom());
    pre.setString(2, g.getPrenom());
    pre.setInt(3, g.getTelephone());
    pre.executeUpdate();
    
    }
            

   
    
   /* public boolean delete(Guide g) throws SQLException {
        
    }*/

    
    
    public void update(Guide G,String nom,String prenom) {
   
              //ste = con.createStatement();
        /*String requeteupdate = "UPDATE guides set nom ="+nom
                +", prenom="+prenom
                +", telephone="+telephone
                +", adresse="+adresse
                +", etat="+etat
                +" WHERE id="+id+"";
               String requete = "UPDATE guides SET `id` = ? where id = ? ;";
              ste.executeUpdate(requete);
              System.out.println("ok");*/
        try{
        PreparedStatement pt=con.prepareStatement("UPDATE guides SET `nom` = ? , `prenom` = ? where id = ? ;");
        pt.setString(1,nom);
        pt.setString(2,prenom);
        pt.setInt(3,G.getId());
        pt.execute();
        }catch (SQLException ex)
        {
            Logger.getLogger(ServiceGuide.class.getName()).log(Level.SEVERE,null,ex);
        }
       
        
              
              
              
          }
    public void supprimer(Guide g)
    {
    
      try {
          PreparedStatement pt= con.prepareStatement(" DELETE FROM `guides` WHERE `guides`.`id` = ? ;" );
          pt.setInt(1, g.getId());
          pt.execute();
      
      
      
      }catch (SQLException ex) {
                Logger.getLogger(ServiceGuide.class.getName()).log(Level.SEVERE,null,ex);

      }
    
    
    
    
    
    
    
    
    
    
    }
    @Override
      public List<Guide> trier() throws SQLException {
    List<Guide> arr=new ArrayList<>();
    ste=con.createStatement();
    ResultSet rs=ste.executeQuery("select * from guides order by id desc");
     while (rs.next()) {                
               int id=rs.getInt(1);
               String nom=rs.getString("nom");
                String prenom=rs.getString("prenom");
                String adresse=rs.getString("adresse");
               int etat;
        etat = rs.getInt("etat");
               int telephone=rs.getInt("telephone");
               Guide p=new Guide(id, nom, prenom, telephone, adresse, etat);
     arr.add(p);
     }
    return arr;
    }
    @Override
      public List<Guide> RECHERCHER(int idd) throws SQLException {
    List<Guide> arr=new ArrayList<>();
    ste=con.createStatement();
    ResultSet rs=ste.executeQuery("select * from guides where `id` = '"+idd+"' ");
     while (rs.next()) {                
               int id=rs.getInt(1);
               String nom=rs.getString("nom");
                String prenom=rs.getString("prenom");
                String adresse=rs.getString("adresse");
               int etat;
        etat = rs.getInt("etat");
               int telephone=rs.getInt("telephone");
               Guide p=new Guide(id, nom, prenom, telephone, adresse, etat);
     arr.add(p);
     }
    return arr;
    }
          

    /**
     *
     * @return
     * @throws SQLException
     */
    @Override
    public List<Guide> readAll() throws SQLException {
    List<Guide> arr=new ArrayList<>();
    ste=con.createStatement();
    ResultSet rs=ste.executeQuery("select * from guides");
     while (rs.next()) {                
               int id=rs.getInt(1);
               String nom=rs.getString("nom");
                String prenom=rs.getString("prenom");
                String adresse=rs.getString("adresse");
               int etat;
        etat = rs.getInt("etat");
               int telephone=rs.getInt("telephone");
               Guide p=new Guide(id, nom, prenom, telephone, adresse, etat);
     arr.add(p);
     }
    return arr;
    }

    

    

   
    

}
