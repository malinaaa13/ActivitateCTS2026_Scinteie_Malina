package decorator.restaurantB7.decorator;

import decorator.restaurantB7.clase.NotaDePlataAbstract;

public class NotaDePlata1Mai extends Decorator{
    public NotaDePlata1Mai(NotaDePlataAbstract notaDePlataAbstract) {
        super(notaDePlataAbstract);
    }

    @Override
    public void priteazaFelicitare() {
        System.out.println("Va dorim un 1 mai fericit!");
    }
}
