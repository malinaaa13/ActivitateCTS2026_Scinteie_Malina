package biblioteca.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Colectie extends Structura implements ElementBiblioteca{
    private String denumire;
    private List<Structura> listaStructuri;

    public Colectie(String denumire){
        this.denumire = denumire;
        this.listaStructuri = new ArrayList<Structura>();
    }

    @Override
    public void adaugaStructura(Structura structura) {
        listaStructuri.add(structura);
    }

    @Override
    public void stergeStructura(Structura structura) {
        listaStructuri.remove(structura);
    }

    @Override
    public Structura getStructura(int index) {
        return listaStructuri.get(index);
    }

    @Override
    public void printeazaInformatii() {
        System.out.println("Colectia: "+this.denumire);
        for(Structura structura : listaStructuri){
                structura.printeazaInformatii();
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Colectie{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
