/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nhenaff
 */
public class Utilisateur {
    private String id;
    private String login;
    private String nom;
    private String prenom;
    private String adresse;
    private String ville;
    private String dateEmbauche;

    public Utilisateur(String id, String login, String nom, String prenom, String adresse,String ville, String dateEmbauche) {
        this.id = id;
        this.login = login;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ville = ville;
        this.dateEmbauche = dateEmbauche;
    }

    public String getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getDateEmbauche() {
        return dateEmbauche;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setDateEmbauche(String dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }
    
    public Object[] Tr()
            {
                Object[] o = new Object[]{this.id, this.nom, this.prenom, this.adresse, this.ville, this.dateEmbauche};
                return o;
            }
    
   

                                



    
}
