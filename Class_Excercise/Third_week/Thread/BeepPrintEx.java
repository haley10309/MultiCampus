package Third_week.Thread;

import java.io.IOException;
import java.awt.Toolkit;

public class BeepPrintEx {
    public static void main(String[] args)throws IOException{
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 0 ;i<5;i++){
            toolkit.beep();
            try{
                Thread.sleep(500);
            }catch(Exception e){

            }
        }
    }
}
