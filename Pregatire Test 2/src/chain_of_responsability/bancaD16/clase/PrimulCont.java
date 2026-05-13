package chain_of_responsability.bancaD16.clase;

public class PrimulCont extends ContHandler {

    public PrimulCont(double sold) {
        super(sold);
    }

    @Override
    public void plateste(double sumaPlata) {
        if(this.sold >= sumaPlata){
            sold-=sumaPlata;
            System.out.println("S-a platit suma de "+sumaPlata+", sold cont1 disponibil:"+this.sold);
        } else{
            if(super.succesor!=null) {
                super.succesor.plateste(sumaPlata);
            }}
    }
}
