package command.restaurantB15.clase;

public class Masa {
    private int nrMasa;
    private int nrScaune;

    public Masa(int nrMasa, int nrScaune) {
        this.nrMasa = nrMasa;
        this.nrScaune = nrScaune;
    }

    public void rezerva(){
        System.out.println("Masa cu numarul "+this.nrMasa+" are "+this.nrScaune+
                " scaune si a fost rezervata");
    }

    public void ocupa(){
        System.out.println("Masa cu numarul "+this.nrMasa+" are "+this.nrScaune+
                " scaune si a fost ocupata");
    }
}
