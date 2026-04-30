package flyweight.clase;

public class Rezervare {
    private int numarMasa;
    private String oraRezervare;
    private int numarPersoane;

    public Rezervare(int numarMasa, String oraRezervare, int numarPersoane) {
        this.numarMasa = numarMasa;
        this.oraRezervare = oraRezervare;
        this.numarPersoane = numarPersoane;
    }

    public int getNumarPersoane() {
        return numarPersoane;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numarMasa=").append(numarMasa);
        sb.append(", oraRezervare='").append(oraRezervare).append('\'');
        sb.append(", numarPersoane=").append(numarPersoane);
        sb.append('}');
        return sb.toString();
    }
}
