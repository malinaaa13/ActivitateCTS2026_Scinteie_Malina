package singleton.inner_static_helper_class.clase;;

public class AgentieInnerClass {
    private String numeAgentie;
    private float capital;
    private int nrAngajati;

    private static class AgentieHelper {
        private static final AgentieInnerClass instanta = new AgentieInnerClass();
    }

    private AgentieInnerClass() {
        this.numeAgentie = "AgeTur";
        this.capital = 2000;
        this.nrAngajati = 10;
    }

    public static AgentieInnerClass getInstance() {
        return AgentieHelper.instanta;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieInnerClass{");
        sb.append("numeAgentie='").append(numeAgentie).append('\'');
        sb.append(", capital=").append(capital);
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        return sb.toString();
    }
}
