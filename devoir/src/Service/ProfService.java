package Services;

import java.util.ArrayList;
import java.util.List;

import core.Service;
import entities.Classe;

public class ProfService implements Service<Professeur> {

    List<Professeur>professeur=new ArrayList<>();
    

    @Override
    public boolean save(Professeur prof) {
        professeur.add(prof);
        return true;
      
    }


    @Override
    public Classe find(int id) {
        for (Professeur profs : prof) {
            if(profs.getId()==id){
                return prof;
            }
            
        }
        return null;

    }


    @Override
    public List<Professeur> show() {
       return professeur;
    }


   }
