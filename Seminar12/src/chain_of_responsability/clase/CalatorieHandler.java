package chain_of_responsability.clase;

public abstract class CalatorieHandler {
    protected CalatorieHandler succesor;

    public CalatorieHandler() {
        this.succesor = null;
    }

    public void setCalatorieHandler(CalatorieHandler calatorieHandler) {
        this.succesor = calatorieHandler;
    }

    public abstract String recomandaCalatorie(double distanta);
}
