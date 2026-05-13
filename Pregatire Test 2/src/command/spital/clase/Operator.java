package command.spital.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> comenzi = new ArrayList<Command>();

    public void inregistreaza(Command comanda){
        comenzi.add(comanda);
    }

    public void executaFisa(){
        if(comenzi.size() > 0){
            comenzi.get(0).executa();
            comenzi.remove(0);
        }
    }
}
