package flyweight.main;

import flyweight.clase.Client;
import flyweight.clase.ClientAbstract;
import flyweight.clase.RegistruClienti;
import flyweight.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        RegistruClienti registru = new RegistruClienti();
        ClientAbstract client1 = registru.getClient("Ana", "0761024198", "ana@gmail.com");
        ClientAbstract client2 = registru.getClient("Bogdan", "078999453", "bogdan@gmail.com");
        Rezervare rezervare1 = new Rezervare(20, "20:30", 2);
        Rezervare rezervare2 = new Rezervare(13, "12:30", 4);
        client1.printeazaRezervare(rezervare1);
        client2.printeazaRezervare(rezervare2);
        registru.getClient("Andrei", "078999453", "andrei@gmail.com").printeazaRezervare(rezervare2);
        registru.getClient("Andrei", "078999453", "andrei@gmail.com").plateste(rezervare2, 10);
        Rezervare rezervare3 = new Rezervare(12, "18:15", 7);
        registru.getClient("Ana", "0761024198", "ana@gmail.com").printeazaRezervare(rezervare3);
        registru.getClient("Ana", "0761024198", "ana@gmail.com").plateste(rezervare3, 10);

    }
}
