package singleton.registry2.clase;

public class CryptoConn implements IAPIConnection{
    @Override
    public void connecton() {
        System.out.println("Crypto connection");
    }
}
