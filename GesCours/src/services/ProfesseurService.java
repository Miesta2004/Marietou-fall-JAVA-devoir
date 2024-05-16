package services;

import entities.Professeur;
import core.Services;
import java.util.List;
import java.util.ArrayList;
public class ProfesseurService implements Services<Professeur>{
    List <Professeur> professeurs = new ArrayList<>();
    @Override
    public boolean save(Professeur professeur) {
        professeurs.add(professeur);
        return true;
    }

    @Override
    public List<Professeur> show() {
        return professeurs;
    }
    
    public Professeur findById(String id) {
        for (Professeur professeur : professeurs) {
            if(professeur.getId().compareTo(id)==0) {
                return professeur;
            } 
        }
        return null;
    }

    @Override
    public int count() {
        return professeurs.size();
    }

}
