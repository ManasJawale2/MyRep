package JFrameex.Keylisener;

import javax.swing.*;

import JFrameex.JavaGamingHub.MainHub;

import java.awt.*;
import java.awt.event.*;

public class Demo extends JFrame implements ActionListener{


    JPanel panel;
    Image image;
    Box1 player;
    Graphics graphic;
    Box1 Enemy;
    Boolean gameover = false;
    Timer timer;
    private JMenuItem clickme;
    private JMenuBar menuBar;
    private JMenu GoBack;

    Demo() {
        panel = new JPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(null);
        player = new Box1(100, 100, 100, 100, Color.cyan);
        Enemy = new Box1(25, 0, 25, 100, Color.BLUE);
        addKeyListener(new AL());
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		GoBack = new JMenu("Go Back");
		menuBar.add(GoBack);

		clickme = new JMenuItem("Ok so click me");
		clickme.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				MainHub.dot();
			}
		});
		GoBack.add(clickme);
        timer = new Timer(100, this);
        timer.start();
        setVisible(true);
    }


    public void paint(Graphics g) {
        image = createImage(getWidth(), getHeight());
        graphic = image.getGraphics();
        g.drawImage(image, 0, 0, this);
        player.draw(g);
        Enemy.draw(g);
        if(gameover) {
            g.setColor(Color.RED);
            g.setFont(new Font("MV Boli", Font.BOLD, 45));
            g.drawString("Game Over!! :(", 0, 100);
        }
        else {
            g.setColor(Color.RED);
            g.setFont(new Font("Calibri", Font.PLAIN, 16));
            g.drawString("Press w,a,s,d and arrows to start", 50, 450);
        }
    }
    public static void main(String[] args) {
        Demo d = new Demo();
    }

    public void checkCollision() {
        if(player.intersects(Enemy)) {
            gameover = true;
            System.out.println("Game Over!! :(");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(Enemy.getY() >= 250) {
                Enemy.y -= 2;
            }
            else if(Enemy.getY() <=-250) {
                Enemy.y = 100;
            }

            repaint();
    }

    public class AL extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            if(!gameover) {
                player.Keypreseed(e);
            }
            else {
                player.setLocation(250, 250);
            }
            checkCollision();
            repaint();
        }
    }
}
