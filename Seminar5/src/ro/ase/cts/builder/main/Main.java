package ro.ase.cts.builder.main;

import ro.ase.cts.builder.clase.Internare;
import ro.ase.cts.builder.clase.InternareBuilder;
import ro.ase.cts.builder.clase.InternareBuilderAlternativ;

public class Main {
    public static void main(String[] args) {
        Internare internare1 = new Internare(true, true, true, false, "Mihai Popescu");
        Internare internare2 = new Internare(false, false, false, false, "Irina Iancu");
        InternareBuilder builder = new InternareBuilder("Iustin Tanase");
        Internare internare3 = builder.build();
        Internare internare4 = builder.setnume("Mirabela Tudor").setPat(true).setMicDejun(true).setPapuci(true).build();
        System.out.println(internare3.toString());
        System.out.println(internare4.toString());


        InternareBuilderAlternativ builderAlternativ = new InternareBuilderAlternativ();
        builderAlternativ.setMicDejun(true);
        Internare internare101 = builderAlternativ.build("Popescu Ion");
        Internare internare102 = builderAlternativ.build("Georgescu Maria");
        Internare internare103 = builderAlternativ.build("Ingrid Iris");

        //daca vreau sa nu mai pot modifica numele, final pt versiune 2
        // sau facem setteri protected ca sa nu mai putem modifica din main
        // sunt 3 versiuni de builder
        // cea mai buna cu inner class ca sa aiba acces la toate elementele private
        //internare101.setNumePacient("Popescu Ionel");
        System.out.println(internare101.toString());
        System.out.println(internare102.toString());
        System.out.println(internare103.toString());

        //tot ce modifici ramane la urmatoarele apeluri!!!
        //versiunea alternativa incalca DRY!!

    }
}
