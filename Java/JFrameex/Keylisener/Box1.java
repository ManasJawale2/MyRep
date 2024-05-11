package JFrameex.Keylisener;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Box1 extends Rectangle {
    private Color color;

    Box1(int x, int y, int width, int height, Color color) {
        this.y = y;
        this.x = x;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Box1(Color color) {
        this.color = color;
    }

    public void Keypreseed(KeyEvent e) {
        int speed = 2;
        if (e.getKeyChar() == 'w' || e.getKeyCode() == KeyEvent.VK_UP) {
            this.y-=speed;
        }
        if (e.getKeyChar() == 's' || e.getKeyCode() == KeyEvent.VK_DOWN) {
            this.y+=speed;
        }
        if (e.getKeyChar() == 'a' || e.getKeyCode() == KeyEvent.VK_LEFT) {
            this.x-=speed;
        }
        if (e.getKeyChar() == 'd' || e.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.x+=speed;
        }
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(this.x, this.y, this.width, this.height);
    }

}
