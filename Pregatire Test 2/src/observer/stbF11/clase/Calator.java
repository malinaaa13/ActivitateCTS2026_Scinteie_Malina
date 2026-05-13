package observer.stbF11.clase;

public class Calator implements ICalator{

    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptioneazaNotificare(String mesaj) {
        System.out.println("Calatorul "+this.nume+" a primit mesajul "+mesaj);
    }
}
