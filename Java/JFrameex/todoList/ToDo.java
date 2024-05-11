package JFrameex.todoList;

import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import JFrameex.JavaGamingHub.GUI;

public class ToDo extends JFrame{
    public JCheckBox[] listlabel;
    public JTextField[] list;

    ToDo() {
        setBounds(0, 0, 500, 500);
        setBackground(new Color(200, 200, 200));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ToDo();
    }
}
