package composite.main;

import composite.clase.Departament;
import composite.clase.Sectie;
import composite.clase.Structura;

public class Main {
    public static void main(String[] args) {

        Structura depSpital = new Departament("Spital");
        Structura depAdministrativ = new Departament("Administrativ");
        Structura sectieSecretariat = new Sectie("Secretariat", 10);
        Structura sectieManagement = new Sectie("Management", 3);

        ((Departament) depSpital).adaugaStructura(depAdministrativ);
        ((Departament) depSpital).adaugaStructura(sectieManagement);
        ((Departament) depAdministrativ).adaugaStructura(sectieSecretariat);

        depSpital.afiseazaDetaliiStructura("");

        ((Departament)depSpital).stergeStructura(sectieManagement);
        ((Departament)depAdministrativ).adaugaStructura(sectieManagement);
        System.out.println("\nDupa modificare");
        depSpital.afiseazaDetaliiStructura("");

    }
}
