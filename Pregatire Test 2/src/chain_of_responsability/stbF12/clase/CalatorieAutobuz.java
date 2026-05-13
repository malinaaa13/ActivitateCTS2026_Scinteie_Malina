package chain_of_responsability.stbF12.clase;

public class CalatorieAutobuz extends CalatoriHandler{
    @Override
    public String recomandaCalatoria(double distanta) {
        if( distanta <5){
            return "Autobuz";
        }
        return super.succesor.recomandaCalatoria(distanta);
    }
}
