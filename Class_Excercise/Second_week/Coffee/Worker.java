package Second_week.Coffee;

public class Worker {
    String workerName;
    int money;
    
    public Worker(String workerName , int money){ //직장인 생성자
        this.workerName = workerName;
        this.money = money;
    }
    public void GetAmericano(CoffeeShop coffeeshop){ //아메리카노 4000원 구입
        this.money -= 4000;
        coffeeshop.coffeeOrder("americano",4000);
    }
    public void GetCafeLate(CoffeeShop coffeeshop){   //카페라떼 4500원 구입
        this.money -= 4500;  
        coffeeshop.coffeeOrder("CafeLate",4500);
    }
    public void showInfo(){  //직장인의 남은 돈 계산
        System.out.println(workerName + "님의 남은 돈은 "+money+"입니다.");
    }
}
