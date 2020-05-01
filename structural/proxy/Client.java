package structural.proxy;

import structural.proxy.proxy.ProxyInternet;
import structural.proxy.subject.Internet;

public class Client {
    public static void main(String[] args){
        Internet internet = new ProxyInternet();

        try{
            internet.connectTo("google.org");
            internet.connectTo("dev.to");
            internet.connectTo("abc.com");
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}