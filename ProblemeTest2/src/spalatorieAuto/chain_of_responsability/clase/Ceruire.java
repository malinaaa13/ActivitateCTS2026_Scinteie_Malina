package spalatorieAuto.chain_of_responsability.clase;

public class Ceruire extends SpalatorieHandler {
    @Override
    public void spalare(AbstractAutoWashOptions options) {
        if(options.isWaxAndPolishSelected()){
            System.out.println("Se aplica ceruirea si polish-ul");
        }
        if(succesor!= null) {
                succesor.spalare(options);
            }
        }

    }

