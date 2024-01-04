package Class_Excercise;

import java.util.ArrayList;

public class CoffeeShop {
    String shopName;
    ArrayList<String> drink = new ArrayList<>();
    int money;

    StringBuilder sb = new StringBuilder();

    public CoffeeShop(String shopName) {
        this.shopName = shopName;

    }

    public void coffeeOrder(String drink, int price) {
        this.drink.add(drink);
        this.money += price;
    }

    public void showinfo() {

        sb.append(shopName + "의 판매 물품은");
        for (int i = 0; i < drink.size(); i++) {
            sb.append(drink.get(i)).append(" ");
        }
        sb.append("이고, 판매 액은 " + this.money + "원 입니다.").append("\n");
        System.out.println(sb);
    }
}
