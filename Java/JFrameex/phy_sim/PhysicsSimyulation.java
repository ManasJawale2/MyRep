package JFrameex.phy_sim;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhysicsSimyulation extends JFrame {

    static class PhysicsObject {
        public final int Gravity = 9;

        public int Xpos, Ypos;
        public float XVelocity, YVelocity = Gravity;
        public float XAcceleration, YAcceleration;
        public int size;

        public PhysicsObject(int xpos, int ypos) {
            Xpos = xpos;
            Ypos = ypos;
        }

        public void setMeshtoCircle(Graphics g, int radius) {
            g.fillOval(Xpos, Ypos, radius, radius);
            size = radius*2;
        }

        public void checkground(Dimension DofFrame) {
            if ( Ypos + size > DofFrame.height) {
                YAcceleration = -.1f;
            }
            if (Xpos < 0 || Xpos + size > DofFrame.width) {
                XAcceleration = -.1f;
            }
        }

        public void Update(JFrame frame) {

            this.Xpos += XVelocity;
            this.XVelocity += XAcceleration;
            this.Ypos += YVelocity;
            this.YVelocity += YAcceleration;
            checkground(frame.getSize());
        }

    }

    public PhysicsObject circle = new PhysicsObject(0, 0);
    public JLabel Xposfield, Yposfield, Xaccelerationfield, Yaccelerationfield, Xvelocity, Yvelocity;
    Timer UpdateSimulation = new Timer(1, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            UpdateSimulation();
        }
    });

    public void UpdateSimulation() {

        circle.Update(this);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                circle.YAcceleration +=  circle.Gravity /10;
	            try {
		            Thread.sleep(1000);
	            } catch ( InterruptedException e ) {
		            throw new RuntimeException(e);
	            }
            }
        });
        t.start();
        repaint();
    }

    public PhysicsSimyulation() {
        setBounds(0, 0, 500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Physics simulator");


        UpdateSimulation.start();
    }

    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        super.paint(g);
        g.setColor(Color.black);
        circle.setMeshtoCircle(g, 53);
    }
    public static void main(String[] args) {
        PhysicsSimyulation jf = new PhysicsSimyulation();
    }
}
