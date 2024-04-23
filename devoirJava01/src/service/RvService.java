package service;
import entities.*;
import entities.patient;
public class RvService {
    rv tabRv[] = new rv[10];
    private int n;

    public void addRv(rv rv) {
        if (n < 10) {
            {
                tabRv[n++] = rv;
            }
        }   
}
public void listeRv() {
    for (rv value : tabRv) {
        if (value != null) {
            System.out.println(value);
        }
    }
}
public void listeRv(patient pt) {
    for (rv value : tabRv) {
        if (value != null) {
            System.out.println(value);
        }
    }
}

}
