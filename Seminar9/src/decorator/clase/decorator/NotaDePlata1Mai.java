package decorator.clase.decorator;

import decorator.clase.NotaDePlataAbstract;

public class NotaDePlata1Mai extends NotaDePlataDecorator{

    public NotaDePlata1Mai(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Va dorim un 1 mai fericit!");
    }
}
