package behavioral.iterator.aggregates;

import behavioral.iterator.iterators.Iterator;

public interface Collection {
    public Iterator createInterator();
}