package Services;

import java.util.ArrayList;
import java.util.List;

import core.Service;
import entities.Classe;

public class CoursService implements Service<Cours> {

    List<Cours>cours=new ArrayList<>();
    

    @Override
    public boolean save(Cours cr) {
        cours.add(cr);
        return true;
      
    }


    @Override
    public Cours find(int id) {
        for (Cours crs : cours) {
            if(clas.getId()==id){
                return crs;
            }
            
        }
        return null;

    }


    @Override
    public List<Classe> show() {
       return classes;
    }


   }
