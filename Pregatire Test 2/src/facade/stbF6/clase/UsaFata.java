package facade.stbF6.clase;

public class UsaFata implements Usa{
    @Override
    public void punereInModLiber() {
        System.out.println("Usa din fata a fost pusa in modul liber");
    }

    @Override
    public void deschiderFortata() {
        System.out.println("Usa din fata a fost deschisa fortat");
    }
}
