package facade.agentie.clase;

public class Zbor {
    private CompanieAeriana companie;
    private String destinatie;
    private String orasPlecare;

    public Zbor(String orasPlecare, String destinatie, CompanieAeriana companie) {
        super();
        this.orasPlecare = orasPlecare;
        this.destinatie = destinatie;
        this.companie = companie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Zbor{");
        sb.append("companie=").append(companie);
        sb.append(", destinatie='").append(destinatie).append('\'');
        sb.append(", orasPlecare='").append(orasPlecare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
