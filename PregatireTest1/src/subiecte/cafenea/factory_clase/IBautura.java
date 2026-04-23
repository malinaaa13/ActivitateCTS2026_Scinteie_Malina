package subiecte.cafenea.factory_clase;

public interface IBautura {
    void preparare();

    String getDetalii();

    double getPret();

    boolean adaugaTopping();

    IBautura copiaza();

}
