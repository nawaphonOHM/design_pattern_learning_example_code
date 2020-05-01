package structural.proxy.proxy;

import java.util.ArrayList;
import java.util.List;

import structural.proxy.real_subject.RealInternet;
import structural.proxy.subject.Internet;

public class ProxyInternet implements Internet {
    final private Internet internet = new RealInternet();
    final private static List<String> bannedSites; 

    static{
        bannedSites = new ArrayList<String>();

        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        if(bannedSites.contains(serverHost.toLowerCase())){
            throw new Exception("Access Denied");
        }

        internet.connectTo(serverHost);
    }

}