package Class_Excercise.First_week;

import java.io.IOException;

public class studentTest {
    public static void main(String[] args)throws IOException{
        Student Yeon = new Student();
        Yeon.setStudentName("연주미");

        System.out.println(Student.getSerialNum());
        System.out.println(Yeon.studentName+"학번: "+Yeon.studentID+", 학생카드 번호: "+Yeon.student_card);

        Student Lee = new Student();
        Lee.setStudentName("이지안");
        System.out.println(Student.getSerialNum());

        System.out.println(Lee.studentName+"학번: "+Lee.studentID+", 학생카드 번호: "+Lee.student_card);

    }
}
