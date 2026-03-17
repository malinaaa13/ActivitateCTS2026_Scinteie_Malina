package ro.ase.cts.builder.clase;

public class InternareBuilder implements InternareBuilderAbstract{
    private Internare internare;

    public InternareBuilder(String nume) {
        this.internare = new Internare(false, false, false, false, nume);
    }

    //seterii de tipul clasei
    public InternareBuilder setPat(boolean arePat) {
        internare.patRabatabil = arePat;
        return this;
    }

    public InternareBuilder setMicDejun(boolean areMicDejun) {
        internare.micDejun = areMicDejun;
        return this;
    }

    public InternareBuilder setPapuci(boolean arePapuci) {
        internare.papuci = arePapuci;
        return this;
    }

    public InternareBuilder setHalat(boolean areHalat) {
        internare.patRabatabil = areHalat;
        return this;
    }

    public InternareBuilder setnume(String nume) {
        internare.numePacient = nume;
        return this;
    }


    @Override
    public Internare build() {
        return internare;
    }
}
