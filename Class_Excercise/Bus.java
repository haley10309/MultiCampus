package Class_Excercise;

public class Bus {
    int busNumber;
    int passengerCourt;
    int money;

    public Bus(int busNumber){
        this.busNumber = busNumber;
    }
    public void take(int money){
        this.money += money;
        passengerCourt++;
    }
    public void showInfo(){
        System.out.println("버스 "+busNumber+"번의 승객은 "+passengerCourt+"명이고, 수입은 "+money+"입니다.");
    }
}
