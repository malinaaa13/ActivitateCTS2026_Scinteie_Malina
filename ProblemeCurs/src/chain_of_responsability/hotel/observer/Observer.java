package chain_of_responsability.hotel.observer;

public interface Observer {
    void primesteSMS(String mesaj);
    void primesteEmail(String email);
}
