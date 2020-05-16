package behavioral.iterator.types.implementations;

import behavioral.iterator.types.Notification;

public class NormalNotification implements Notification {

    final private String notification;

    public NormalNotification(String notification){
        this.notification = notification;
    }

    @Override
    public String getNotification() {
        return this.notification;
    }
    
}