package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends AplicantiReader {


    public AngajatiReader(String numeFisier) {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.numeFisier));
        input.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Angajat a = new Angajat();

            super.citesteAplicant(input, a);
            int salariu = input.nextInt();
            a.setSalariu(salariu);
            String ocupatie = input.next();
            a.setOcupatie(ocupatie);
            angajati.add(a);
        }
        input.close();
        return angajati;
    }
}
