package structural.proxy.real_subject;

import structural.proxy.subject.Internet;

public class RealInternet implements Internet {

    @Override
    public void connectTo(String serverHost) throws Exception {
        System.out.println("Connecting to " + serverHost);
    }

}