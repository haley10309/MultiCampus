package Class_Excercise.Second_week.shoppingmall;

public class Customer {
    StringBuilder sb = new StringBuilder();

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int getCustomerID() {
        return this.customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public void showInfo() {
        sb.append(customerGrade + "등급" + customerName + "님의 포인트는 " + bonusPoint + "입니다.");
        System.out.println(sb);
    }

}
