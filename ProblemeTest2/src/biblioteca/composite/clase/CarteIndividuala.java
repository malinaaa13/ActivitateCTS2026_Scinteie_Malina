package biblioteca.composite.clase;

public class CarteIndividuala extends Structura implements ElementBiblioteca {
    private String titlu;
    private String autor;
    private String dataAparitie;

    public CarteIndividuala(String titlu, String autor, String dataAparitie) {
        this.titlu = titlu;
        this.autor = autor;
        this.dataAparitie = dataAparitie;
    }

    @Override
    public void adaugaStructura(Structura structura)  {
        System.out.println("Nu a fost implementata");
    }

    @Override
    public void stergeStructura(Structura structura) {
        System.out.println("Nu a fost implementata");
    }

    @Override
    public Structura getStructura(int index) {
        return null;
    }

    @Override
    public void printeazaInformatii() {
        System.out.println("Cartea "+this.titlu+" de "+this.autor+" a parut la data de "+this.dataAparitie);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CarteIndividuala{");
        sb.append("titlu='").append(titlu).append('\'');
        sb.append(", autor='").append(autor).append('\'');
        sb.append(", dataAparitie='").append(dataAparitie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
