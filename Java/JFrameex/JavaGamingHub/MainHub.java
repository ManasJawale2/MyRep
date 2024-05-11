package JFrameex.JavaGamingHub;

import javax.swing.*;

public class MainHub {
    public static void dot() {
        try {
            UIManager.setLookAndFeel(new com.formdev.flatlaf.themes.FlatMacDarkLaf());
        } catch (Exception e) {
            System.out.println("Something went wrong please let developer check it");
        }
        GUI gui = new GUI();
        gui.setTitle("Java Swing Hub");
        gui.setLayout(null);
        gui.setBounds(0, 0, 500, 500);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        gui.animationThread.start();
    }
    public static void main(String[] args) {
        dot();
    }
}
