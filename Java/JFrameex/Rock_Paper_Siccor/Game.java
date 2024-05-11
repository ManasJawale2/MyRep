package Java.JFrameex.Rock_Paper_Siccor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Game extends JFrame {

    static enum RPC {
        Rock, Paper, Scissor;
    }

    static class Panel extends JPanel {
        Image bg;
        int x;
        int y;
        int height;
        int width;

        Panel(Image bgimage, int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.bg = bgimage;

            this.setBounds(x, y, width, height);
        }

        @Override
        protected void paintComponent(Graphics g) {
            // TODO Auto-generated method stub
            super.paintComponent(g);
            if (bg != null) {
                g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
            }
        }
    }

    Panel panel;

    JLabel TitleLabel;
    JLabel NPCLabel;
    JLabel PlayerLabel;
    JLabel NPC;
    JLabel Player;
    JLabel timerlabel;

    JButton RockButton;
    JButton PaperButton;
    JButton ScissorButton;

    RPC rcptoggler;
    RPC NPCRPC;
    RPC PlayerRCP;

    Font defualtFont = new Font("Open Sans", Font.BOLD, 24);

    Thread countdownThread = new Thread();

    public Game() {
        setTitle("Rpc");
        panel = new Panel(new ImageIcon("JFrameex\\Rock_Paper_Siccor\\Pic\\BG.png").getImage(), 0, 0, 500, 500);
        countdownThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 3; i >= 1; i--) {
                    timerlabel.setText(i + "");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        System.out.println("Error");
                    }
                }
                timerlabel.setText("Go!!");

                GenerateRandomPicToAI();
            }
        });

        TitleLabel = new JLabel("Rock | Paper | Scissor");
        TitleLabel.setBounds(100, 0, 500, 100);
        TitleLabel.setFont(defualtFont);

        NPCLabel = new JLabel("NPC");
        NPCLabel.setBounds(435, 250, 100, 20);
        NPCLabel.setFont(defualtFont);

        PlayerLabel = new JLabel("Player");
        PlayerLabel.setBounds(0, 250, 100, 20);
        PlayerLabel.setFont(defualtFont);

        Player = new JLabel(new ImageIcon("JFrameex\\Rock_Paper_Siccor\\Pic\\PlayerRock.png"));
        Player.setBounds(100, 200, 150, 100);

        NPC = new JLabel(new ImageIcon("JFrameex\\Rock_Paper_Siccor\\Pic\\NPCRock.png"));
        NPC.setBounds(300, 200, 150, 100);

        timerlabel = new JLabel("XXX");
        timerlabel.setBounds(200, 75, 100, 20);
        timerlabel.setFont(defualtFont);

        RockButton = new JButton(RPC.Rock.name());
        RockButton.setBounds(250, 300, 100, 25);
        RockButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                Rock();
            }

        });

        PaperButton = new JButton(RPC.Paper.name());
        PaperButton.setBounds(150, 300, 100, 25);
        PaperButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                Paper();
            }

        });

        ScissorButton = new JButton(RPC.Scissor.name());
        ScissorButton.setBounds(200, 325, 100, 25);
        ScissorButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                Scissor();
            }

        });

        this.add(TitleLabel);
        this.add(PlayerLabel);
        this.add(NPCLabel);
        this.add(timerlabel);
        this.add(Player);
        this.add(NPC);
        this.add(RockButton);
        this.add(PaperButton);
        this.add(ScissorButton);
        this.add(panel);
        this.setBounds(0, 0, 500, 500);
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Game g = new Game();
    }

    public void GenerateRandomPicToAI() {
        Random r = new Random();
        switch (r.nextInt(2)) {
            case 0:
                NPC.setIcon(new ImageIcon("JFrameex\\Rock_Paper_Siccor\\Pic\\NPCRock.png"));
                NPCRPC = RPC.Rock;
                break;
            case 1:
                NPC.setIcon(new ImageIcon("JFrameex\\Rock_Paper_Siccor\\Pic\\NPCPaper.png"));
                NPCRPC = RPC.Paper;
                break;
            case 2:
                NPC.setIcon(new ImageIcon("JFrameex\\Rock_Paper_Siccor\\Pic\\NPCscissors.png"));
                NPCRPC = RPC.Scissor;
            default:
                break;
        }

        if(NPCRPC == RPC.Rock) {
            if(PlayerRCP == RPC.Scissor) {
                NPCwins();
            }
            else if(PlayerRCP == RPC.Paper) {
                PLayerWins();
            }
            else if(PlayerRCP == RPC.Rock) {
                Draws();
            }
        }
        else if(NPCRPC == RPC.Paper) {
            if(PlayerRCP == RPC.Scissor) {
                PLayerWins();
            }
            else if(PlayerRCP == RPC.Rock) {
                NPCwins();
            }
            else if(PlayerRCP == RPC.Paper) {
                Draws();
            }
        }
        else if(NPCRPC == RPC.Scissor) {
            if(PlayerRCP == RPC.Scissor) {
                Draws();
            }
            else if(PlayerRCP == RPC.Rock) {
                PLayerWins();
            }
            else if(PlayerRCP == RPC.Paper) {
                NPCwins();
            }
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        this.setVisible(false);
        Game g = new Game();
        g.setBounds(0, 0, 500, 500);
        g.setBackground(Color.BLACK);
        g.setDefaultCloseOperation(EXIT_ON_CLOSE);
        g.setVisible(true);
    }
    public void Rock() {
        PlayerRCP = RPC.Rock;
        try {
            countdownThread.start();
            Player.setIcon(new ImageIcon("JFrameex\\Rock_Paper_Siccor\\Pic\\PlayerRock.png"));
        } catch (IllegalThreadStateException e) {
            // TODO Auto-generated catch block
            System.out.println("s");
        }
        return;
    }

    public void Paper() {
        PlayerRCP = RPC.Paper;
        try {
            countdownThread.start();
            Player.setIcon(new ImageIcon("JFrameex\\Rock_Paper_Siccor\\Pic\\PlayerPaper.png"));
        } catch (IllegalThreadStateException e) {
            // TODO Auto-generated catch block
            
        }
        return;
    }

    public void Scissor() {
        PlayerRCP = RPC.Scissor;
        try {
            countdownThread.start();
            Player.setIcon(new ImageIcon("JFrameex\\Rock_Paper_Siccor\\Pic\\PlayerScissor.png"));
        } catch (IllegalThreadStateException e) {
            // TODO Auto-generated catch block
            
        }
        return;
    }

    public void NPCwins() {
        timerlabel.setText("You lose😔. But goodluck nextime👍");
    }

    public void PLayerWins() {
        timerlabel.setText("You win🏆. I am proud of you.");
    }

    public void Draws() {
        timerlabel.setText("Its draw😴");
    }
    public void setRcptoggler(RPC rcptoggler) {
        this.rcptoggler = rcptoggler;
    }
}
