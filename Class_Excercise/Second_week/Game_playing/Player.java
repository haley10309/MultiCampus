package Class_Excercise.Second_week.Game_playing;

public class Player {
    private PlayerLevel level;

    public Player(){
        level = new BeginnerLevel();
        level.showLevelMessage(); //인스턴스 시작 시 일단 어느레벨인지 밝히고 시작하기 
        
    }
    public PlayerLevel getLevel(){
        return level;
    }
    public void upgradeLevel(PlayerLevel level){
        this.level = level;
        level.showLevelMessage();
    }
    public void play (int count){
        level.go(count);
    }
}
