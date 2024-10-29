import jdk.jshell.Snippet;

import java.util.LinkedList;
import java.util.Scanner;

public class Stock extends Subject {
    private double stockValue;

    public double getStockValue() {
        return stockValue;
    }

    public void setStockValue(double stockValue) {
        this.stockValue = stockValue;
    }

    public void readValue()
    {
        do {
            notifyObservers();
            System.out.println("New Stock");
            Scanner s = new Scanner(System.in);
            stockValue = s.nextDouble();
        } while (stockValue >= 0);

    }
}
