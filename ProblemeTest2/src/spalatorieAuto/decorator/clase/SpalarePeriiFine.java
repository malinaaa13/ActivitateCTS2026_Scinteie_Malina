package spalatorieAuto.decorator.clase;

public class SpalarePeriiFine extends Decorator{
    public SpalarePeriiFine(ProgramSpalareAbstract programDecorat) {
        super(programDecorat);
    }

    @Override
    public void decoreaza() {
        System.out.println("Masina a fost spalata cu perii fine.");
    }
}
