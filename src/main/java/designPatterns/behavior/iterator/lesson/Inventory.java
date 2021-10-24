package designPatterns.behavior.iterator.lesson;

import java.util.Iterator;

public class Inventory implements Iterable {

    private Item[] items;

    public Inventory(Item... items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }

    @Override
    public Iterator iterator() {
        return new StockIterator(this);
    }
}
