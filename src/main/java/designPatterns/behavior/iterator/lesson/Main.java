package designPatterns.behavior.iterator.lesson;

public class Main {

    public static void main (String [] args) {

        Item pens = new Item("pens", 175);
        Item pencils = new Item("pencils", 0);
        Item paper = new Item("paper", 100);

        Inventory inventory = new Inventory(paper, pencils, pens);

        StockIterator stockIterator = (StockIterator) inventory.iterator();

        while (stockIterator.hasNext()) {
            Item item = stockIterator.next();
            System.out.println(item.getName());
        }
    }
}
