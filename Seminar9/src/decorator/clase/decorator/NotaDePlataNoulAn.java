package decorator.clase.decorator;

import decorator.clase.NotaDePlataAbstract;

public class NotaDePlataNoulAn extends NotaDePlataDecorator{


    public NotaDePlataNoulAn(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("\nLa multi ani de Anul Nou!");
    }
}
