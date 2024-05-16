package entities;
import java.util.ArrayList;
import java.util.List;
public class Cours {
    private int id;
    private String module;
    private Professeur professeur;
    private Session session;
    private static int cpt = 0;
    private List<CoursClasses> coursClasses = new ArrayList<>();
    
    
    public Cours(String module, Professeur professeur, Session session) {
        id = cpt++;
        this.module = module;
        this.professeur = professeur;
        this.session = session;
    }

    public Cours() {
        id=cpt++;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getModule() {
        return module;
    }
    public void setModule(String module) {
        this.module = module;
    }
    public Professeur getProfesseur() {
        return professeur;
    }
    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }
    public Session getSession() {
        return session;
    }
    public void setSession(Session session) {
        this.session = session;
    }
    public static int getCpt() {
        return cpt;
    }
    public static void setCpt(int cpt) {
        Cours.cpt = cpt;
    }


}
