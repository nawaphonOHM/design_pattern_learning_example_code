package behavioral.template_method.abstract_classes;

public abstract class OrderProcess {
    public abstract void doSelect();
    public abstract void doPayment();
    public abstract void doDelivery();
    
    final public void giftWrap(){
        try{
            System.out.println("Gift wrap successful");
        } catch(Exception exception) {
            System.out.println("Gift wrap unsuccessful");
        }
    }
    final public void processOrder(boolean isGift){
        doSelect();
        doPayment();

        if(isGift){
            giftWrap();
        }

        doDelivery();
    }
}