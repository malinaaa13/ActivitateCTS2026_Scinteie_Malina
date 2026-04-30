package strategy.clase;

public class PlataCard implements ModalitateDePlata{
    private double sumaDisponibila;

    @Override
    public void plateste(String numeClient, double suma) {
        System.out.println("Clientul: "+numeClient+ " a platit cu cardul suma de "+suma+" lei");
        this.sumaDisponibila = this.sumaDisponibila - suma;
    }
}
