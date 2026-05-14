package comert_electronic.strategy.clase;

import java.util.List;

public class CelPutinORecenzie implements ModVizualizare {


    @Override
    public List<Produs> afiseaza(List<Produs> produse) {
        return produse.stream()
                .filter(Produse -> Produse.getNrRecenzii() >=1 )
                .toList();
    }
}
