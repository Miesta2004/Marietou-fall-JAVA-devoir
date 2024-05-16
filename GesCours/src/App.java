import java.security.Provider.Service;
import java.util.Scanner;

import core.Services;
import entities.Cours;
import entities.Professeur;
import services.CoursService;
import services.ProfesseurService;
import views.CoursView;
import views.ProfesseurView;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Services<Professeur> professeurService=new ProfesseurService();
        Services<Cours> coursService=new CoursService();
        ProfesseurView professeurView=new ProfesseurView(professeurService);
        CoursView coursView=new CoursView(professeurService,coursService);
        System.out.println("Hello, World!");
        int choix;
        do {
            choix=menu();
            scanner.nextLine();
            switch (choix) {
                case 1:
                    professeurService.save(professeurView.saisie());
                    break;
                case 2:
                    professeurView.affiche(professeurService.show());
                    break;
                case 3:
                if (professeurService.count()!=0) {
                    Cours cours= coursView.saisie();
                    coursService.save(cours);
                break;
                }
                case 4:
                    coursView.affiche(coursService.show());
                    break;
                case 5:
                //afficher les cours d'un professeur
                

                case 6:
                    System.out.println("Au revoir");
        } while (choix!=6);

    }

    public static int menu() {

        System.out.println("1- Ajouter un professeur");

        System.out.println("2- Lister les Professeurs");

        System.out.println("3- Créer un cours ");

        System.out.println("4- Lister tous les cours");

        System.out.println("5- Lister les cours d’un professeur");

        System.out.println("6- Quitter");

        return scanner.nextInt();
}


}