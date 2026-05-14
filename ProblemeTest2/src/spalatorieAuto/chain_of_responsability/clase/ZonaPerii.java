package spalatorieAuto.chain_of_responsability.clase;

public class ZonaPerii extends SpalatorieHandler {
    @Override
    public void spalare(AbstractAutoWashOptions options) {
        if(options.isBrushWashingSelected()){
            System.out.println("Trece prin zona cu perii");

        }
            if(succesor!= null) {
                succesor.spalare(options);
            }}

    }

