package subiecte.sala_fitness.main;

import subiecte.sala_fitness.builder.Abonament;
import subiecte.sala_fitness.builder.BuilderAbonament;
import subiecte.sala_fitness.builder.TipAbonament;
import subiecte.sala_fitness.singleton.ManagerRezervari;
import subiecte.sala_fitness.singleton.Rezervare;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Abonament abonament1 = new BuilderAbonament().setAccesClase(true).setTipAbonament(TipAbonament.VIP).build();
        System.out.println(abonament1.toString());
        BuilderAbonament builder = new BuilderAbonament();
        Abonament abonament2 = builder.build();
        System.out.println(abonament2);
        Abonament abonament3 = builder.setTipAbonament(TipAbonament.VIP).setAntrenor(true).build();
        System.out.println(abonament3);
        Abonament abonament4 = builder.setTipAbonament(TipAbonament.Premium).setDurata(30).setAntrenor(true).build();
        System.out.println(abonament4);

        System.out.println("\n-----------------------\n");

        Rezervare rezervare1 = new Rezervare("Pop Ioana", abonament1);
        //System.out.println(rezervare1.toString());
        Rezervare rezervare2 = new Rezervare("Titu Iuliana", abonament2);
        Rezervare rezervare3 = new Rezervare("Stancu Raluca", abonament3);
        Rezervare rezervare4 = new Rezervare("Staicu Delia", abonament4);

        List<Rezervare> rezervariList = new ArrayList<Rezervare>();
        rezervariList.add(rezervare1);

        List<Rezervare> rezList2 = new ArrayList<Rezervare>();
        rezList2.add(rezervare2);

        ManagerRezervari managerRezervari = ManagerRezervari.getInstance(rezervariList);
        ManagerRezervari managerRezervari2 = ManagerRezervari.getInstance(rezervariList);
        managerRezervari2.setRezervari(rezList2);

        managerRezervari.afisareRezervari();
        managerRezervari2.afisareRezervari();

        managerRezervari.adaugareRezervare(rezervare1);
        managerRezervari2.afisareRezervari();
        managerRezervari2.adaugareRezervare(rezervare3);
        managerRezervari.afisareRezervari();







    }
}
