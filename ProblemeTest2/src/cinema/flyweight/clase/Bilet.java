package cinema.flyweight.clase;

public class Bilet implements IBilet{
    private String denumire;
    private String gen;
    private int durata;
    private String clasificareVarsta;

    public Bilet(String denumire, String gen, int durata, String clasificareVarsta) {
        this.denumire = denumire;
        this.gen = gen;
        this.durata = durata;
        this.clasificareVarsta = clasificareVarsta;
    }

    @Override
    public void afisare(Rezervare rezervare) {
        System.out.println("Pentru biletul la filmul "+this.denumire+
                ", genul "+this.gen+", durata "+this.durata+", clasificare varsta "+this.clasificareVarsta+
                " exista o rezervare "+rezervare.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bilet{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", gen='").append(gen).append('\'');
        sb.append(", durata=").append(durata);
        sb.append(", clasificareVarsta='").append(clasificareVarsta).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
