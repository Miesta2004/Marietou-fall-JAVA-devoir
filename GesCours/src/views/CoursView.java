package views;

import java.util.List;

import core.Services;
import entities.Session;
import entities.Cours;
import entities.Professeur;
import entities.CoursClasses;
import services.ProfesseurService;
import services.CoursService;

public class CoursView extends ViewImpl<Cours> {
    private Services<Professeur> professeurService;
    private Services<Session> sessionService;

    public CoursView(Services<Professeur> professeurService, Services<Session> sessionService, Services<Produit> produitService, Service<Commande> comService) {
      this.professeurService = professeurService;
      this.sessionService = sessionService;
   }

   @Override
    public Cours saisie() {
        Cours cours = new Cours();
        Professeur professeur;
        do {
            System.out.println("Entrer l'Id du Professeur");
            String id = scanner.next();
            professeur = professeurService.findById(id);
        }while(professeur == null);
        cours.setProfesseur(professeur);
        String module;
        do {
            System.out.println("Entrer le module du Cours");
            module = scanner.next();
        } while (module.length() == 0);
        cours.setModule(module);
        Session session;
        cours.setSession(session);
        return cours;
   }

   public Commande rechercherCommandeParNumero() {
      String numero;
      System.out.println("Entrer le Numero");
      numero = scanner.nextLine();
      return comService.getBy(numero);

   }

   public void showProduitCommande(List<ProduitCommande> produitCommandes) {
      for (ProduitCommande produitCommande : produitCommandes) {
         System.out.println(produitCommande.getProduit() +
               " Qte Commande : " + produitCommande.getQteCmde() +
               " Montant : " + produitCommande.getMontant());
      }
   }

    public void showPayementCommande(List<Payement> payements) {
       for (Payement payement : payements) {
          System.out.println(
               " Montant : " + payement.getMontant() );  
         }
   }

   public void saisiePayement(Facture facture) {
      char response;
      do {
         System.out.println("Voulez Enregistrer un Paiement O/N");
         response = scanner.next().charAt(0);
         if (response == 'O') {
            System.out.println("Entrer le Montant");
            double montant = scanner.nextDouble();
            Payement payement = new Payement();
            payement.setMontant(montant);

            facture.add(payement);
            payement.setFacture(facture);

         }

      } while (response == 'O');
   }

}