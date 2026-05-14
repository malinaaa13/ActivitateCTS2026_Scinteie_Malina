package spalatorieAuto.chain_of_responsability.clase;

public abstract class SpalatorieHandler {
    protected SpalatorieHandler succesor;

    public void setSuccesor(SpalatorieHandler succesor) {
        this.succesor = succesor;
    }

    public abstract void spalare(AbstractAutoWashOptions options);
}
