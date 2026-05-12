package decorator.restaurantB7.decorator;

import decorator.restaurantB7.clase.NotaDePlataAbstract;

public class NotaDePlataAnulNou extends Decorator{
    public NotaDePlataAnulNou(NotaDePlataAbstract notaDePlataAbstract) {
        super(notaDePlataAbstract);
    }

    @Override
    public void priteazaFelicitare() {
        System.out.println("La multi ani de anul nou!");
    }
}
