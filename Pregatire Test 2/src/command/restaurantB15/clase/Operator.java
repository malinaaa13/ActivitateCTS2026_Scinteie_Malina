package command.restaurantB15.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> comenzi;

    public Operator() {
        this.comenzi = new ArrayList<Command>();
    }

    public void adaugaComanda(Command comanda){
        comenzi.add(comanda);
    }

    public void executaComanda(){
        if(comenzi.size() > 0){
            comenzi.get(0).executa();
            comenzi.remove(0);
        }
    }
}
