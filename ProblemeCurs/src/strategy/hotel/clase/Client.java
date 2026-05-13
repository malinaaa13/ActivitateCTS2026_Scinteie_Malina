package strategy.hotel.clase;

public class Client {
    private ModVerificare modVerificare;
    private String nume;

    public Client(String nume, ModVerificare modVerificare) {
        this.nume = nume;
        this.modVerificare = modVerificare;
    }

    public void verificare(){
        modVerificare.verificare(nume);
    }

    public void setModVerificare(ModVerificare modVerificare) {
        this.modVerificare = modVerificare;
    }
}
