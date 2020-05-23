package glm.design_patterns.head_first.ch8_template_app;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
    String message;

    public void init() {
        message = "Hello world, I'm an applet ~~init~~ ! ";
        repaint();
    }

    public void start() {
        message = "~~ starting ~~";
        repaint();
    }

    public void stop() {
        message = "~~ stopping ~~";
        repaint();
    }

    public void destroy() {
        //
    }

    public void paint(Graphics graphics) {
        graphics.drawString(message, 10, 20);
    }
}