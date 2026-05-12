package composite.restaurantB8.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements OptiuneMeniu {
    private List<OptiuneMeniu> lista;
    private String nume;

    public Sectiune(String nume) {
        this.nume = nume;
        this.lista = new ArrayList<OptiuneMeniu>();
    }

    @Override
    public void descriere() {
        System.out.println(" Sectiune:"+nume);
        for(OptiuneMeniu optiune : lista){
            optiune.descriere();
        }
    }

    @Override
    public void adaugaNod(OptiuneMeniu optiuneMeniu) {
        lista.add(optiuneMeniu);
    }

    @Override
    public void stergereNod(OptiuneMeniu optiuneMeniu) {
        lista.remove(optiuneMeniu);
    }

    @Override
    public void getNod(int index) {
        lista.get(index);
    }
}
