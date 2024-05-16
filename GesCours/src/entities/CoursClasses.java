package entities;

public class CoursClasses {
    private int totalHeures;
    private Cours cours;
    private Classe classe;


    public CoursClasses(int totalHeures, Cours cours, Classe classe) {
        this.totalHeures = totalHeures;
        this.cours = cours;
        this.classe = classe;
    }

    public CoursClasses() {
    }
    
    public int getTotalHeures() {
        return totalHeures;
    }
    public void setTotalHeures(int totalHeures) {
        this.totalHeures = totalHeures;
    }
    public Cours getCours() {
        return cours;
    }
    public void setCours(Cours cours) {
        this.cours = cours;
    }
    public Classe getClasse() {
        return classe;
    }
    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    @Override
    public String toString() {
        return "CoursClasses [totalHeures=" + totalHeures + ", cours=" + cours + ", classe=" + classe + "]";
    }
 
}
