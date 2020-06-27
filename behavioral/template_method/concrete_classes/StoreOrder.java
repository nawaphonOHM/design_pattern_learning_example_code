package behavioral.template_method.concrete_classes;

import behavioral.template_method.abstract_classes.OrderProcess;

public class StoreOrder extends OrderProcess {

    @Override
    public void doSelect() {
        System.out.println("Customer choses the item from shelf.");
    }

    @Override
    public void doPayment() {
        System.out.println("Pays at counter through cash/POS");
    }

    @Override
    public void doDelivery() {
        System.out.println("Item deliverd to in delivery counter.");
    }
    
}