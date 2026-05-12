package facade.stbF6.fatada;

import facade.stbF6.clase.UsaFata;
import facade.stbF6.clase.UsaMijloc;
import facade.stbF6.clase.UsaSpate;

public class AutobuzFatada {
    UsaFata usaFata;
    UsaMijloc usaMijloc;
    UsaSpate usaSpate;

    public AutobuzFatada(){
        usaFata = new UsaFata();
        usaMijloc = new UsaMijloc();
        usaSpate = new UsaSpate();
    }

    public void punereUsiInModulLiber(){
        usaFata.punereInModLiber();
        usaMijloc.punereInModLiber();
        usaSpate.punereInModLiber();
    }

    public void deschireFortataUsi(){
        usaFata.deschiderFortata();
        usaMijloc.deschiderFortata();
        usaSpate.deschiderFortata();
    }
}
