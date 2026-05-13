package chain_of_responsability.restaurantB16.clase;

public abstract class Notificator {
    private Notificator succesor;

    public Notificator() {
        this.succesor = null;
    }

    public Notificator getSuccesor() {
        return succesor;
    }

    public void setSuccesor(Notificator notificator) {
        this.succesor = notificator;
    }

    public abstract void notifica(Client client, String mesaj);
}
