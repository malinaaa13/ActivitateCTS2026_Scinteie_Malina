package decorator.stbF7.main;

import decorator.stbF7.clase.Bilet;
import decorator.stbF7.clase.IBilet;
import decorator.stbF7.decorator.BiletZiNationala;
import decorator.stbF7.decorator.Decorator;

public class Main {
    public static void main(String[] args) {
        IBilet bilet = new Bilet(12.5);
        bilet.printeaza();

        Decorator biletDecorat = new BiletZiNationala(bilet);
        System.out.println();
        biletDecorat.printeaza();

    }
}
