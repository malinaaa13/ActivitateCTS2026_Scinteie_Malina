package flyweight.restaurantB10.clase;

import java.util.HashMap;

public class RegistruClienti {

    private HashMap<String, ClientAbstract> listaClienti;

    public RegistruClienti(){
        this.listaClienti = new HashMap<String, ClientAbstract>();
    }

    public ClientAbstract getClient(String nume, String telefon, String mail){
        ClientAbstract client = listaClienti.get(telefon);
        if(client == null){
            client = new Client(nume, telefon, mail);
            listaClienti.put(telefon, client);
        }
        return client;
    }

}
