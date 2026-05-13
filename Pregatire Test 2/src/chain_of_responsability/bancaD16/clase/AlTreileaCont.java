package chain_of_responsability.bancaD16.clase;

public class AlTreileaCont extends ContHandler {
    public AlTreileaCont(double sold) {
        super(sold);
    }

    @Override
    public void plateste(double sumaPlata) {
        if(this.sold >= sumaPlata){
            System.out.println("S-a platit suma de "+sumaPlata+", sold disponibil cont3: "+(this.sold-sumaPlata));
        }else {
            System.out.println("Plata refuzata!");
        }
    }
}
