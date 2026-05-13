package observer.stbF11.clase;

import java.util.ArrayList;
import java.util.List;

public class Autobuz implements IAutobuz{

    private String nrLinie;
    private List<ICalator> calatori;

    public Autobuz(String nrLinie) {
        this.nrLinie = nrLinie;
        this.calatori = new ArrayList<ICalator>();
    }

    @Override
    public void adaugaCalator(ICalator calator) {
        calatori.add(calator);
    }

    @Override
    public void dezabonareCalator(ICalator calator) {
        calatori.remove(calator);
    }

    @Override
    public void notificaCalatori(String mesaj) {
        for(ICalator calator: calatori){
            calator.receptioneazaNotificare("Autobuz "+nrLinie+":"+mesaj);
        }
    }

    public void notificaPlecare(){
        notificaCalatori("Am plecat de la capat de linie");
    }
}
