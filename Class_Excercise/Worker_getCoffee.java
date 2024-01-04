package Class_Excercise;

import java.io.IOException;

public class Worker_getCoffee {
    public static void main(String[] args)throws IOException{
        Worker Vicky  = new Worker("Vicky", 10000);
        Worker Specncer = new Worker("Spencer", 4500);
        CoffeeShop Starbucks = new CoffeeShop("Starbucks");
        CoffeeShop CoffeeBean = new CoffeeShop("CoffeeBean");

        Vicky.GetAmericano(Starbucks);
        Specncer.GetCafeLate(CoffeeBean);
        Vicky.GetCafeLate(CoffeeBean);

        Vicky.showInfo();
        Specncer.showInfo();
        Starbucks.showinfo();
        CoffeeBean.showinfo();
    }
}
