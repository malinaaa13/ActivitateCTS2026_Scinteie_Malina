package flyweight.restaurantB10.clase;

public class Rezervare {
    private int numarMasa;
    private int nrPersoane;
    private String ora;

    public Rezervare(int numarMasa, int nrPersoane, String ora) {
        this.numarMasa = numarMasa;
        this.nrPersoane = nrPersoane;
        this.ora = ora;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numarMasa=").append(numarMasa);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", ora='").append(ora).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
