package proxy.spitalA9.main;

import proxy.spitalA9.clase.Pacient;
import proxy.spitalA9.clase.Spital;
import proxy.spitalA9.proxy.ProxyCuAsigurare;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Ionescu", false);
        Spital spital = new Spital("Principal");

        spital.interneazaPacient(pacient);

        ProxyCuAsigurare proxyCuAsigurare = new ProxyCuAsigurare(spital);
        proxyCuAsigurare.interneazaPacient(pacient);
    }
}
