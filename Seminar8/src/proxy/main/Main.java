package proxy.main;

import proxy.clase.Pacient;
import proxy.clase.Spital;
import proxy.proxy.ProxyCuAsigurare;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient(false, "David");
        Spital spital = new Spital("Judetean");

        spital.interneazaPacient(pacient);

        ProxyCuAsigurare proxy = new ProxyCuAsigurare(spital);
        proxy.interneazaPacient(pacient);

    }
}
