package behavioral.iterator.concrete_agregates;

import java.util.Date;

import behavioral.iterator.aggregates.Collection;
import behavioral.iterator.concrete_iterators.NotificationIterator;
import behavioral.iterator.iterators.Iterator;
import behavioral.iterator.types.Notification;
import behavioral.iterator.types.implementations.NormalNotification;

public class NotificationCollection implements Collection {
    static final int MAX = 6;
    int numberOfItems = 0;
    Notification[] notifications;

    public NotificationCollection(){
        this.notifications = new Notification[MAX];

        this.addItem("Notification: 1 -> Today is " + new Date() + ".");
        this.addItem("Notification: 2 -> こんにちは.");
        this.addItem("Notification: 3 -> You have lucky number is " + Math.rint(Math.random() * 10) + ".");

    }

    @Override
    public Iterator createInterator() {
        return new NotificationIterator(notifications);
    }

    public void addItem(String str){
        if(numberOfItems < MAX){
            notifications[numberOfItems++] = new NormalNotification(str);
        } else {
            System.err.println("It's full.");
        }
    }
    
}