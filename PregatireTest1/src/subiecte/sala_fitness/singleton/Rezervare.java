package subiecte.sala_fitness.singleton;

import subiecte.sala_fitness.builder.Abonament;

public class Rezervare {
    private String numeClient;
    private Abonament abonament;

    public Rezervare(String numeClient, Abonament abonament) {
        this.numeClient = numeClient;
        this.abonament = abonament;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", abonament=").append(abonament);
        sb.append('}');
        return sb.toString();
    }
}
