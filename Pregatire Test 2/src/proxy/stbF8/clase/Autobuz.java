package proxy.stbF8.clase;

public class Autobuz implements IAutobuz{

    private int nrAutobuz;
    private int nrCalatori;

    public Autobuz(int nrAutobuz, int nrCalatori) {
        this.nrAutobuz = nrAutobuz;
        this.nrCalatori = nrCalatori;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul "+nrAutobuz+ " opreste in statie.");
    }
}
