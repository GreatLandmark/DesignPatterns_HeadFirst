package glm.design_patterns.head_first.ch11_proxy_icon;

import java.net.URL;

import javax.swing.*;
import java.awt.*;
public class ImageProxy implements Icon {
    ImageIcon imageIcon;
    URL imageUrl;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL url) {
        imageUrl = url;
    }

    @Override
    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
            return 800;
        }
    }

    @Override
    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
            return 600;
        }
    }

    @Override
    public void paintIcon(final Component c,Graphics g,int x,int y) {
        if(imageIcon!=null){
            imageIcon.paintIcon(c, g, x, y);
        }else{
            g.drawString("Loading image icon ...", x+300, y+200);
            if(!retrieving){
                retrieving=true;
                retrievalThread=new Thread(new Runnable(){
                
                    @Override
                    public void run() {
                        try {
                            imageIcon=new ImageIcon(imageUrl,"CD cover");
                            c.repaint();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                retrievalThread.start();
            }
        }
    }
}