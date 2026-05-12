package facade.agentie.clase;

public class Facade {
    public void rezervaPachetCazareTransport(String orasPlecare, String orasDestinatie){
        CompanieAeriana companieAeriana = new CompanieAeriana("RyanAir");
        Zbor zborDus = companieAeriana.rezervaBiletAvion(orasPlecare, orasDestinatie);
        Zbor zborIntors = companieAeriana.rezervaBiletAvion(orasDestinatie, orasPlecare);

        Hotel hotel = new Hotel("Margo Hotel");
        System.out.println(zborDus.toString());
        System.out.println(zborIntors.toString());
        hotel.rezervaCamera(orasDestinatie);
    }
}
