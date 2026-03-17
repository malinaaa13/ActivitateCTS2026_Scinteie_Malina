package ro.ase.cts.builder.clase;

public class Internare {
    protected boolean patRabatabil;
    protected boolean micDejun;
    protected boolean papuci;
    protected boolean halat;
    protected String numePacient;

    public Internare(boolean patRabatabil, boolean micDejun, boolean papuci, boolean halat, String numePacient) {
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuci = papuci;
        this.halat = halat;
        this.numePacient = numePacient;
    }

    protected void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    protected void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    protected void setPapuci(boolean papuci) {
        this.papuci = papuci;
    }

    protected void setHalat(boolean halat) {
        this.halat = halat;
    }

    protected void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("patRabatabil=").append(patRabatabil);
        sb.append(", micDejun=").append(micDejun);
        sb.append(", papuci=").append(papuci);
        sb.append(", halat=").append(halat);
        sb.append(", numePacient='").append(numePacient).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
