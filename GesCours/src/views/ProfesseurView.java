package views;

import core.Services;
import entities.Professeur;
public class ProfesseurView  extends ViewImpl<Professeur>{
    private  Services<Professeur> professeurService;
    public  ProfesseurView( Services<Professeur> professeurService){
           this.professeurService=professeurService;
    }

      @Override
       public Professeur saisie(){
        Professeur professeur=new Professeur();
        String nom;
        String prenom;
        System.out.println("Entrer le nom");
        nom=scanner.next();
        System.out.println("Entrer le prenom");
        prenom=scanner.nextLine();
        professeur.setNom(nom);
        professeur.setPrenom(prenom);
        System.out.println("Entrer la specialite du professeur");
        professeur.setSpecialite(scanner.nextLine());
        return professeur;
       }

   
} 