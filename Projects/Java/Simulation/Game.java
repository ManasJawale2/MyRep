package Projects.Java.SurviveCube;

import java.awt.Color;

import javax.swing.JFrame;
import Projects.Java.Simulation.Components.*;
public class Game extends JFrame{
    public Player p = new Player();
    public Game() {
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBackground(Color.GREEN);
        this.setSize(getPreferredSize());
    }
    public void paint(java.awt.Graphics g) {

    }
}
