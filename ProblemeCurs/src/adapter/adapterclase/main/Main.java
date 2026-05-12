package adapter.adapterclase.main;

import adapter.adapterclase.clase.PachetCazare;
import adapter.adapterclase.clase.PachetMasinaInchiriata;
import adapter.adapterclase.inchirieremasini.Masina;

public class Main {
    public static void main(String[] args) {
        Masina masina = new Masina("123M", 45.8);
        PachetMasinaInchiriata pachetMasinaInchiriata = new PachetMasinaInchiriata(masina);
        pachetMasinaInchiriata.rezervaPachet();
        pachetMasinaInchiriata.descriere();
        PachetCazare cazare = new PachetCazare();
        cazare.descriere();
        cazare.rezervaPachet();
    }
}
