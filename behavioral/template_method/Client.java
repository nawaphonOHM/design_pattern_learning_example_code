package behavioral.template_method;

import behavioral.template_method.abstract_classes.OrderProcess;
import behavioral.template_method.concrete_classes.NetOrder;
import behavioral.template_method.concrete_classes.StoreOrder;

public class Client {
    public static void main(String[] args){
        final OrderProcess netOrder = new NetOrder();

        netOrder.processOrder(true);
        System.out.println();

        final OrderProcess storeOrder = new StoreOrder();
        storeOrder.processOrder(true);
    }
}