
import java.awt.Color;
import java.awt.Graphics;
public class Player {
    public int x;
    public int y;
    public int width;
    public int height;
    public Box(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public void draw (Graphics brush) {
        brush.Color(Color.RED);
        brush.drawRect(x, y, width, height);
    }
}
