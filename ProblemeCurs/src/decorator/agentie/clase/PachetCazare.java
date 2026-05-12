package decorator.agentie.clase;

public class PachetCazare implements PachetTuristic{
    @Override
    public void descriere() {
        System.out.println("Acesta este un pachet care contine doar cazare");
    }
}
