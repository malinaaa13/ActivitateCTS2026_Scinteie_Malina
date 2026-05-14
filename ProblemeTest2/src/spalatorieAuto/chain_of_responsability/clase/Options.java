package spalatorieAuto.chain_of_responsability.clase;

public class Options implements AbstractAutoWashOptions{
    private boolean isPrewash;
    private boolean isBrush;
    private boolean isWax;
    private boolean isDrying;

    public Options(boolean isPrewash, boolean isBrush, boolean isWax, boolean isDrying) {
        this.isPrewash = isPrewash;
        this.isBrush = isBrush;
        this.isWax = isWax;
        this.isDrying = isDrying;
    }

    @Override
    public boolean isPrewashSelected() {
        return isPrewash;
    }

    @Override
    public boolean isBrushWashingSelected() {
        return isBrush;
    }

    @Override
    public boolean isWaxAndPolishSelected() {
        return isWax;
    }

    @Override
    public boolean isDryingSelected() {
        return isDrying;
    }
}
