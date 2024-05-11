package JFrameex.SnakeGame.ObjectsFiles;

import java.awt.*;

public class Snake {
	public int length;
	public boolean isdead;

	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		for(int i=1;i<=length+1;i++) {
			g.drawRect(100, 100, 50, 50);
		}
	}
}
