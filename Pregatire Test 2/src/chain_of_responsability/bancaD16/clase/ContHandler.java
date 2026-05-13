package chain_of_responsability.bancaD16.clase;

public abstract class ContHandler {
    protected ContHandler succesor;
    protected double sold;

    public ContHandler(double sold) {
        this.sold = sold;
    }

    public void setSuccesor(ContHandler succesor) {
        this.succesor = succesor;
    }

    public abstract void plateste(double sumaPlata);
}
