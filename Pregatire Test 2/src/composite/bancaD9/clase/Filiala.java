package composite.bancaD9.clase;

public class Filiala implements Structura{
    private String nume;

    public Filiala(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaNod(Structura structura) {
        System.out.println("Nu este implementata");
    }

    @Override
    public void stergeNod(Structura structura) {
        System.out.println("Nu este implementata");
    }

    @Override
    public Structura getNod(int index) {
        return null;
    }

    @Override
    public void descriere() {
        System.out.println("  Filiala:"+nume);
    }
}
