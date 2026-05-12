package composite.bancaD9.clase;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements Structura{
    private List<Structura> lista;
    private String nume;

    public Agentie(String nume) {
        this.nume = nume;
        this.lista =  new ArrayList<Structura>();
    }

    @Override
    public void adaugaNod(Structura structura) {
        lista.add(structura);
    }

    @Override
    public void stergeNod(Structura structura) {
        lista.remove(structura);
    }

    @Override
    public Structura getNod(int index) {
        return lista.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Agentia: "+nume);
        for(Structura structura: lista){
            structura.descriere();
        }
    }
}
