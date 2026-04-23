package subiecte.cafenea.factory_clase;

public class Factory {
    public IBautura creareBautura(TipBautura tip, String nume, int volum, double pret){
        switch (tip){
            case TipBautura.CAFEA -> {
                return new Cafea(nume, volum, pret);
            }
            case TipBautura.CEAI -> {
                return new Ceai(nume, volum, pret);
            }
            case TipBautura.CIOCOLATA_CALDA -> {
                return new CiocolataCalda(nume, volum, pret);
            }
            default -> {
                return null;
            }
        }
    }
}
