package Class_Excercise.Third_week.colloection;

public class Student {
    private String studentId; // 학생 아이디
    private String studentName;// 학생 이름

    public Student(String studentId , String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }
    public String getStudentId() {
        return this.studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String toString(){ //system.out.println 할 때, 호출
        return studentName+"님의 학생 번호는 "+studentId+"입니다. \n";

    }
    public int hashCode(){
        return Integer.parseInt(studentId);
    }
    public boolean equals(Object obj){ //hashset에서 중복을 허용하지 않기 때문에 add를 하게 되면 중복 체크를 하게 됨 그 과정 (equals, hashcode)
        if(obj instanceof Student){
            Student student = (Student) obj;
            if(this.studentId==student.studentId){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }


}
