package singleton.lazy.clase;

public class AgentieLazy {
    private String numeAgentie;
    private float capital;
    private int nrAngajati;

    private static AgentieLazy instanta = null;

    private AgentieLazy(String numeAgentie, float capital, int nrAngajati) {
        this.numeAgentie = numeAgentie;
        this.capital = capital;
        this.nrAngajati = nrAngajati;
    }

    public static AgentieLazy getInstance(String numeAgentie, float capital, int nrAngajati) {
        if(instanta == null) {
            instanta = new AgentieLazy(numeAgentie, capital, nrAngajati);
        }
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieLazy{");
        sb.append("numeAgentie='").append(numeAgentie).append('\'');
        sb.append(", capital=").append(capital);
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        return sb.toString();
    }

    public void setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

}
