package Class_Excercise.First_week;

public class Taxi {
    public String licensePlate;
    public int passengerCourt;
    public int money;

    public Taxi(String licensePlate){
        this.licensePlate = licensePlate;
    }
    public void take(int money){
        this.money += money;
        passengerCourt++;
    }
    public void showInfo(){
        System.out.println("택시 "+licensePlate+"번의 승객은 "+passengerCourt+"명이고, 수입은 "+money+"입니다.");
    }
}
