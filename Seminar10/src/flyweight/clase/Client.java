package flyweight.clase;

public class Client implements ClientAbstract{
    private String nume;
    private String numarTelefon;
    private String email;


    protected Client(String nume, String numarTelefon, String email) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.email = email;
    }

    @Override
    public void printeazaRezervare(Rezervare rezervare) {
        System.out.println("Clientul "+this.nume+" are numarul de telefon "+this.numarTelefon+" si adresa de email "+
                this.email+ " a facut rezervarea "+rezervare.toString());
    }

    @Override
    public void plateste(Rezervare rezervare, double taxaPerPersoana) {
        System.out.println(this.nume + " plateste suma de "+rezervare.getNumarPersoane()*taxaPerPersoana);
    }

}