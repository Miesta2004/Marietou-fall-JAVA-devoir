package entities;

import java.util.ArrayList;
import java.util.List;

public class Classe {
    private int id;
    private String nomClasse;
    private String niveau;
    private String filiere;
    private static int nbr;
    private List<CoursClasses> coursClasses = new ArrayList<>();


    public Classe(int id, String nomClasse, String niveau, String filiere) {
        id=nbr++;
        this.nomClasse = nomClasse;
        this.niveau = niveau;
        this.filiere = filiere;
    }

    public Classe() {
        id=nbr++;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomClasse() {
        return nomClasse;
    }

    public void setNomClasse(String nomClasse) {
        this.nomClasse = nomClasse;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    @Override
    public String toString() {
        return "Classe [id=" + id + ", nomClasse=" + nomClasse + ", niveau=" + niveau + ", filiere=" + filiere + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((nomClasse == null) ? 0 : nomClasse.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Classe other = (Classe) obj;
        if (id != other.id)
            return false;
        if (nomClasse == null) {
            if (other.nomClasse != null)
                return false;
        } else if (!nomClasse.equals(other.nomClasse))
            return false;
        return true;
    }

    
    
}