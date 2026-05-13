package observer.spitalA12.clase;

public class PacientFidel implements Pacient{

    private String nume;
    private int varsta;

    public PacientFidel(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public void receptioneazaNotificare(String mesaj) {
        System.out.println("Pacientul "+nume+" a primit mesajul "+mesaj);
    }
}
