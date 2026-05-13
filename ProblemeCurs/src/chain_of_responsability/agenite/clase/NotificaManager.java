package chain_of_responsability.agenite.clase;

public class NotificaManager extends Notificator{
    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Domnule Manager, agentia nu detine date de contact pentru clientul "+client.getNume());
    }
}
