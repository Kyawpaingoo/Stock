import jdk.jshell.Snippet;

import java.util.LinkedList;
import java.util.Scanner;

public class Stock {
    private double stockValue;

    public double getStockValue() {
        return stockValue;
    }

    public void setStockValue(double stockValue) {
        this.stockValue = stockValue;
    }

    private final LinkedList<Print> printLists = new LinkedList<Print>();

    public void attach(Print p) {
        printLists.add(p);
    }

    public void detach(Print p)
    {
        printLists.remove(p);
    }

    public void readValue()
    {
        do {
            for(Print display: printLists) {
                display.printValue();
            }

            System.out.println("New Stock");
            Scanner s = new Scanner(System.in);
            stockValue = s.nextDouble();
        } while (stockValue >= 0);

    }
}
