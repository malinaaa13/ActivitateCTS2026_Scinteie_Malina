package comert_electronic.strategy.clase;

import java.util.ArrayList;
import java.util.List;

public class Utilizator {
    private ModVizualizare modVizualizare;
    private List<Produs> produse;


    public Utilizator(ModVizualizare modVizualizare) {
        this.modVizualizare = modVizualizare;
        this.produse = new ArrayList<Produs>();
        produse.add(new Produs("laptop", 12000.88, 3));
        produse.add(new Produs("telefon", 4000.77, 2));
        produse.add(new Produs("smartwatch", 567.88, 0));
    }

    public void setModVizualizare(ModVizualizare modVizualizare) {
        this.modVizualizare = modVizualizare;
    }

    public void vizualizareProduse(){
       List<Produs> lista = modVizualizare.afiseaza(this.produse);
       for(Produs produs : lista){
           System.out.println(produs.toString());
       }

    }
}
