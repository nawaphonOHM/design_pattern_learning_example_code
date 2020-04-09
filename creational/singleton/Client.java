package creational.singleton;

import creational.factory_method.creator.implementations.Creator;
import creational.singleton.vehicle_factory.VehicleFactory;

public class Client extends Thread {
    public static void main(String[] args){
        Client worker;
        for(int i = 0; i < 1024; i++){
            worker = new Client();

            worker.start();
        }
    }

    @Override
    public void run(){
        final Creator carBuilder1;
        final Creator carBuilder2;
        final long id = Thread.currentThread().getId();


        System.out.println("<Thread:" + id + "> " + "Let get car builder!!!");
        carBuilder1 = VehicleFactory.getFactory();
        System.out.println("<Thread:" + id + "> " + "Ok we got builder number -> " + carBuilder1);
        System.out.println("<Thread:" + id + "> " + "Let's try to get builder again!!!");
        carBuilder2 = VehicleFactory.getFactory();
        System.out.println("<Thread:" + id + "> " + "we got builder number -> " + carBuilder2);

        if(carBuilder1 == carBuilder2){
            System.out.println("<Thread:" + id + "> " + "We've got same factory!");
        } else {
            System.out.println("<Thread:" + id + "> " + "What happens! Why did get difference objects");
        }
    }
}