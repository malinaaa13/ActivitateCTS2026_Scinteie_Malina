package subiecte.cafenea.singleton_clase;

import subiecte.cafenea.factory_clase.IBautura;

public interface IComandaManager {
    void adaugaBautura(IBautura bautura);
    void afiseazaComandaCurenta();
    double calculeazaPretTotal();
    void finalizeazaComanda();

}
