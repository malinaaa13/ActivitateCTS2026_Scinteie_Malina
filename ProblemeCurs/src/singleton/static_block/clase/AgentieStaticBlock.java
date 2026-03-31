package singleton.static_block.clase;

public class AgentieStaticBlock {
    private String numeAgentie;
    private float capital;
    private int numarAngajati;

    private static final AgentieStaticBlock instanta;

    //sectiunea static se executa o singura data in Java!!
    //cand clasa e incarcata in memorie
    static {
        try {
            instanta = new AgentieStaticBlock();
        } catch (Exception exception) {
            throw new RuntimeException("Eroare la crearea Singleton-ului");
            //System.out.println("Agentia nu poate fi creata");
        }
    }

    private AgentieStaticBlock () {
        this.numeAgentie = "AgeTur";
        this.capital = 2000;
        this.numarAngajati= 10;
    }

    public static AgentieStaticBlock getInstance() {
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieStaticBlock{");
        sb.append("numeAgentie='").append(numeAgentie).append('\'');
        sb.append(", capital=").append(capital);
        sb.append(", numarAngajati=").append(numarAngajati);
        sb.append('}');
        return sb.toString();
    }

    public void setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }
}
