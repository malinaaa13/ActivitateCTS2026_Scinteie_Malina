package chain_of_responsability.hotel.observer;

public class Client implements Observer{
    private String nume;
    private String telefon;
    private String email;

    public Client(String nume, String telefon, String email) {
        this.nume = nume;
        this.telefon = telefon;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void primesteSMS(String mesaj) {
        System.out.println(this.nume+" ai primit un sms cu mesajul "+mesaj);
    }

    @Override
    public void primesteEmail(String email) {
        System.out.println(this.nume+" ai primit un email cu mesajul "+email);
    }
}
