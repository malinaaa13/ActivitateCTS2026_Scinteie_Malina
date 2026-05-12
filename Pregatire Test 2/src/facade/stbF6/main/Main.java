package facade.stbF6.main;

import facade.stbF6.fatada.AutobuzFatada;

public class Main {
    public static void main(String[] args) {
        AutobuzFatada fatada = new AutobuzFatada();
        fatada.deschireFortataUsi();
        System.out.println("\n");
        fatada.punereUsiInModulLiber();
    }
}
