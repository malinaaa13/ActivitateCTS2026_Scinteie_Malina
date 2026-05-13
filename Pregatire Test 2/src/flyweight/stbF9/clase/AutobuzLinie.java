package flyweight.stbF9.clase;

public class AutobuzLinie implements IAutobuzLinie{
    private int cod;
    private int nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    public AutobuzLinie(int cod, int nrLinie, String primaStatie, String ultimaStatie) {
        this.cod = cod;
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public void descriere(Autobuz autobuz) {
        System.out.println("Pe linia "+nrLinie+" "+primaStatie+" - "+ultimaStatie+ " merge autobuzul "+autobuz.toString());
    }

    public int getNrLinie() {
        return nrLinie;
    }
}
