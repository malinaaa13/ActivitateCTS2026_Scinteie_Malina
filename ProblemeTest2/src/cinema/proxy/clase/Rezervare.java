package cinema.proxy.clase;

public class Rezervare implements IRezervare{

    private String numeClient;
    private boolean esteAutentificat;
    private boolean arePlata;
    private boolean areLoc;

    public Rezervare(String numeClient, boolean esteAutentificat, boolean arePlata, boolean areLoc) {
        this.numeClient = numeClient;
        this.esteAutentificat = esteAutentificat;
        this.arePlata = arePlata;
        this.areLoc = areLoc;
    }

    public boolean isEsteAutentificat() {
        return esteAutentificat;
    }

    public boolean isArePlata() {
        return arePlata;
    }

    public boolean isAreLoc() {
        return areLoc;
    }

    @Override
    public void rezervaOnline() {
        System.out.println("Clientul "+this.numeClient+" a rezervat un bilet online");
    }
}
