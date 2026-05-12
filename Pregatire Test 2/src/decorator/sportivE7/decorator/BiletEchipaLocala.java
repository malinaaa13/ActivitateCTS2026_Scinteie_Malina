package decorator.sportivE7.decorator;

import decorator.sportivE7.clase.InterfataBilet;

public class BiletEchipaLocala extends Decorator{
    public BiletEchipaLocala(InterfataBilet bilet) {
        super(bilet);
    }


    @Override
    protected void printareMesaj() {
        System.out.println("Hai echipa!!");
    }
}
