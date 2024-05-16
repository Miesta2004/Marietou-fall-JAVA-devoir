package entities;

import java.time.LocalDate;
public class Session {
    private int idSession;
    private LocalDate dateSeance;
    private int heureDebut;
    private int heureFin;
    private static int nbr;
    private Cours cours;

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public Session(LocalDate dateSeance, int heureDebut, int heureFin) {
        idSession=nbr++;
        this.dateSeance = dateSeance;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }

    public Session() {
        idSession=nbr++;
    }

    public int getIdSession() {
        return idSession;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }

    public LocalDate getDateSeance() {
        return dateSeance;
    }

    public void setDateSeance(LocalDate dateSeance) {
        this.dateSeance = dateSeance;
    }

    public int getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(int heureDebut) {
        this.heureDebut = heureDebut;
    }

    public int getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(int heureFin) {
        this.heureFin = heureFin;
    }

    public static int getNbr() {
        return nbr;
    }

    public static void setNbr(int nbr) {
        Session.nbr = nbr;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + idSession;
        result = prime * result + ((dateSeance == null) ? 0 : dateSeance.hashCode());
        result = prime * result + heureDebut;
        result = prime * result + heureFin;
        result = prime * result + ((cours == null) ? 0 : cours.hashCode());
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
        Session other = (Session) obj;
        if (idSession != other.idSession)
            return false;
        if (dateSeance == null) {
            if (other.dateSeance != null)
                return false;
        } else if (!dateSeance.equals(other.dateSeance))
            return false;
        if (heureDebut != other.heureDebut)
            return false;
        if (heureFin != other.heureFin)
            return false;
        if (cours == null) {
            if (other.cours != null)
                return false;
        } else if (!cours.equals(other.cours))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Session [idSession=" + idSession + ", dateSeance=" + dateSeance + ", heureDebut=" + heureDebut
                + ", heureFin=" + heureFin + ", cours=" + cours + "]";
    }
    
}
