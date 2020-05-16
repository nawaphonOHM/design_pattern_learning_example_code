package behavioral.iterator;

import behavioral.iterator.concrete_agregates.NotificationCollection;
import behavioral.iterator.iterators.Iterator;
import behavioral.iterator.types.implementations.NormalNotification;

public class Client {
    public static void main(String[] args){
        final NotificationCollection collector = new NotificationCollection();
        final Iterator iter = collector.createInterator();

        while(iter.hasNext()){
            System.out.println(((NormalNotification)iter.getNext()).getNotification());
        }
    }
}