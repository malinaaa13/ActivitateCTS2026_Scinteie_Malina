package facade.clase;

public class Salon {
    private boolean paturiLibere[] = new boolean[50];

    private static Salon instanta = null;

    private Salon() {
        this.paturiLibere = paturiLibere;
        paturiLibere[1] = true;
        paturiLibere[2] = true;
        paturiLibere[4] = true;
        paturiLibere[6] = true;
        paturiLibere[8] = true;
        paturiLibere[13] = true;
    }

    public int suntPaturiLibere() {
        for(int i=0; i<=paturiLibere.length;i++){
            if(paturiLibere[i] == true){
                return i;
            }
        }
        return -1;
    }

    public void OcupaPat(int i){
        this.paturiLibere[i] = false;
    }

    public static Salon getInstance(){
        if(instanta == null){
            instanta = new Salon();
        }
        return instanta;
    }
}
