package decorator.main;

import decorator.clase.NotaDePlata;
import decorator.clase.NotaDePlataAbstract;
import decorator.clase.decorator.NotaDePlata1Mai;
import decorator.clase.decorator.NotaDePlataDecorator;
import decorator.clase.decorator.NotaDePlataNoulAn;

public class Main {
    public static void main(String[] args) {
        NotaDePlataAbstract notaDePlata = new NotaDePlata(230.00f, "12/03/2026");
        notaDePlata.printeaza();

        int a = 1;
        NotaDePlataDecorator decorator=null;

        if(a==1){
            decorator = new NotaDePlataNoulAn(notaDePlata);
        } else if(a == 2){
            decorator = new NotaDePlata1Mai(notaDePlata);
        }

        decorator.printeaza();
        decorator.printeazaFelicitare();


//        NotaDePlataDecorator decorator = new NotaDePlataNoulAn(notaDePlata);
//        decorator.printeaza();
//        decorator.printeazaFelicitare();



    }
}
