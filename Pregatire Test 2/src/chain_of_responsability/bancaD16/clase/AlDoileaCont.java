package chain_of_responsability.bancaD16.clase;

public class AlDoileaCont extends ContHandler {
    public AlDoileaCont(double sold) {
        super(sold);
    }

    @Override
    public void plateste(double sumaPlata) {
        if(this.sold >= sumaPlata){
            sold-=sumaPlata;
            System.out.println("S-a platit suma de "+sumaPlata+", sold disponibil cont2: "+this.sold);
        } else{
            if(super.succesor != null) {
                super.succesor.plateste(sumaPlata);
            } }
    }
}
