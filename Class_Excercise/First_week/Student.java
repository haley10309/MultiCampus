package Class_Excercise.First_week;

public class Student {
    private static int serialNum = 1000; // 일련번호
    int studentID; // 학번
    int student_card; // 학생카드 번호
    public String studentName;
    public int grade;
    public int money;

    public Student() {
        // 학생이 생성될 때마다 증가
        serialNum++;
        // 증가된 값을 학번 인스턴스에 부여
        studentID = serialNum;
        student_card = studentID + 100;
    }

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    /*--------------생성자---------------- */
    public static void setSerialNum(int serialNumber) {
        Student.serialNum = serialNumber;
    }

    public static int getSerialNum() {
        return Student.serialNum;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    /*-------학생 입장에서 교통수단을 타는 함수---------- */

    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.take(1500);
        this.money -= 1500;
    }

    public void takeTaxi(Taxi taxi) {
        taxi.take(10000);
        this.money -= 10000;
    }

    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
    }
}
