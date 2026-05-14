package biblioteca.composite.clase;

public abstract class Structura implements ElementBiblioteca {
    public abstract void adaugaStructura(Structura structura);
    public abstract void stergeStructura(Structura structura);
    public abstract Structura getStructura(int index);
}
