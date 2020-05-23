package glm.design_patterns.head_first.ch3_decorator_myio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("Jack\\test\\inputTest.txt")));
            while((c=in.read())>=0){
                System.out.print((char)c);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}