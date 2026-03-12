package ro.ase.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant {
    private String ocupatie;
    private int salariu;
    private static float sumaFinantata = 10;

    public static float getSumaFinantata() {
        return sumaFinantata;
    }

    public static void setSumaFinantata(float sumaFinantata) {
        Angajat.sumaFinantata = sumaFinantata;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public Angajat() {
        super();

    }

    @Override
    public String toString() {
        StringBuilder sbAngajat = new StringBuilder();
        sbAngajat.append("Angajatul {");
        sbAngajat.append(super.toString());
        sbAngajat.append(" ocupatie ");
        sbAngajat.append(this.ocupatie);
        sbAngajat.append(" salariul ");
        sbAngajat.append(this.salariu);
        sbAngajat.append("}");
        return sbAngajat.toString();
    }


    public void afisareVenit() {
        System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste " + Angajat.sumaFinantata + " Euro/zi in proiect.");
    }

}
