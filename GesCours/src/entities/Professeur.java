package entities;

public class Professeur {
    private String id;
    private String nom;
    private String prenom;
    private static int nbr;
    private String specialite;

    
    public Professeur( String nom, String prenom) {
        id = "P0" + (++nbr);
        this.nom = nom;
        this.prenom = prenom;
    }

    
    public Professeur() {
        id = "P0" + (++nbr);
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
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


    @Override
    public String toString() {
        return "Professeur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        Professeur other = (Professeur) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }


    public static int getNbr() {
        return nbr;
    }


    public static void setNbr(int nbr) {
        Professeur.nbr = nbr;
    }


    public String getSpecialite() {
        return specialite;
    }


    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    
}
