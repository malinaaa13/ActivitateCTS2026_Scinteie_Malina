package decorator.stbF7.decorator;

import decorator.stbF7.clase.IBilet;

public abstract class Decorator implements IBilet {
    private IBilet bilet;

    public Decorator(IBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printeaza() {
        bilet.printeaza();
    }

    protected abstract void priteazaMesaj();
}
