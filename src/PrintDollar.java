public class PrintDollar extends Print {
    public PrintDollar(Stock s) {
        super(s);
    }

    public double exchangeValue(double value) {
        return value * 1.1;
    }

    @Override
    public void printValue() {
        double dollarValue = exchangeValue(_stock.getStockValue());
        System.out.println("Stock value in Dollar: " + dollarValue);
    }
}
