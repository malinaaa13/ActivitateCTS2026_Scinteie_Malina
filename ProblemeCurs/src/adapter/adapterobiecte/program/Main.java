package adapter.adapterobiecte.program;

import adapter.adapterobiecte.clase.PachetCazare;
import adapter.adapterobiecte.clase.PachetMasinaInchiriata;
import adapter.adapterobiecte.clase.PachetTuristic;
import adapter.adapterobiecte.inchirieremasini.Masina;
import adapter.adapterobiecte.inchirieremasini.MasinaInchiriata;

public class Main {
    public static void main(String[] args) {
        PachetCazare cazare = new PachetCazare();
        cazare.descriere();
        cazare.rezervaPachet();

        PachetMasinaInchiriata pachetMasinaInchiriata = new PachetMasinaInchiriata(new MasinaInchiriata(new Masina("red12", 56.90)));
        pachetMasinaInchiriata.descriere();
        pachetMasinaInchiriata.rezervaPachet();
    }
}
