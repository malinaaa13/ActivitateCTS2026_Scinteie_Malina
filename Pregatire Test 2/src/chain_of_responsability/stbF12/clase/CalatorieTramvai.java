package chain_of_responsability.stbF12.clase;

public class CalatorieTramvai extends CalatoriHandler{

    @Override
    public String recomandaCalatoria(double distanta) {
        if( distanta < 10){
            return "Tramvai";
        }
        return super.succesor.recomandaCalatoria(distanta);
    }
}
