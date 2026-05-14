package proxy.restaurantB9.proxy;

import proxy.restaurantB9.clase.IRezervare;
import proxy.restaurantB9.clase.Rezervare;

public class ProxyRezervare implements IRezervare {

    private IRezervare rezervare;

    public ProxyRezervare(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva() {
        if(((Rezervare)rezervare).getNrPersoane() >= 4 ){
            rezervare.rezerva();
        } else {
            System.out.println("Nu este necesara o rezervare pentru un nr mai mic de 4 persoane");
        }
    }

}
