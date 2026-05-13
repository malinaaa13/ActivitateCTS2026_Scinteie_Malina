package flyweight.spitalA10.main;

import flyweight.spitalA10.clase.FabricaDeInternari;
import flyweight.spitalA10.clase.IPacient;
import flyweight.spitalA10.clase.Internare;
import flyweight.spitalA10.clase.Pacient;

public class Main {
    public static void main(String[] args) {
        FabricaDeInternari fabricaDeInternari = new FabricaDeInternari();

        try{
            Internare internare1 = new Internare(3, 5, 7);
            Internare internare2 = new Internare(20, 6, 3);

            IPacient pacient = new Pacient(1, "Pop", "0987654321", "strada trandafirilor");
            pacient.descriere(internare1);

            fabricaDeInternari.getPacient(1, "Ionescu","0987654321", "Strada Chibzuintei").descriere(internare2);
            fabricaDeInternari.getPacient(1).descriere(internare1);

        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
