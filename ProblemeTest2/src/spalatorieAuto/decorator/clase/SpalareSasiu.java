package spalatorieAuto.decorator.clase;

public class SpalareSasiu extends Decorator{

    public SpalareSasiu(ProgramSpalareAbstract programDecorat) {
        super(programDecorat);
    }

    @Override
    public void decoreaza() {
        System.out.println("S-a realiza spalarea sasiului");
    }
}
