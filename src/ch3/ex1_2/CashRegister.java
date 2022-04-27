package ch3.ex1_2;

public class CashRegister {

    int itemCounter=0;
    double sumPurchase=0;
    int tax=0;

    public CashRegister(int tax) {
        this.tax = tax;
    }

    public int getItemCounter() {
        return itemCounter;
    }

    public void recordTaxablePurchase(int price){
        sumPurchase+=this.giveChange(price);
        itemCounter++;
    }

    public void recordPurchase(int price)
    {
        sumPurchase+=price;
        itemCounter++;
    }

    public double giveChange(int price)
    {
        return price*(100.0-tax)/100.0;
    }
}
