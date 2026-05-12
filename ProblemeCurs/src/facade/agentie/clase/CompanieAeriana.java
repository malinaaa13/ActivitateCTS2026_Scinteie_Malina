package facade.agentie.clase;

public class CompanieAeriana {
    private String numeCompanieAeriana;

    public CompanieAeriana(String numeCompanieAeriana) {
        this.numeCompanieAeriana = numeCompanieAeriana;
    }

    public Zbor rezervaBiletAvion(String plecare, String destinatie){
        Zbor zbor = new Zbor(plecare, destinatie, this);
        return zbor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CompanieAeriana{");
        sb.append("numeCompanieAeriana='").append(numeCompanieAeriana).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
