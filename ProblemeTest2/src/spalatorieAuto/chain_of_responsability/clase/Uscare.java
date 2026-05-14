package spalatorieAuto.chain_of_responsability.clase;

public class Uscare extends SpalatorieHandler {
    @Override
    public void spalare(AbstractAutoWashOptions options) {
        if(options.isDryingSelected()){
            System.out.println("Se aplica uscarea masinii");
        }
    }
}
