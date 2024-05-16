package entities;
import java.util.ArrayList;
import java.util.List;

public class Professeur{
    int id;
    String NomComplet;
    private static int nbr;
    private List<Classe> classe=new ArrayList<>();
  public Professeur(String id, String nom) {
        this.id = id;
        this.nom = NomComplet;
    }
public Professeur() {
        id=++nbr;
    }

  
    public int getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomComplet() {
        return NomComplet;
    }

    public void setNomComplet(String NomComplet) {
        this.NomComplet = NomComplet;
    }
}