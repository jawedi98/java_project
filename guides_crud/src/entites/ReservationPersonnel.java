/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Date;

/**
 *
 * @author nature
 */
public class ReservationPersonnel {
    private int id_reservation;
    private Date date_db_res;
    private Date date_fin_res;
    private int id_guide;
    

    public ReservationPersonnel(int id_reservation, Date date_db_res, Date date_fin_res, int id_guide) {
        this.id_reservation = id_reservation;
        this.date_db_res = date_db_res;
        this.date_fin_res = date_fin_res;
        this.id_guide = id_guide;
        
    }

    public ReservationPersonnel(Date date_db_res, Date date_fin_res) {
         this.date_db_res = date_db_res;
        this.date_fin_res = date_fin_res;
    }

 
   
    public int getId() {
        return id_reservation;
    }

    public void setID(int id_reservation) {
        this.id_reservation= id_reservation;
    }
    public Date getDatedb() {
        return date_db_res;
    }

    public void setDatedb(Date date_db_res) {
        this.date_db_res= date_db_res;
    }

    public Date getDatefin() {
        return date_db_res;
    }

    public void setDatefin(Date date_fin_res) {
        this.date_fin_res= date_fin_res;
    }
     

    @Override
    public String toString() {
        return "\nGuide{" + "id reservation =" + id_reservation + ", date de la début du reservation=" + date_fin_res + ", date de la fin du reservation =" + date_fin_res + ", Id du guide =" + id_guide + '}';
    }
    
}
