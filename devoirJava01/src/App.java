package service;
import  java.util.*;
import entities.*;
import enums.*;
import service.PatientService;
import service.RvService;
import entities.patient;
public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        PatientV patientV= new  PatientVue();
        PatientService patientS=new PatientService() ;
        RvVue  rvV= new RvVue();
        RvService  rvS= new RvService();
         int choix;
         do {
            switch (choix = menu()) {
                case 1 -> {
                    patient pt = PatientV.saisiePatient(scanner);
                    PatientService.addPatient(pt);
                }
                case 2 -> {
                   PatientService.listePatient();
                }
                case 3 -> {
                    System.out.println("entrer le numero du Patient");
                }
                case 4 -> {
                    rv rv = RvVue.saisieRv(scanner, pt);
                   RvService.addRv(rv);
                    patientS.addRv(pt.getTabRv(), rv, pt);
                }
                case 5 -> {
                    RvService.listeRv(pt);
                }
         } while (choix != 6);
    }
    public static int menu() {
        System.out.println("1-  Ajouter Patient");
        System.out.println("2-  Lister Patient");
        System.out.println("3-  Ajouter Rv");
        System.out.println("4-  lister Rv");
        System.out.println("5-  lister Rv d'un patient");
        System.out.println("6-  Quitter");
        return scanner.nextInt();
    }
}
}