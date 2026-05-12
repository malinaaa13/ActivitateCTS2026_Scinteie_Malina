package decorator.sportivE7.decorator;

import decorator.sportivE7.clase.InterfataBilet;

public abstract class Decorator implements InterfataBilet {
    private InterfataBilet bilet;

    public Decorator(InterfataBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printeaza() {
        bilet.printeaza();
        printareMesaj();
    }

    protected abstract void printareMesaj();
}
