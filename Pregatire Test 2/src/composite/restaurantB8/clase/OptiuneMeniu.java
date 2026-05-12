package composite.restaurantB8.clase;

public interface OptiuneMeniu {
    void descriere();
    void adaugaNod(OptiuneMeniu optiuneMeniu);
    void stergereNod(OptiuneMeniu optiuneMeniu);
    void getNod(int index);
}
