package proxy.hotel.clase;

public class ProxyRezervare implements IRezervare{

    private Rezervare rezervare;

    public ProxyRezervare(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void anulare() {
        if(rezervare.getNrNopti() <= 1){
            rezervare.anulare();
        } else{
            System.out.println("Anularea nu este permisa!");
        }
    }
}
