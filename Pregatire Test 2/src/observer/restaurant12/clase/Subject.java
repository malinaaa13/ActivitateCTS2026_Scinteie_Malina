package observer.restaurant12.clase;

import observer.restaurant12.client.Client;

import java.util.List;

public abstract class Subject {
    List<Client> observeri;

    public void adaugareObserver(Client client){};
    public void stergereObserver(Client client){};


}
