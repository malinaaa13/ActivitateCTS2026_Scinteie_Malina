package chain_of_responsability.stbF12.clase;

public abstract class CalatoriHandler {
    protected CalatoriHandler succesor;

    public CalatoriHandler() {
        this.succesor = null;
    }

    public void setCalatorieHandler(CalatoriHandler calatorieHandler) {
        this.succesor = calatorieHandler;
    }

    public abstract String recomandaCalatoria(double distanta);
}
