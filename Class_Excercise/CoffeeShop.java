package Class_Excercise;

import java.util.ArrayList;

public class CoffeeShop {
    String shopName;
    ArrayList<String> drink = new ArrayList<>();
    int money;

    StringBuilder sb = new StringBuilder();

    public CoffeeShop(String shopName) {  //커피숍 생성자
        this.shopName = shopName;

    }

    public void coffeeOrder(String drink, int price) {// 어떤 음료를 얼마에 샀는지 음료 주문 
        this.drink.add(drink);  
        this.money += price;
    }

    public void showinfo() {  //커피숍에서 어떤 음료를 구매하였고, 매출은 총합 얼마가 나왔는지 

        sb.append(shopName + "의 판매 물품은");
        for (int i = 0; i < drink.size(); i++) {
            sb.append(drink.get(i)).append(" ");
        }
        sb.append("이고, 판매 액은 " + this.money + "원 입니다.");
        System.out.println(sb);
    }
}
