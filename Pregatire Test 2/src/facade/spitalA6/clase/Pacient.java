package facade.spitalA6.clase;

public class Pacient {
    private String nume;
    private int varsta;
    private int stare;

    public Pacient(String nume, int varsta, int stare) {
        this.nume = nume;
        this.varsta = varsta;
        this.stare = stare;
    }

    public String getNume() {
        return nume;
    }

    public int getStare() {
        return stare;
    }

    public int getVarsta() {
        return varsta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", stare=").append(stare);
        sb.append('}');
        return sb.toString();
    }
}
