package Class_Excercise.Second_week.Game_playing;

import java.io.IOException;

public class MainBoard {
    public static void main(String[] args)throws IOException{
        Player player = new Player();
        player.play(1);

        AdvancedLevel aLavel = new AdvancedLevel();
        player.upgradeLevel(aLavel);
        player.play(2);

        SuperLevel sLevel = new SuperLevel();
        player.upgradeLevel(sLevel);
        player.play(3);
    }
}
