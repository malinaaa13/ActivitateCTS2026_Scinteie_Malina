package facade.clase;

public class Pacient {
    private String nume;
    private int gravitate;

    public Pacient(String nume, int gravitate) {
        this.nume = nume;
        this.gravitate = gravitate;
    }

    public int getGravitate() {
        return gravitate;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", gravitate=").append(gravitate);
        sb.append('}');
        return sb.toString();
    }
}
