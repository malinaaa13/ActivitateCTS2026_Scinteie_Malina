package spalatorieAuto.decorator.clase;

public class SpalareApaDedurizata extends Decorator{
    public SpalareApaDedurizata(ProgramSpalareAbstract programDecorat) {
        super(programDecorat);
    }

    @Override
    public void decoreaza() {
        System.out.println("S-a realizat spalarea cu apa dedurizata");
    }
}
