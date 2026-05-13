package command.stbF16.clase;

public class Autobuz {
    private String nrInmatriculare;

    public Autobuz(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public void pornesteTraseu(int nrLinie){
        System.out.println("Autobuzul cu nr de inmatriculare "+this.nrInmatriculare+" porneste pe traseu "+nrLinie);
    }
}
