package facade.hotel.clase;

public class Facade {
    public static boolean verificareCamera(int codCamera){
        CamereLibere libere = new CamereLibere();
        if(libere.verificaCameraLibera(codCamera)){
            Menajera menajera = new Menajera();
            if(menajera.esteCameraCurata(codCamera) && menajera.areProsoape(codCamera)){
                return true;
            }
            else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static String verificareDisponibilitaateCamera(int codCamera){
        CamereLibere camereLibere = new CamereLibere();
        if(camereLibere.verificaCameraLibera(codCamera)){
            Menajera menajera = new Menajera();
            if(menajera.esteCameraCurata(codCamera) && menajera.areProsoape(codCamera)){
                return "Camera este gata!";
            }
            else {
                return "Asteptati pana se face curat";
            }
        }
        else {
            return "Asteptati pana se elibereaza";
        }
    }
}
