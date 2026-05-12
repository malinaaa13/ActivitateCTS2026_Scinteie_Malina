package chain_of_responsability.clase;

public class CalatorieAutobuz extends CalatorieHandler{
    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta < 5){
            return "Autobuz";
        }
        return super.succesor.recomandaCalatorie(distanta);
    }
}
