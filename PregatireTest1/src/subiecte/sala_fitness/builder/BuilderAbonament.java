package subiecte.sala_fitness.builder;

public class BuilderAbonament implements IBuilder{
    private TipAbonament tipAbonament;
    private boolean areAccesClaseGrup;
    private boolean areAntrenorPersonal;
    private int nrSedinte;
    private int durata;
    private String optiuniSuplimentare;

    public BuilderAbonament() {
        this.reset();
    }

    private void reset() {
        this.tipAbonament = TipAbonament.Basic;
        this.areAccesClaseGrup = false;
        this.areAntrenorPersonal = false;
        this.nrSedinte = 10;
        this.durata = 30;
        this.optiuniSuplimentare = "nu are";
    }

    public BuilderAbonament setTipAbonament(TipAbonament tipAbonament) {
        this.tipAbonament = tipAbonament;
        return this;
    }

    public BuilderAbonament setAccesClase(boolean areAccesClaseGrup) {
        this.areAccesClaseGrup = areAccesClaseGrup;
        return this;
    }

    public BuilderAbonament setAntrenor(boolean areAntrenorPersonal){
        this.areAntrenorPersonal = areAntrenorPersonal;
        return this;
    }

    public BuilderAbonament setNrSedinte(int nrSedinte){
        this.nrSedinte = nrSedinte;
        return this;
    }

    public BuilderAbonament setDurata (int durata){
        this.durata = durata;
        return this;
    }

    public BuilderAbonament setOptiuniSuplimentare(String optiuniSuplimentare){
        this.optiuniSuplimentare = optiuniSuplimentare;
        return this;
    }

    @Override
    public Abonament build() {
        Abonament abonament = new Abonament(
                this.tipAbonament,
                this.areAccesClaseGrup,
                this.areAntrenorPersonal,
                this.nrSedinte, this.durata,
                this.optiuniSuplimentare);

        this.reset();
        return abonament;
    }
}
