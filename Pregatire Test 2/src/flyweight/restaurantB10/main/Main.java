package flyweight.restaurantB10.main;

import flyweight.restaurantB10.clase.ClientAbstract;
import flyweight.restaurantB10.clase.RegistruClienti;
import flyweight.restaurantB10.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        RegistruClienti registru = new RegistruClienti();
        ClientAbstract client1 = registru.getClient("Ana", "0761024198", "ana@gmail.com");
        ClientAbstract client2 = registru.getClient("Bogdan", "078999453", "bodan@gmail.com");
        Rezervare rezervare1 = new Rezervare(23, 6, "12:34");
        Rezervare rezervare2 = new Rezervare(13, 3, "20:17");
        client1.printeazaRezervare(rezervare1);
        client2.printeazaRezervare(rezervare2);
        registru.getClient("Andrei", "078999453", "andrei@gmail.com").printeazaRezervare(rezervare2);

    }
}
