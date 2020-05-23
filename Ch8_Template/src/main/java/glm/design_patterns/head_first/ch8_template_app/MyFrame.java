package glm.design_patterns.head_first.ch8_template_app;

import javax.swing.*;
import java.awt.Graphics;

public class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        // this.setVisible(true);
    }

    public void paint(Graphics graphics) {//重写paint()方法
        super.paint(graphics);
        String msg = "I love China !";
        graphics.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        var myFrame=new MyFrame("Draw String");
        myFrame.setVisible(true);
    }
}