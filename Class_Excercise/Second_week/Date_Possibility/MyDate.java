package Class_Excercise.Second_week.Date_Possibility;

import java.util.Arrays;
import java.util.List;

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

    public MyDate(int day, int month, int year) { //생성자
        setYear(year);
        setMonth(month);
        setDay(day);

    }

    public boolean isValid(MyDate day1) {
        boolean result = false;
        List<Integer> thirty_days = Arrays.asList(4, 6, 9, 11);
        List<Integer> thirtyOne_days = Arrays.asList(1, 3, 5, 7, 8, 10, 12);

        if (thirty_days.contains(day1.month)) {
            if (day1.day <= 30) {
                result = true;
            }
        } else if (thirtyOne_days.contains(day1.month)) {
            if (day1.day <= 31) {
                result = true;
            }
        } else if(day1.month==2) { //2월 일때
            if (day1.day <= 28) {
                result = true;
            }
        }else{
            result = false;
        }
       
        return result;
    }

}
