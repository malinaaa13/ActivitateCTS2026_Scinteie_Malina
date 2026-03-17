package ro.ase.cts.builder.main;

import ro.ase.cts.builder.clase.Internare;
import ro.ase.cts.builder.clase.InternareBuilder;

public class Main {
    public static void main(String[] args) {
        Internare internare1 = new Internare(true, true, true, false, "Mihai Popescu");
        Internare internare2 = new Internare(false, false, false, false, "Irina Iancu");
        InternareBuilder builder = new InternareBuilder("Iustin Tanase");
        Internare internare3 = builder.build();
        Internare internare4 = builder.setnume("Mirabela Tudor").setPat(true).setMicDejun(true).setPapuci(true).build();
        System.out.println(internare3.toString());
        System.out.println(internare4.toString());
    }
}
