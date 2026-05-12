package decorator.stbF7.decorator;

import decorator.stbF7.clase.IBilet;

public class BiletZiNationala extends Decorator{

    public BiletZiNationala(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void printeaza() {
        super.printeaza();
        priteazaMesaj();
    }

    @Override
    protected void priteazaMesaj() {
        System.out.println("La multi ani");
    }
}
