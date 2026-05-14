package spalatorieAuto.chain_of_responsability.clase;

public class TunelSpalare extends SpalatorieHandler {
    @Override
    public void spalare(AbstractAutoWashOptions options) {
        System.out.println("Masina intra in tunelul de spalare");

        if(super.succesor != null){
            super.succesor.spalare(options);
        }
    }
}
