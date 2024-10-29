public class PrintEuro extends Print{
    public PrintEuro(Stock s) {
        super(s);
    }

    public double exchangeValue(double value) {
        return value * 0.85;
    }

    @Override
    public void printValue() {
        double euroValue = exchangeValue(_stock.getStockValue());
        System.out.println("Stock value in Euro: " + euroValue);
    }
}
