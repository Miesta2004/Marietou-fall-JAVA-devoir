package views;

import java.util.List;

import core.Services;
import entities.Session;
import entities.Cours;
import entities.Professeur;
import entities.CoursClasses;
import services.ProfesseurService;
import services.CoursService;
public class SessionView {
    public Session saisie() {
        Session session = new Session();
        System.out.println("Entrer la Date JJ-MM-AAAA");
        session.setDate(formatDate(scanner.nextLine()));
        System.out.println("Entrer l'Heure de debut HH:MN");
        session.setHeureDebut(formatHeure(scanner.nextLine()));
        System.out.println("Entrer l'Heure de fin HH:MN");
        session.setHeureDebut(formatHeure(scanner.nextLine()));
        System.out.println("Choisir une Specialite");
        session.setSpecialite(saisieSpecialite());
        scanner.nextLine();
        System.out.println("Entrer le motif");
        session.setMotif(scanner.nextLine());
         
      return rv;
    }
}
