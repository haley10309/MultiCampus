package Class_Excercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KimSaBu {
    int age;
    String name;
    boolean married;
    int child;

    public KimSaBu(int age, String name, boolean married, int child) {
        this.age = age;
        this.name = name;
        this.married = married;
        this.child = child;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public int getChild() {
        return child;
    }

    public void setChild(int child) {
        this.child = child;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        KimSaBu kimsabu = new KimSaBu(0, null, false, 0);
        System.out.println("나이를 입력해주세요: ");

        kimsabu.setAge(Integer.parseInt(br.readLine()));
        System.out.println("이름을 입력해주세요: ");
        kimsabu.setName(br.readLine());
        System.out.println("결혼하셨나요? (y/n)");
        if (br.readLine().charAt(0) == 'y') {
            kimsabu.setMarried(true);
            sb.append("결혼한");
        } else {
            sb.append("결혼안 한");
        }
        System.out.println("자녀는 몇 명인가요?: ");
        kimsabu.setChild(Integer.parseInt(br.readLine()));
        sb.append(kimsabu.age + "살 " + kimsabu.name + "씨는  " + kimsabu.child + "아이들 이 있습니다.");
        System.out.println(sb);
        br.close();
    }

}
