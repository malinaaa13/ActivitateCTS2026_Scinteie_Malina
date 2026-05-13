package proxy.stbF8.main;

import proxy.stbF8.clase.Autobuz;
import proxy.stbF8.clase.IAutobuz;
import proxy.stbF8.proxy.ProxyAutobuzNocturn;

public class Main {
    public static void main(String[] args) {
        IAutobuz autobuz = new Autobuz(163, 0);
        autobuz.opresteInStatie();

        ProxyAutobuzNocturn proxyAutobuzNocturn = new ProxyAutobuzNocturn(autobuz);
        proxyAutobuzNocturn.opresteInStatie();
    }
}
