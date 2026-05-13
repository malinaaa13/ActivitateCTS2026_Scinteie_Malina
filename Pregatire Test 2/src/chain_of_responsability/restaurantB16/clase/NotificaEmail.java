package chain_of_responsability.restaurantB16.clase;

public class NotificaEmail extends Notificator{
    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getEmail() != null){
            System.out.println("Clientul "+client.getNume()+" a primit un email cu mesajul "+mesaj);
        } else{
            super.getSuccesor().notifica(client, mesaj);
        }
    }
}
