package facade.stbF6.clase;

public class UsaSpate implements Usa{
    @Override
    public void punereInModLiber() {
        System.out.println("Usa din spate a fost pusa in modul liber");
    }

    @Override
    public void deschiderFortata() {
        System.out.println("Usa din spate a fost deschisa fortat");
    }
}
