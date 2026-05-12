package facade.hotel.clase;

import java.util.ArrayList;
import java.util.List;

public class Menajera {
    private List<Boolean> camereCurate;

    public Menajera(){
        camereCurate = new ArrayList<Boolean>();
        for(int i =0; i<6; i++)
            camereCurate.add(true);
        for(int i=6; i<10; i++)
            camereCurate.add(false);
    }

    public boolean esteCameraCurata(int cod){
        return camereCurate.get(cod);
    }

    public boolean areProsoape(int cod){
        return camereCurate.get(cod);
    }
}
