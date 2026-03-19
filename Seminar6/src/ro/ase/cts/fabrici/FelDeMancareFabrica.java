package ro.ase.cts.fabrici;

import ro.ase.cts.clase.FelDeMancare;

public interface FelDeMancareFabrica {
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire);

    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire, int calorii);
}
