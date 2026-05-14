package spalatorieAuto.chain_of_responsability.clase;

public class Prespalare extends SpalatorieHandler {
    @Override
    public void spalare(AbstractAutoWashOptions options) {
        if(options.isPrewashSelected()) {
            System.out.println("Se aplica prespalarea.");
        }
        if(succesor!= null) {
                succesor.spalare(options);
        }}


}
