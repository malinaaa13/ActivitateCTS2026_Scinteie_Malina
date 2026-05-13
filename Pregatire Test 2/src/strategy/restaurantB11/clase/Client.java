package strategy.restaurantB11.clase;

public class Client {
    private ModPlata modPlata;
    private String nume;

    public Client(ModPlata modPlata, String nume) {
        this.modPlata = modPlata;
        this.nume = nume;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void efectueazaPlata(double suma){
        modPlata.plateste(nume, suma);
    }
}
