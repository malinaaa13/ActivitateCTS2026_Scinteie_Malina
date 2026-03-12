package ro.ase.cts.main;

import ro.ase.cts.clase.Angajat;import ro.ase.cts.clase.Aplicant;import ro.ase.cts.clase.readers.AngajatiReader;import ro.ase.cts.clase.readers.AplicantiReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		Aplicant.setPragPunctaj(85);
		try {
			AplicantiReader aplicantiReader = new AngajatiReader("Seminar2/angajati.txt");
			listaAngajati = aplicantiReader.readAplicanti();
			for(Aplicant aplicant:listaAngajati) {
				System.out.println(aplicant.toString());
				aplicant.afisareVenit();
				aplicant.afisareStatut();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


