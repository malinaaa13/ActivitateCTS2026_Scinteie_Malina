package spalatorieAuto.decorator.clase;

import spalatorieAuto.chain_of_responsability.clase.AbstractAutoWashOptions;

public abstract class ProgramSpalareAbstract implements AbstractAutoWashOptions {

    @Override
    public boolean isPrewashSelected() {
        return false;
    }

    @Override
    public boolean isBrushWashingSelected() {
        return false;
    }

    @Override
    public boolean isWaxAndPolishSelected() {
        return false;
    }

    @Override
    public boolean isDryingSelected() {
        return false;
    }

    public abstract void spalare();
}
