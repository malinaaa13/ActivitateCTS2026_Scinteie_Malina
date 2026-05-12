package composite.bancaD9.clase;

public interface Structura {
    void adaugaNod(Structura structura);
    void stergeNod(Structura structura);
    Structura getNod(int index);
    void descriere();
}
