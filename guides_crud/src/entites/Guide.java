package entites;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nature
 */
public class Guide {
     private int id;
    private String nom;
    private String prenom;
    private int telephone;
    private String adresse;
    private int etat;

    public Guide(int id, String nom, String prenom, int telephone, String adresse,int etat) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.adresse = adresse;
        this.etat = etat;
    }

    public Guide(String nom, String prenom, int telephone,String adresse,int etat) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.adresse = adresse;
        this.etat = etat;
    }

 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }
    public int getEtat() {
        return etat;
    }
        public String getAdresse() {
        return adresse;
    }
        public void setAdresset(String adresse) {
        this.adresse = adresse;
    }
    public void setEtat(int etat) {
        this.etat = etat;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "\nGuide{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse =" + adresse + "telephone "+ telephone+ "etat" + etat+'}';
    }
}
