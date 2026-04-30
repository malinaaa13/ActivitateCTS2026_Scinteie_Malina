package strategy.clase;

public class PlataCash implements ModalitateDePlata{
    @Override
    public void plateste(String numeClient, double suma) {
        System.out.println("Clientul: "+numeClient+ " a platit cash suma de "+suma+" lei");
    }
}
