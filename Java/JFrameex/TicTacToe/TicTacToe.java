package JFrameex.TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class TicTacToe implements ActionListener {
    JMenuBar Gameoptions = new JMenuBar();
    JMenu score = new JMenu("Score");
    JMenuItem show_score = new JMenuItem("Show Score");
    Random r = new Random();
    JFrame frame = new JFrame();
    JPanel Title_Panel = new JPanel();
    JPanel Button_Panel = new JPanel();
    JLabel textfield = new JLabel();
    JLabel Dlabel, Xlabel, Olabel;
    JButton[] buttons = new JButton[9];
    JButton replay = new JButton("Replay");
    boolean player1_turn;
    JDialog replay_or_stop = new JDialog(frame, "Replay or Stop");
    boolean isOwin;
    boolean isXwin;
    boolean isdraw;
    boolean isshowscoretrues = false;
    int Opoints;
    int Xpoints;
    int Dpoints;
    public TicTacToe() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(new Color(200, 200, 200));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textfield.setBackground(new Color(25, 25, 25));
        textfield.setForeground(new Color(255, 50, 0));
        textfield.setFont(new Font("Ink free", Font.BOLD, 85));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic-Tac-Toe");
        textfield.setOpaque(true);

        Title_Panel.setLayout(new BorderLayout());
        Title_Panel.setSize(800, 100);
        Title_Panel.add(textfield);


        Button_Panel.setLayout(new GridLayout(3, 3));
        Button_Panel.setBackground(new Color(150, 150, 150));

        replay_or_stop.setLayout(null);
        replay_or_stop.setSize(450, 250);

        replay.setFont(new Font("Arial", Font.BOLD, 16));
        replay.setSize(100, 100);
        replay.setLocation(0, 0);
        replay.addActionListener(e -> newGame(Xpoints, Opoints, Dpoints));
        replay_or_stop.add(replay);

        Dlabel = new JLabel("Dpoints : " + Dpoints);
        Dlabel.setForeground(new Color(255, 50, 0));
        Dlabel.setFont(new Font("Ink free", Font.BOLD, 85));
        Dlabel.setHorizontalAlignment(JLabel.CENTER);
        Dlabel.setOpaque(true);
        replay_or_stop.add(Dlabel);
        Dlabel.setVisible(true);
        Dlabel.setLocation(100, 100);
        Xlabel = new JLabel("Xpoints : " + Xpoints);
        Xlabel.setForeground(new Color(255, 50, 0));
        Xlabel.setFont(new Font("Ink free", Font.BOLD, 85));
        Xlabel.setHorizontalAlignment(JLabel.CENTER);
        Xlabel.setOpaque(true);
        replay_or_stop.add(Xlabel);
        Xlabel.setVisible(true);
        Xlabel.setLocation(100, 115);
        Olabel = new JLabel("Opoints : " + Opoints);
        Olabel.setForeground(new Color(255, 50, 0));
        Olabel.setFont(new Font("Ink free", Font.BOLD, 85));
        Olabel.setHorizontalAlignment(JLabel.CENTER);
        Olabel.setOpaque(true);
        replay_or_stop.add(Olabel);
        Olabel.setVisible(true);
        Olabel.setLocation(100, 130);

        Gameoptions.add(score);
        score.add(show_score);
        Gameoptions.setVisible(true);
        score.setVisible(true);
        show_score.setVisible(true);
        show_score.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isshowscoretrues = true;
            }
        });
        frame.setJMenuBar(Gameoptions);




        for(int i=0;i<9;i++) {
            buttons[i] = new JButton();
            Button_Panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        frame.add(Title_Panel, BorderLayout.NORTH);
        frame.add(Button_Panel);

        firstTurn();
    }

    public void newGame(int Xpoints, int Opoints, int Dpoints) {
        frame.setVisible(false);
        TicTacToe newgame = new TicTacToe();
        newgame.Xpoints = Xpoints;
        newgame.Opoints = Opoints;
        newgame.Dpoints = Dpoints;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for(int i=0;i<9;i++) {
            if(e.getSource()==buttons[i]) {
                if(player1_turn) {
                    if(buttons[i].getText()=="") {
                        buttons[i].setForeground(new Color(255, 0, 0));
                        buttons[i].setText("X");
                        player1_turn=false;
                        textfield.setText("O turn");
                        check();
                    }
                }
                else {
                    if(buttons[i].getText()=="") {
                        buttons[i].setForeground(new Color(0, 255, 0));
                        buttons[i].setText("O");
                        player1_turn=true;
                        textfield.setText("X turn");
                        check();
                    }
                }
            }
        }
        if (isOwin || isXwin || isdraw) {
            replay_or_stop.setVisible(true);
        }
        if (isXwin) {
            Xpoints++;
            isOwin = false;
            isXwin = false;
            isdraw = false;
        }
        else if (isOwin) {
            Opoints++;
            isOwin = false;
            isXwin = false;
            isdraw = false;
        }
        else if (isdraw) {
            Dpoints++;
            isOwin = false;
            isXwin = false;
            isdraw = false;
        }
        if(isshowscoretrues) {
            show_score();
        }

    }

    public void show_score() {

    }

    public void firstTurn() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(r.nextInt(2)==0) {
            player1_turn=true;
            textfield.setText("X turn");
        }
        else {
            player1_turn=false;
            textfield.setText("O turn");
        }
    }

    public void check() {

        //Check isXwins
        if(buttons[0].getText()=="X" && buttons[1].getText()=="X" && buttons[2].getText()=="X") {
            xWin(0, 1, 2);
        }
        if(buttons[3].getText()=="X" && buttons[4].getText()=="X" && buttons[5].getText()=="X") {
            xWin(3, 4, 5);
        }
        if(buttons[6].getText()=="X" && buttons[7].getText()=="X" && buttons[8].getText()=="X") {
            xWin(6, 7,8 );
        }

        if(buttons[0].getText()=="X" && buttons[3].getText()=="X" && buttons[6].getText()=="X") {
            xWin(0, 3, 6);
        }
        if(buttons[1].getText()=="X" && buttons[4].getText()=="X" && buttons[7].getText()=="X") {
            xWin(1, 4, 7);
        }
        if(buttons[2].getText()=="X" && buttons[5].getText()=="X" && buttons[8].getText()=="X") {
            xWin(2, 5, 8);
        }
        if(buttons[2].getText()=="X" && buttons[4].getText()=="X" && buttons[6].getText()=="X") {
            xWin(2, 4, 6);
        }

        //Check OWins
        if(buttons[0].getText()=="O" && buttons[1].getText()=="O" && buttons[2].getText()=="O") {
            oWin(0, 1, 2);
        }
        if(buttons[3].getText()=="O" && buttons[4].getText()=="O" && buttons[5].getText()=="O") {
            oWin(3, 4, 5);
        }
        if(buttons[6].getText()=="O" && buttons[7].getText()=="O" && buttons[8].getText()=="O") {
            oWin(6, 7,8 );
        }

        if(buttons[0].getText()=="O" && buttons[3].getText()=="O" && buttons[6].getText()=="O") {
            oWin(0, 3, 6);
        }
        if(buttons[1].getText()=="O" && buttons[4].getText()=="O" && buttons[7].getText()=="O") {
            oWin(1, 4, 7);
        }
        if(buttons[2].getText()=="O" && buttons[5].getText()=="O" && buttons[8].getText()=="O") {
            oWin(2, 5, 8);
        }
        if(buttons[2].getText()=="O"
           && buttons[4].getText()=="O"
           && buttons[6].getText()=="O") {
            oWin(2, 4, 6);
        }


        if(        !isOwin
                && !isXwin
                && !buttons[0].getText().equals("")
                && !buttons[1].getText().equals("")
                && !buttons[2].getText().equals("")
                && !buttons[3].getText().equals("")
                && !buttons[4].getText().equals("")
                && !buttons[5].getText().equals("")
                && !buttons[6].getText().equals("")
                && !buttons[7].getText().equals("")
                && !buttons[8].getText().equals("")
        ) {
            dWin();
        }
    }
    public void xWin(int a, int b, int c) {

        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);
        for(int i=0;i<9;i++) {
            buttons[i].setEnabled(false);
        }
        Xpoints++;
        textfield.setText("X Wins");
        isXwin = true;
    }

    public void oWin(int a, int b, int c) {
        buttons[a].setBackground(Color.RED);
        buttons[b].setBackground(Color.RED);
        buttons[c].setBackground(Color.RED);
        for(int i=0;i<9;i++) {
            buttons[i].setEnabled(false);
        }
        Opoints++;
        textfield.setText("O Wins");

        isOwin = true;
    }

    public void dWin() {
        for(int i=0;i<9;i++) {
            buttons[i].setBackground(Color.BLUE);
            buttons[i].setEnabled(false);
        }
        Dpoints++;
        textfield.setText("It's a draw");

        isdraw = true;
    }


}
