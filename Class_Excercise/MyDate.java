package Class_Excercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MyDate(int day, int month, int year) {
        setYear(year);
        setMonth(month);
        setDay(day);

    }

    public  boolean isValid(MyDate day1) {
        boolean result = false;
        if (day1.month <= 7) { // 1~7월
            if ((day1.month / 2) == 0) { // 2,4,6월
                if (day1.month == 2) { // 2월
                    if (day1.day <= 28) {
                        result = true;
                    }
                } else {// 4,6월
                    if (day1.day <= 30) {
                        result = true;
                    }
                }
            } else { // 1,3,5,7월
                if (day1.day <= 31) {
                    result = true;
                }
            }
        } else { // 8~12월
            if ((day1.month / 2) == 0) { // 8,10,12월
                if (day1.day <= 31) {
                    result = true;
                }
            } else { // 9,11월
                if (day1.day <= 30) {
                    result = true;
                }
            }
        }
        return result;
    }
    

}
