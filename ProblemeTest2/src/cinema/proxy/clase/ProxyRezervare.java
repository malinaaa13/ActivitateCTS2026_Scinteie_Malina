package cinema.proxy.clase;

public class ProxyRezervare implements IRezervare{
    private Rezervare rezervare;

    public ProxyRezervare(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezervaOnline() {
        if(rezervare.isEsteAutentificat()){
            if(rezervare.isArePlata()){
                if(rezervare.isAreLoc()){
                    rezervare.rezervaOnline();
                }else
                {System.out.println("Nu exista loc liber");}
            }else
            {System.out.println("Efectuati plata mai intai");}
        }else
        {System.out.println("Trebuie sa va autentificati prima data");}
    }
}
