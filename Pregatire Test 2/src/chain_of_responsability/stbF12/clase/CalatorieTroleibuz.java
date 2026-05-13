package chain_of_responsability.stbF12.clase;

public class CalatorieTroleibuz extends CalatoriHandler{
    @Override
    public String recomandaCalatoria(double distanta) {
        if( distanta < 3){
            return "Troleibuz";
        }
        return super.succesor.recomandaCalatoria(distanta);
    }
}
