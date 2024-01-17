package First_week;

import java.io.IOException;

public class TakeTransfer {
    public static void main(String[] args)throws IOException{
        Student studentChris = new Student("Chris", 5000);
        Student studentEmily = new Student("Emily", 10000);
        Student studentJenna = new Student("Jenna", 20000);

        Bus bus100 = new Bus(100);
        studentChris.takeBus(bus100);
        studentChris.showInfo();
        bus100.showInfo();

        Subway subwayGreen = new Subway("2호선");
        studentEmily.takeSubway(subwayGreen);
        studentEmily.showInfo();
        subwayGreen.showInfo();

        Taxi taxi30_3456 = new Taxi("30마 3456");
        studentJenna.takeTaxi(taxi30_3456);
        studentJenna.showInfo();
        taxi30_3456.showInfo();
    }
}
