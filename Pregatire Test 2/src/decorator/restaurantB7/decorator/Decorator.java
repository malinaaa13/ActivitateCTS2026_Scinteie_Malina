package decorator.restaurantB7.decorator;

import decorator.restaurantB7.clase.NotaDePlataAbstract;

public abstract class Decorator implements NotaDePlataAbstract {
    private NotaDePlataAbstract notaDePlataAbstract;

    public Decorator(NotaDePlataAbstract notaDePlataAbstract) {
        this.notaDePlataAbstract = notaDePlataAbstract;
    }

    @Override
    public void printeaza() {
        notaDePlataAbstract.printeaza();
    }

    public abstract void priteazaFelicitare();
}
