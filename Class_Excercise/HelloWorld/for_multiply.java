package HelloWorld;

import java.io.IOException;

public class for_multiply {
    public static void main(String[] args)throws IOException{
        //#1
        for(int i = 2 ;i <=9 ;i++){
            for(int j = 1 ; j <= 9;j++){
                System.out.println(i +"*"+ j + "="+ (i*j));
            }
        }
        //#2
        for(int i =2 ;i<= 9 ;i++){
            if((i%2)==0){
                for(int j = 1;j<=9;j++){
                    System.out.println(i +"*"+ j + "="+ (i*j));
                }
            }
        }
        //#3
        for(int i =2 ; i <=9 ;i++){
            int j =1;
            while(i>=j){
                System.out.println(i +"*"+ j + "="+ (i*j));
                j++;
            }
        }
    }
}
