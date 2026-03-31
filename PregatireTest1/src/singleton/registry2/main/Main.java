package singleton.registry2.main;

import singleton.registry.clase.ResourceRegistry;
import singleton.registry2.clase.APIRestry;
import singleton.registry2.clase.GoogleConn;
import singleton.registry2.clase.YahooConn;

public class Main {
    public static void main(String[] args) {
        GoogleConn con1 = new GoogleConn();
        YahooConn con2 = new YahooConn();
        GoogleConn con3 = new GoogleConn();

        try {
            APIRestry.register("Google", con1);
            APIRestry.register("Yahoo", con2);
            //APIRestry.register("Google", con3);


            APIRestry.getAPI("Google").connecton();
            APIRestry.getAPI("Yahoo").connecton();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
