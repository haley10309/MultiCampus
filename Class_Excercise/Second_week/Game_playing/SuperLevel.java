package Class_Excercise.Second_week.Game_playing;

public class SuperLevel extends PlayerLevel{

    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("뜁니다.");
    }

    @Override
    public void turn() {
        System.out.println("빙글 빙글 돕니다.");}

    @Override
    public void showLevelMessage() {
        System.out.println("********고급자 레벨입니다********");
    }
    
}
