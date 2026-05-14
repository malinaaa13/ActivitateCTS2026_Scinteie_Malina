package spalatorieAuto.decorator.clase;

public abstract class Decorator extends ProgramSpalareAbstract{
    private ProgramSpalareAbstract programDecorat;

    public Decorator(ProgramSpalareAbstract programDecorat) {
        this.programDecorat = programDecorat;
    }

    @Override
    public void spalare() {
        programDecorat.spalare();
        decoreaza();
    }

    public abstract void decoreaza();
}
