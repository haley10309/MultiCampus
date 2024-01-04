package Class_Excercise.Second_week.Driving;

import java.io.IOException;

public class CarTest {
    public static void main(String[] args)throws IOException{
        Bus bus = new Bus();
        AutoCar autoCar = new AutoCar();

        bus.run();
        autoCar.run();

        bus.refuel();
        autoCar.refuel();

        bus.takePassenger();
        autoCar.load();

        bus.stop();
        autoCar.stop();
    }
}
