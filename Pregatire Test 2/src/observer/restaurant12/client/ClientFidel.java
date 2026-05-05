package observer.restaurant12.client;

public class ClientFidel implements Client{
    private String numeClient;

    public ClientFidel(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println("Clientul "+this.numeClient+" a primit mesajul "+mesaj);
    }
}
