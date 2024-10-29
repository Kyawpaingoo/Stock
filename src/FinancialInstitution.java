public class FinancialInstitution {
    public static void main(String[] args) {
        Stock stock = new Stock();

        PrintEuro euro = new PrintEuro(stock);
        PrintDollar dollar = new PrintDollar(stock);

        stock.attach(euro);
        stock.attach(dollar);

        stock.setStockValue(100.0);
        stock.readValue();

    }
}