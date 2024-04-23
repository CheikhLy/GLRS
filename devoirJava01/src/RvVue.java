import entities.rv;
import enums.*;
import java.util.Scanner;

public class RvVue {
    public rv saisieRv(Scanner scanner) {
        rv rv = new rv();

        scanner.nextLine();
        System.out.println("entrer la date");
        rv.setDate(scanner.nextLine());

        System.out.println("entrer l'heure");
        rv.setHeure(scanner.nextLine());

        System.out.println("entrer le motif ");
       rv.setMotif(scanner.nextLine());

       System.out.println("entrer la specialite ");
       rv.setSpecialite(askSpecialite(scanner));

       System.out.println("entrer l'etat ");
       rv.setEtat(asketat(scanner));
        return rv;
}
public specialite askSpecialite(Scanner scanner) {
    int choix;
    do {
        System.out.println("1-  Cardiologie");
        System.out.println("2-  Ophtalmologie");
        System.out.println("3-  Urologue");
        choix = scanner.nextInt();
    } while (choix > 4 || choix < 1);
    return specialite.values()[choix - 1];
}
public etat asketat(Scanner scanner) {
    int choix;
    do {
        System.out.println("1-  Encours");
        System.out.println("2-  Validee");
        System.out.println("3-  Annulee");
        choix = scanner.nextInt();
    } while (choix > 3 || choix < 1);
    return etat.values()[choix - 1];
}


}