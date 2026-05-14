package comert_electronic.strategy.clase;

import java.util.Comparator;
import java.util.List;

public class DescrescatorPret implements ModVizualizare {

    @Override
    public List<Produs> afiseaza(List<Produs> produse) {
        return produse.stream()
                .sorted(Comparator.comparing(Produs::getPret).reversed())
                .toList();
    }
}
