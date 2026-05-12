package composite.restaurantB8.clase;

public class Item implements OptiuneMeniu {
    private String nume;

    public Item(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("  Item:"+nume);
    }

    @Override
    public void adaugaNod(OptiuneMeniu optiuneMeniu) {
        System.out.println("Nu este implementata");
    }

    @Override
    public void stergereNod(OptiuneMeniu optiuneMeniu) {
        System.out.println("Nu este implementata");
    }

    @Override
    public void getNod(int index) {
        System.out.println("Nu este implementata");
    }
}
