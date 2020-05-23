package glm.design_patterns.head_first.ch11_proxy_icon;
import java.awt.*;
public interface Icon {
    int getIconWidth();
    int getIconHeight();
    void paintIcon(final Component c,Graphics g,int x,int y);
}