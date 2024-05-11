package JFrameex.JavaGamingHub;

import JFrameex.Calculator.Calculator;
import JFrameex.Login.Login;
import JFrameex.Notepad.Notepad;
import JFrameex.Rock_Paper_Siccor.Game;
import JFrameex.TicTacToe.TicTacToe;
import JFrameex.phy_sim.PhysicsSimyulation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {

    static class CustomPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            // TODO Auto-generated method stub
            super.paint(g);

            g.setColor(getNegativeColor(this.getBackground()));
        }

    }

    public static Color getNegativeColor(Color c) {
        Color rgb = new Color(0, 0, 0);
        int red, green, blue;
        if(c.getRed() < (255/2)) {
            red = 255/2 - c.getRed();
        }
        else {
            red = c.getRed() - 255/2;
        }
        if(c.getGreen() < (255/2)) {
            green = 255/2 - c.getGreen();
        }
        else {
            green = c.getGreen() - 255/2;
        }
        if(c.getBlue() < (255/2)) {
            blue = 255/2 - c.getBlue();
        }
        else {
            blue = c.getBlue() - 255/2;
        }
        rgb = new Color(red, green, blue);
        return rgb;
    }

    public CustomPanel contentPanel = new CustomPanel();
    public JLabel Titlelabel = new JLabel("Java Swing Examples Hub");
    public JButton calcButton,keylistenorButton,notepadButton,PhysicsSimulationButton,Registor_LoginButton,rockpaperscissorButton,tictactoeButton;
    public JButton[] buttons;
    public Dimension dimension = new Dimension(100, 25);
    public Thread animationThread = new Thread(new Runnable() {
        public void run() {
            String str = Titlelabel.getText();
            Titlelabel.setText("");
            for (int i = 0; i < str.length(); i++) {
                Titlelabel.setText(Titlelabel.getText() + str.charAt(i));
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                };
            }
        };
    });

    public static Rectangle addLocationToRectangle(Rectangle a, Point b) {
        Rectangle c = a;
        c.x += b.x;
        c.y += b.y;
        return c;
    }

    public GUI() {

        this.setContentPane(contentPanel);

        Titlelabel.setBounds(0, 50, 500, 100);
        Titlelabel.setHorizontalAlignment(SwingConstants.CENTER);
        Titlelabel.setFont(new Font("Arial", Font.BOLD, 30));

        calcButton = new JButton("Calculator");
        calcButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                setVisible(false);
                new Calculator();
            }
            
        });
        keylistenorButton = new JButton("UnderConstruction.");
        keylistenorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                System.exit(ABORT);
            }
        });
        notepadButton = new JButton("Notepad");
        notepadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                setVisible(false);
                new Notepad();
            }
        });
        PhysicsSimulationButton = new JButton("Physics_Simulation");
        PhysicsSimulationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                setVisible(false);
                new PhysicsSimyulation();
            }
        });
        Registor_LoginButton = new JButton("Registor_Login");
        Registor_LoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                setVisible(false);
                new Login();
            }
        });
        rockpaperscissorButton = new JButton("Rock_Paper_Scissor");
        rockpaperscissorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                setVisible(false);
                new Game();
            }
        });
        tictactoeButton = new JButton("Tic-Tac-Toe");
        tictactoeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                setVisible(false);
                new TicTacToe();
            }
        });

        calcButton.setBounds(50, 200, 100, 40);
        notepadButton.setBounds(addLocationToRectangle(calcButton.getBounds(), new Point(125, 0)));
        PhysicsSimulationButton.setBounds(addLocationToRectangle(notepadButton.getBounds(), new Point(125, 0)));
        Registor_LoginButton.setBounds(addLocationToRectangle(calcButton.getBounds(), new Point(0, 100)));
        rockpaperscissorButton.setBounds(addLocationToRectangle(Registor_LoginButton.getBounds(), new Point(125, 0)));
        tictactoeButton.setBounds(addLocationToRectangle(rockpaperscissorButton.getBounds(), new Point(125, 0)));
        keylistenorButton.setBounds(addLocationToRectangle(tictactoeButton.getBounds(), new Point(0, 50)));

        buttons = new JButton[] {
                calcButton,
                keylistenorButton,
                notepadButton,
                PhysicsSimulationButton,
                Registor_LoginButton,
                rockpaperscissorButton,
                tictactoeButton
        };

        for (JButton jButton : buttons) {
            this.add(jButton);
            jButton.setBackground(Color.BLUE);
            jButton.setBorderPainted(true);
        }
        this.add(Titlelabel);
    }

    @Override
    public void paintComponents(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponents(g);
        g.setColor(Color.cyan);
        g.drawRect(EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
    }
}
