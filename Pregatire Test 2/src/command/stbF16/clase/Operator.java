package command.stbF16.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> comenzi;

    public Operator(){
        this.comenzi = new ArrayList<Command>();
    }

    public void inregistreazaComanda(Command comanda){
        comenzi.add(comanda);
    }

    public void executaComanda(){
        if(comenzi.size() > 0){
            comenzi.get(0).pleacaInCursa();
            comenzi.remove(0);
        }
    }
}
