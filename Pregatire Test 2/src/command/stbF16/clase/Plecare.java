package command.stbF16.clase;

public class Plecare implements Command {
    private Autobuz autobuz;
    private int nrLinie;

    public Plecare(Autobuz autobuz, int nrLinie) {
        this.autobuz = autobuz;
        this.nrLinie = nrLinie;
    }

    @Override
    public void pleacaInCursa() {
        System.out.println("Autobuzul: "+autobuz.getNrInmatriculare());
        autobuz.pornesteTraseu(this.nrLinie);
    }
}
