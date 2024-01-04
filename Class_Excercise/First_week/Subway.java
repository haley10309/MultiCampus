package Class_Excercise.First_week;

public class Subway {
    public String lineNumber;
    public int passengerCourt;
    public int money;

    public Subway(String lineNumber){
        this.lineNumber = lineNumber;
    }
    public void take(int money){
        this.money += money;
        passengerCourt++;
    }
    public void showInfo(){
        System.out.println("지하철 "+lineNumber+"의 승객은 "+passengerCourt+"명이고, 수입은 "+money+"입니다.");
    }
}
