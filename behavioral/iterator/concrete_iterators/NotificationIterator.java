package behavioral.iterator.concrete_iterators;

import behavioral.iterator.iterators.Iterator;
import behavioral.iterator.types.Notification;

public class NotificationIterator implements Iterator {
    final Notification[] notifications;
    int position = 0;

    public NotificationIterator(Notification[] notifications){
        this.notifications = notifications;
    }

    @Override
    public boolean hasNext() {
        return this.position < this.notifications.length && 
            this.notifications[this.position] != null;
    }

    @Override
    public Object getNext() {
        return notifications[position++];
    }
    
}