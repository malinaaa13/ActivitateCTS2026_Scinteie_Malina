package proxy.clase;

public class Pacient {
    private String nume;
    private boolean areAsigurare;

    public Pacient(boolean areAsigurare, String nume) {
        this.areAsigurare = areAsigurare;
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreAsigurare() {
        return areAsigurare;
    }
}
