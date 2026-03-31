package singleton.registry2.clase;

public class GoogleConn implements IAPIConnection{
    @Override
    public void connecton() {
        System.out.println("Conectiune Google");
    }
}
