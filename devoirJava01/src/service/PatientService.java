package service;
import entities.patient;

public class PatientService {
    private int n;
    patient tabPatient[] = new patient[10];

    public void addPatient(patient pt) {
        if (n < 10) {
            tabPatient[n++] = pt;
        }
    }
    public void listePatient() {
        for (patient value : tabPatient) {
            if (value != null) {
                System.out.println(value.toString());
            }
        }
    }
}
