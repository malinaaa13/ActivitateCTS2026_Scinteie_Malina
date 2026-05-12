package decorator.restaurantB7.main;

import decorator.restaurantB7.clase.NotaDePlata;
import decorator.restaurantB7.clase.NotaDePlataAbstract;
import decorator.restaurantB7.decorator.Decorator;
import decorator.restaurantB7.decorator.NotaDePlata1Mai;
import decorator.restaurantB7.decorator.NotaDePlataAnulNou;

public class Main {
    public static void main(String[] args) {
        NotaDePlataAbstract nota = new NotaDePlata(234.8, "12/05/2026");
        nota.printeaza();

        Decorator notaDecorataAnNou = new NotaDePlataAnulNou(nota);
        notaDecorataAnNou.printeaza();
        notaDecorataAnNou.priteazaFelicitare();

        Decorator nota1Mai = new NotaDePlata1Mai(nota);
        nota1Mai.priteazaFelicitare();
        nota1Mai.printeaza();
    }
}
