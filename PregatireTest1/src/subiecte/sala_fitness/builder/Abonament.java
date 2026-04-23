package subiecte.sala_fitness.builder;

public class Abonament {
    private TipAbonament tipAbonament;
    private boolean areAccesClaseGrup;
    private boolean areAntrenorPersonal;
    private int nrSedinte;
    private int durata;
    private String optiuniSuplimentare;

    protected Abonament(TipAbonament tipAbonament, boolean areAccesClaseGrup, boolean areAntrenorPersonal, int nrSedinte, int durata, String optiuniSuplimentare) {
        this.tipAbonament = tipAbonament;
        this.areAccesClaseGrup = areAccesClaseGrup;
        this.areAntrenorPersonal = areAntrenorPersonal;
        this.nrSedinte = nrSedinte;
        this.durata = durata;
        this.optiuniSuplimentare = optiuniSuplimentare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Abonament{");
        sb.append("tipAbonament=").append(tipAbonament);
        sb.append(", areAccesClaseGrup=").append(areAccesClaseGrup);
        sb.append(", areAntrenorPersonal=").append(areAntrenorPersonal);
        sb.append(", nrSedinte=").append(nrSedinte);
        sb.append(", durata=").append(durata);
        sb.append(", optiuniSuplimentare='").append(optiuniSuplimentare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
