package decorator.sportivE7.main;

import decorator.sportivE7.clase.BiletNormal;
import decorator.sportivE7.clase.InterfataBilet;
import decorator.sportivE7.decorator.BiletEchipaLocala;
import decorator.sportivE7.decorator.Decorator;

public class Main {
    public static void main(String[] args) {
        InterfataBilet bilet = new BiletNormal(3, 13);
        bilet.printeaza();

        System.out.println();

        Decorator biletEchipaLocala = new BiletEchipaLocala(bilet);
        biletEchipaLocala.printeaza();
    }
}
