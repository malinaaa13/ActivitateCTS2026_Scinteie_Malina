package proxy.stbF8.proxy;

import proxy.stbF8.clase.Autobuz;
import proxy.stbF8.clase.IAutobuz;

public class ProxyAutobuzNocturn implements IAutobuz {

    private IAutobuz autobuz;


    public ProxyAutobuzNocturn(IAutobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie() {
        if(((Autobuz)autobuz).getNrCalatori() > 0){
            autobuz.opresteInStatie();
        } else{
            System.out.println("Autobuzul se retrage la autobaza");
        }
    }
}
