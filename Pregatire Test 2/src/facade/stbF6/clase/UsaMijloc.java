package facade.stbF6.clase;

public class UsaMijloc implements Usa {

    @Override
    public void punereInModLiber() {
        System.out.println("Usa din mijloc a fost pus in modul liber");
    }

    @Override
    public void deschiderFortata() {
        System.out.println("Usa din mijloc a fost deschisa fortat");
    }
}
