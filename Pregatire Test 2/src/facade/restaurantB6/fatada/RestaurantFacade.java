package facade.restaurantB6.fatada;

import facade.restaurantB6.clase.Masa;
import facade.restaurantB6.clase.PersonalArajareMasa;
import facade.restaurantB6.clase.PersonalDebarasare;

public class RestaurantFacade {
    Masa masa;
    PersonalDebarasare personalDebarasare;
    PersonalArajareMasa personalArajareMasa;

    public RestaurantFacade(Masa masa, PersonalDebarasare personalDebarasare, PersonalArajareMasa personalArajareMasa) {
        this.masa = masa;
        this.personalDebarasare = personalDebarasare;
        this.personalArajareMasa = personalArajareMasa;
    }
    public RestaurantFacade(){
        this.masa = new Masa();
        this.personalDebarasare = new PersonalDebarasare();
        this.personalArajareMasa = new PersonalArajareMasa();
    }

    public void verificareMasa(int codMasa){
        if(masa.esteMasaLibera(codMasa)){
            System.out.println("Masa "+codMasa+" este libera");
            if(personalDebarasare.esteMasaDebarasata(codMasa)){
                System.out.println("Masa este debarasata");
                if(personalArajareMasa.areServetele(codMasa)){
                    System.out.println("Masa are servetele");
                    System.out.println("Masa poate fi rezervata");
                } else{
                    System.out.println("Asteptati pana se pun servetelele la masa");
                }
            }else {
                System.out.println("Asteptati pana masa e debarasata");
            }
        } else {
            System.out.println("Masa nu este libera, incercati alta masa");
        }
    }
}
