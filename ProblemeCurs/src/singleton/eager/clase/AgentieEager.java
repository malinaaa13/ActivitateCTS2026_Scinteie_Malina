package singleton.eager.clase;

public class AgentieEager {
    private String numeAgentie;
    private float capital;
    private int numarAngajati;

    private static final AgentieEager instanta = new AgentieEager();

    private AgentieEager() {}


    public String getNumeAgentie() {
        return numeAgentie;
    }

    public void setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
    }

    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public static AgentieEager getInstanta(String numeAgentie, float capital, int numarAngajati) {
        instanta.numarAngajati = numarAngajati;
        instanta.capital = capital;
        instanta.numeAgentie= numeAgentie;
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieEager{");
        sb.append("numeAgentie='").append(numeAgentie).append('\'');
        sb.append(", capital=").append(capital);
        sb.append(", numarAngajati=").append(numarAngajati);
        sb.append('}');
        return sb.toString();
    }
}
