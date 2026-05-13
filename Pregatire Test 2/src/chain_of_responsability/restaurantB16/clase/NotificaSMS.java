package chain_of_responsability.restaurantB16.clase;

public class NotificaSMS extends Notificator{

    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getTelefon() != null){
            System.out.println("Clientul "+client.getNume()+" a primit un sms cu mesajul "+mesaj);
        } else{
            super.getSuccesor().notifica(client, mesaj);
        }
    }
}
