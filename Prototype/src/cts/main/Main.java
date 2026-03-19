package cts.main;

import cts.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare("Popescu Ilinca", 12, 3,"1234567891234567");
        Rezervare rezervare1 = (Rezervare) rezervare.copiaza();
        rezervare1.setOra(19);
        System.out.println(rezervare1.toString());;
    }
}
