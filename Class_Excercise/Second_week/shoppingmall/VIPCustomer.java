package Class_Excercise.Second_week.shoppingmall;

public class VIPCustomer extends Customer {
    double saleRatio;

    public VIPCustomer() {
        super();
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return (price - (int) (price * saleRatio));
    }

}
