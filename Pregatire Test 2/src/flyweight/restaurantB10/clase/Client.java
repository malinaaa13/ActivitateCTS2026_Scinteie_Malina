package flyweight.restaurantB10.clase;

public class Client implements ClientAbstract{

    private String nume;
    private String telefon;
    private String email;

    public Client(String nume, String telefon, String email) {
        this.nume = nume;
        this.telefon = telefon;
        this.email = email;
    }

    @Override
    public void printeazaRezervare(Rezervare rezervare) {
        System.out.println("Clientul "+this.nume+" are numarul de telefon "+this.telefon+
                " si emailul "+this.email+" a facut rezervarea "+rezervare.toString());
    }
}
