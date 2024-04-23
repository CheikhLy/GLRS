package entities;
import enums.specialite;
import enums.etat;

public class rv{
    private String date;
    private String heure;
    private String motif;
    private etat etat;
    public etat getEtat() {
        return etat;
    }
    public void setEtat(etat etat) {
        this.etat = etat;
    }
    private specialite specialite;
    public specialite getSpecialite() {
        return specialite;
    }
    public void setSpecialite(specialite specialite) {
        this.specialite = specialite;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getHeure() {
        return heure;
    }
    public void setHeure(String heure) {
        this.heure = heure;
    }
    public String getMotif() {
        return motif;
    }
    public void setMotif(String motif) {
        this.motif = motif;
    }
}