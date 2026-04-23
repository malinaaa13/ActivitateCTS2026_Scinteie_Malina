package subiecte.cinematograf.main;

import subiecte.cinematograf.clase.Bilet;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> actori = List.of("Actor1", "Actor2");
        Bilet bilet1 = new Bilet("Hamnet", "Chloe Zhao", actori, "A24", "Descriere..", true);

        System.out.println("Cate bilete doriti? ");
        int nrBilete = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i < nrBilete; i++){
            System.out.println("Introduceti datele pentru biletul "+(i+1)+" (Data Ora Loc):");
            String line = scanner.nextLine();
            String[] parts = line.split(" ");

            Bilet bilet2 = (Bilet) bilet1.copiaza();

            bilet2.setData(parts[0]);
            bilet2.setOra(Integer.parseInt(parts[1]));
            bilet2.setLoc(parts[2]);

            System.out.println("Biletul generat: "+bilet2.print());
        }
        scanner.close();
    }
}
