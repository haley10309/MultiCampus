package Class_Excercise.Third_week.Lamda;

import java.io.IOException;
import java.util.ArrayList;


public class LibraryTest {
    public static void main(String[] args)throws IOException{
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("자바", 25000));
        bookList.add(new Book("파이썬", 15000));
        bookList.add(new Book("안드로이드", 30000));
        
        System.out.println("======2만원 이상의 서적=======");
        bookList.stream().filter(c -> c.getPrice() >= 20000).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
    }
}
