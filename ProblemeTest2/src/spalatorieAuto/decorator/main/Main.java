package spalatorieAuto.decorator.main;

import spalatorieAuto.decorator.clase.*;

public class Main {
    public static void main(String[] args) {
        ProgramSpalareAbstract program1 = new ProgramSpalare();
        program1.spalare();

        System.out.println("\nPerii fine:");
        Decorator periiFine =  new SpalarePeriiFine(program1);
        periiFine.spalare();

        System.out.println("\nSpalare sasiu:");
        Decorator spalareSasiu = new SpalareSasiu(program1);
        spalareSasiu.spalare();

        System.out.println("\nSpalare apa dedurizata:");
        Decorator spalareApaDedurizata = new SpalareApaDedurizata(program1);
        spalareApaDedurizata.spalare();

        System.out.println("\nCombinatii");
        ProgramSpalareAbstract programComplet = new SpalareApaDedurizata(new SpalareSasiu(new SpalarePeriiFine(new ProgramSpalare())));
        programComplet.spalare();
    }
}
