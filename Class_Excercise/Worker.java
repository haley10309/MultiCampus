package Class_Excercise;

public class Worker {
    String workerName;
    int money;
    
    public Worker(String workerName , int money){
        this.workerName = workerName;
        this.money = money;
    }
    public void GetAmericano(CoffeeShop coffeeshop){
        this.money -= 4000;
        coffeeshop.coffeeOrder("americano",4000);
    }
    public void GetCafeLate(CoffeeShop coffeeshop){
        this.money -= 4500;
        coffeeshop.coffeeOrder("CafeLate",4500);
    }
    public void showInfo(){
        System.out.println(workerName + "님의 남은 돈은 "+money+"입니다.");
    }
}
