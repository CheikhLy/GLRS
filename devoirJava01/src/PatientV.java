import entities.patient;
import java.util.Scanner;

public class PatientV {
    public patient saisiePatient(Scanner scanner) {
        patient pt = new patient();

        scanner.nextLine();
        System.out.println("entrer le nom du patient");
        pt.setNomComplet(scanner.nextLine());

        System.out.println("entrer le numero");
        pt.setNumero(scanner.nextLine());

        System.out.println("entrer le telephone ");
        pt.setTel(scanner.nextLine());

        return pt;
    }

}
