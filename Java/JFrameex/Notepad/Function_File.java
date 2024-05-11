package JFrameex.Notepad;

import java.awt.*;
import java.io.*;

public class Function_File {
    Notepad GUI;
    String filename;
    String fileaddreas;

    Function_File(Notepad GUI) {
        this.GUI = GUI;
    }

    public void newFile() {
        GUI.textArea.setText("");
        GUI.window.setTitle("New");
    }

    public void openFile() {
        FileDialog fd = new FileDialog(GUI.window, "Open", FileDialog.LOAD);
        fd.setVisible(true);

        if (fd.getFile() != null) {
            filename = fd.getFile();
            fileaddreas = fd.getDirectory();
            GUI.window.setTitle(filename);
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileaddreas + filename));
            GUI.textArea.setText("This Feature is Under Development😔");
            GUI.window.setTitle(filename);
            String line = null;
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void SaveFile() {
        if (fileaddreas == null) {
            SaveFileAs();
        } else {
            try {
                FileWriter fw = new FileWriter(fileaddreas + filename);
                fw.write(GUI.textArea.getText());
                GUI.window.setTitle(filename);
                fw.close();
            } catch (IOException ie) {
                System.out.println("SOMETHING WENT WRONG!");
            }
        }
    }
    public void SaveFileAs() {
        FileDialog fd = new FileDialog(GUI.window, "Save", FileDialog.SAVE);
        fd.setVisible(true);
        if (fd.getFile() != null) {
            filename = fd.getFile();
            fileaddreas = fd.getDirectory();
            GUI.window.setTitle(filename);
        }
        try {
            FileWriter fw = new FileWriter(fileaddreas + filename);
            fw.write(GUI.textArea.getText());
            fw.close();
        } catch (Exception e) {
            System.out.println("SOMETHING WENT WRONG!");
        }
    }
    public void Exit() {
        System.exit(0);
    }
}
