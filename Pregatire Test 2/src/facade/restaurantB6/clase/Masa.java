package facade.restaurantB6.clase;

public class Masa {
    private boolean meseLibere[] = new boolean[20];

    public Masa() {
        this.meseLibere = meseLibere;
        meseLibere[1] = true;
        meseLibere[4]=true;
        meseLibere[5]=true;
        meseLibere[7]=true;
    }

    public boolean esteMasaLibera(int cod){
        if(cod >=0 && cod < meseLibere.length){
            return meseLibere[cod];
        }
        return false;
    }

    public void ocupaMasa(int cod){
        if(cod >=0 && cod < meseLibere.length){
         this.meseLibere[cod] = false;
        }
    }
}
