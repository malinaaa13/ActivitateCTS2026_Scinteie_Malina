package singleton.registry2.clase;

public class YahooConn implements IAPIConnection{
    @Override
    public void connecton() {
        System.out.println("Yahoo connection");
    }
}
