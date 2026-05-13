package strategy.agentie.clase;

public class Card implements ModPlata{
    @Override
    public void plateste(String numeClient, double sumaPlatita) {
        System.out.println(numeClient+" a platit cu cardul suma de "+sumaPlatita);
    }
}
