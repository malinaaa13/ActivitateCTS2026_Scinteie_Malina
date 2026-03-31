package singleton.threadsafe.clase;

public class AgentieThreadSafe {
    private String numeAgentie;
    private float capital;
    private int numarAngajati;

    private static AgentieThreadSafe instanta = null;

    private AgentieThreadSafe(String numeAgentie, float capital, int numarAngajati) {
        this.numeAgentie = numeAgentie;
        this.capital = capital;
        this.numarAngajati = numarAngajati;
    }

    public static synchronized AgentieThreadSafe getInstance(String numeAgentie, float capital, int numarAngajati) {
        if(instanta == null) {
            instanta = new AgentieThreadSafe(numeAgentie, capital, numarAngajati);
        }
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieThreadSafe{");
        sb.append("numeAgentie='").append(numeAgentie).append('\'');
        sb.append(", capital=").append(capital);
        sb.append(", numarAngajati=").append(numarAngajati);
        sb.append('}');
        return sb.toString();
    }
}
