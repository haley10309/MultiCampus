package Class_Excercise.Third_week.Lamda;

import java.io.IOException;

public class CalcTest {
    public static void main(String[] args) throws IOException {
        int num1 = 3;
        int num2 = 4;
        Calc calcul = (s, v) -> System.out.println(s+v+" ");
        calcul.add(num1, num2);
        Calc calcul2 = new Calc() {

            @Override
            public void add(int num1, int num2) {
                System.out.println(num1 + num2);
            }
            
        };
        calcul2.add(num1, num2);
    }
}
