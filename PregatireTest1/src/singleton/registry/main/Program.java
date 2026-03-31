package singleton.registry.main;

import singleton.registry.clase.IResource;
import singleton.registry.clase.ResourceRegistry;
import singleton.registry.clase.Sound;
import singleton.registry.clase.Texture;

public class Program {
    public static void main(String[] args) {
        Texture cer1 = new Texture();
        Texture cer2 = new Texture();
        Sound vant = new Sound();

        IResource resursa1 = ResourceRegistry.register("Cer", cer1);
        IResource resursa2 = ResourceRegistry.register("Cer", cer2);

        resursa2.load();

        if(resursa1 == resursa2) {
            System.out.println("Sunt acealasi obiect in memorie");
        }

        ResourceRegistry.getResursa("Cer").load();

//        try {
//            ResourceRegistry.register("Cer", cer);
//            ResourceRegistry.register("Vant", vant);
//
//            //ResourceRegistry.register("Cer", textura2);
//
//            ResourceRegistry.getResursa("Vant").load();
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
    }
}
