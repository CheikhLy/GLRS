    package View;
    import java.time.LocalDate;
    import core.Service;
    import entities.Cours;
    public class ProfView extends view<Professeur>{
    private Service<Classe>ClasseService;
    public CoursView(Service<Classe>ClasseService,SeanceView seanceView,Service<Seance>SeanceService) {
    }
    public class SaisieProfesseur {

    public  Professeur saisie() {
        Professeur professeur = new Professeur();
        System.out.print("Entrez l'ID du professeur: ");
        professeur.setI(scanner.nextLine());

        System.out.print("Entrez le nom du professeur: ");
        professeur.setNomComplet(scanner.nextLine());

        return  professeur;
    }
    }
     public void listerbyday(List<Professeur> listprof){
        if (listprof!=null) {
            for(Professeur prof : listprof) {
                    System.out.println(prof);
            }
        }
        
    }
    }