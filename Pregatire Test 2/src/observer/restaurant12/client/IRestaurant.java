package observer.restaurant12.client;

public interface IRestaurant {
    void abonareClient(Client client);
    void dezabonareClient(Client client);
    void notificaClient(String mesaj);
}
