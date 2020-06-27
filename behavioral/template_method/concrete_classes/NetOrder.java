package behavioral.template_method.concrete_classes;

import behavioral.template_method.abstract_classes.OrderProcess;

public class NetOrder extends OrderProcess{

    @Override
    public void doSelect() {
        System.out.println("Item added to online shopping cart");
        System.out.println("Get gift wrap preference");
        System.out.println("Get delivery address.");
    }

    @Override
    public void doPayment() {
        System.out.println("Online Payment through Netbanking or credit card");
    }

    @Override
    public void doDelivery() {
        System.out.println("Ship the item through post to delivery address");
    }
    
}