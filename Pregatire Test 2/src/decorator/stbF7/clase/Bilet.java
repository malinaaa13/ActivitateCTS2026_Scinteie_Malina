package decorator.stbF7.clase;

public class Bilet implements IBilet{
    private double pret;

    public Bilet(double pret) {
        this.pret = pret;
    }

    @Override
    public void printeaza() {
        System.out.println("Biletul costa "+this.pret+" lei");
    }
}
