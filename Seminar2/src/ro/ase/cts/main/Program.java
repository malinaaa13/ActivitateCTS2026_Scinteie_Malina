package ro.ase.cts.main;

import ro.ase.cts.clase.Angajat;import ro.ase.cts.clase.Aplicant;import ro.ase.cts.clase.readers.AngajatiReader;import ro.ase.cts.clase.readers.AplicantiReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			AplicantiReader aplicantiReader = new AngajatiReader();
			listaAngajati = aplicantiReader.readAplicanti("Seminar2/angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
