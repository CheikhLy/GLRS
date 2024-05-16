
import java.util.Scanner;

import Services.ClasseService;
import Services.CoursService;
import Services.SeanceService;
import View.ClasseView;
import View.CoursView;
import View.SeanceView;
import core.Service;
import entities.Classe;
import entities.Cours;
import entities.Seance;
public class App {
    public static void main(String[] args) throws Exception {
        Service<Cours> CoursService=new CoursService();
        Service<Professeur> ProfService=new ProfService();
     //   CoursView coursview=new CoursView(ClasseService,seanceView,SeanceService);


       
        int choix;
      do {
        choix=  menu() ;
            switch (choix) {
                case 1->ProfService.save(profview.saisie());
                case 2->profview.afficher(ProfService.show());
                case 3->CoursService.save(coursview.saisie());
                case 4->coursview.afficher(CoursService.show());
               

            }
        }while (choix!=5); 
    }

    }
        public static int menu() {
        System.out.println("1---Créer une professeur");
        System.out.println("2---Lister les profeseur");
        System.out.println("3---Creer un cours");
        System.out.println("4---Lister tous les cours ");
        System.out.println("5---Lister tous les cours d'un professeur");
        return scanner.nextInt();

 
}
}
