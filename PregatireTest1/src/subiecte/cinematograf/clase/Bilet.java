package subiecte.cinematograf.clase;

import java.util.ArrayList;
import java.util.List;

public class Bilet implements Ticket{
    private String titlu;
    private String regie;
    private List<String> actori;
    private String compania;
    private String descriere;
    private boolean areReclame;

    private String data;
    private int ora;
    private String loc;

    private Bilet() {}

    public Bilet(String titlu, String regie, List<String> actori, String compania,
                 String descriere, boolean areReclame)
    {
        if(titlu.length() > 3) {
            this.titlu = titlu;
        } else {
            this.titlu = "Necunoscut";
        }
        if(regie.length() > 3 ){
            this.regie = regie;
        } else {
            this.regie = "Necunoscut";
        }
        if(actori.isEmpty()){
            actori.add("Actor1");
        } else {
            this.actori = actori;
        }
        this.compania =compania;
        this.descriere = descriere;
        this.areReclame = areReclame;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setOra(int ora) {
        this.ora = ora;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public Ticket copiaza() {
        Bilet bilet = new Bilet();
        bilet.titlu = this.titlu;
        bilet.regie = this.regie;
        bilet.actori = new ArrayList<>(this.actori);
        bilet.compania = this.compania;
        bilet.descriere = this.descriere;
        bilet.areReclame = this.areReclame;
        return bilet;
    }

    @Override
    public String print() {
        return this.toString();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bilet{");
        sb.append("titlu='").append(titlu).append('\'');
        sb.append(", regie='").append(regie).append('\'');
        sb.append(", actori=").append(actori);
        sb.append(", compania='").append(compania).append('\'');
        sb.append(", descriere='").append(descriere).append('\'');
        sb.append(", arereclame=").append(areReclame);
        sb.append(", data='").append(data).append('\'');
        sb.append(", ora=").append(ora);
        sb.append(", loc=").append(loc);
        sb.append('}');
        return sb.toString();
    }
}