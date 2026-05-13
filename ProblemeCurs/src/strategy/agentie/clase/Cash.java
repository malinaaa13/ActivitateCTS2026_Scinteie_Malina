package strategy.agentie.clase;

public class Cash implements ModPlata{
    @Override
    public void plateste(String numeClient, double sumaPlatita) {
        System.out.println(numeClient+" a platit cash suma de "+sumaPlatita);
    }
}
