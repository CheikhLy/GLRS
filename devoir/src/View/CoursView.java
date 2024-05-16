import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// Assurez-vous que la classe Cours est définie dans votre programme
// ...

public class SaisieCours {

    public  Cours saisie() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez l'ID du cours: ");
        cours.setId(scanner.nextLine());
        System.out.print("Entrez la date du cours (format YYYY-MM-DD): ");
        cours.setDate(LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ISO_LOCAL_DATE));

        System.out.print("Entrez l'heure de début du cours (format HH:MM): ");
        cours.setHeureDb(LocalTime.parse(scanner.nextLine(), DateTimeFormatter.ISO_LOCAL_TIME));

        System.out.print("Entrez l'heure de fin du cours (format HH:MM): ");
        cours.setHeureFin(LocalTime.parse(scanner.nextLine(), DateTimeFormatter.ISO_LOCAL_TIME));

        System.out.print("Entrez l'ID du professeur: ");
        cours.setProfesseur(scanner.nextLine());
        // Professeur professeur = null;
        // for (Professeur prof : professeurs) {
        //     if (prof.getId().equals(idProf)) {
        //         professeur = prof;
        //         break;
        //     }
        // }

        // if (professeur == null) {
        //     System.out.println("Aucun professeur trouvé avec l'ID fourni.");
        //     return null;
        // }

        return new Cours(id, date, heureDb, heureFin, professeur);
    }
        public void listerCourse(Cours cours){
        if (cours!=null) {
            for (Cours co : cours) {
                System.out.println(co);
            }   
        }
        else{
            System.out.println("c'est vide");
        }
        
    }

}