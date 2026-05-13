package observer.restaurant12.client;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant{

    private List<Client> clienti;
    private String nume;

    public Restaurant(String nume) {
        this.nume = nume;
        this.clienti = new ArrayList<Client>();
    }

    @Override
    public void abonareClient(Client client) {
        clienti.add(client);
    }

    @Override
    public void dezabonareClient(Client client) {
        clienti.remove(client);
    }

    @Override
    public void notificaClient(String mesaj) {
        for(Client client: clienti){
            client.receptionareMesaj(nume+ ":"+mesaj);
        }
    }

    public void notificaOfertaPret(){
        notificaClient("S-a facut o oferta la preturi!");
    }

    public void notificaMeniuNou(){
        notificaClient("S-a introdus un meniu nou");
    }

}
