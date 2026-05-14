package cinema.flyweight.clase;

import java.util.HashMap;

public class FabricaDeBilete {
    private HashMap<String, IBilet> bilete;

    public FabricaDeBilete(){
        this.bilete = new HashMap<String, IBilet>();
    }

    public IBilet getBilet(String numeFilm) throws Exception{
        IBilet bilet = bilete.get(numeFilm);
        if(bilet == null){
            throw new RuntimeException("Nu exista filmul");
        }
        return bilet;
    }

    public IBilet getBilet(String numeFilm, String gen, int durata, String clasificare){
        IBilet bilet = bilete.get(numeFilm);
        if(bilet == null){
            bilet = new Bilet(numeFilm, gen, durata, clasificare);
            bilete.put(numeFilm,bilet);
        }
        return bilet;
    }
}
