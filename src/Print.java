public abstract class Print {
    protected Stock _stock;

    public  Print(Stock stock) {
         this._stock = stock;
    }

    public abstract void printValue();
}
