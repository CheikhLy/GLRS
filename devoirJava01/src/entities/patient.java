package entities;
import enums.specialite;
import enums.etat;

public class patient{

    public patient() {
    }
    @Override
    public String toString() {
        return "Patient [nomComplet=" + nomComplet + ", tel=" + tel + ", numero=" + numero + ", n=" + n + "]";
    }
    public patient(String nomComplet, String tel, String numero, int n) {
        this.nomComplet = nomComplet;
        this.tel = tel;
        this.numero = numero;
        this.n = n;
    }
    private String nomComplet;
    private String tel;
    private String numero;
    private int n;
    private static int NbrPatient;
    public String getNomComplet() {
        return nomComplet;
    }
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    public patient() {
        NbrPatient++;
        int id = NbrPatient;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
    public static int getNbrPatient() {
        return NbrPatient;
    }
    public static void setNbrPatient(int nbrPatient) {
        NbrPatient = nbrPatient;
    }
    
}