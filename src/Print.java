public abstract class Print implements Observer {
    protected Stock _stock;

    public Print(Stock stock) {
         this._stock = stock;
         stock.attach(this);
    }

    public abstract void printValue();

    @Override
    public void update() {
        printValue();
    }
}
