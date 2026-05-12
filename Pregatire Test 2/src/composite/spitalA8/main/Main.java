package composite.spitalA8.main;

import composite.spitalA8.clase.Departament;
import composite.spitalA8.clase.Sectie;
import composite.spitalA8.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura depSpital = new Departament("Spital");
        Structura depAdministrativ = new Departament("Administrativ");
        Structura sectiaSecretariat = new Sectie("Secretariat", 10);
        Structura sectieManagement = new Sectie("Management", 3);

        ((Departament) depSpital).adaugaStructura(depAdministrativ);
        ((Departament) depSpital).adaugaStructura(sectieManagement);
        ((Departament) depAdministrativ).adaugaStructura(sectiaSecretariat);

        depSpital.afiseazaDetaliiStructura("");

        ((Departament) depSpital).stergeStructura(sectieManagement);
        ((Departament) depAdministrativ).adaugaStructura(sectieManagement);
        System.out.println("\nDupa modificare");
        depSpital.afiseazaDetaliiStructura(" ");
    }
}
