package services;

import core.Services;
import entities.Cours;
import java.util.List;
import java.util.ArrayList;
//les UseCase de  cours
public class CoursService implements Services<Cours> {
    List<Cours> cours=new ArrayList<>();
    @Override
    public boolean save(Cours cours) {
        this.cours.add(cours);
        return false;
    }

    @Override
    public List<Cours> show() {
        return cours;
    }

    @Override
    public Cours findById(String nom, String prenom) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public int count() {
        return cours.size();

    }

    // @Override
    // public Cours getBy(String numero) {
    //    for (Commande commande : commandes) {
    //           if (commande.getMumero().compareTo(numero)==0) {
    //               return commande;
    //           } 
    //     }
    //       return null;
    // }
    // @Override
    // public int count() {
    //     return commandes.size();
    // }

    
}
