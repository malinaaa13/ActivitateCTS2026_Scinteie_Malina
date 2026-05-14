package cinema.flyweight.clase;

public class Rezervare {
    private int rand;
    private int loc;
    private String numeClient;
    private String oraProiectie;

    public Rezervare(int rand, int loc, String numeClient, String oraProiectie) {
        this.rand = rand;
        this.loc = loc;
        this.numeClient = numeClient;
        this.oraProiectie = oraProiectie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("rand=").append(rand);
        sb.append(", loc=").append(loc);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", oraProiectie='").append(oraProiectie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
