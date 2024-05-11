package JFrameex.Notepad;

import java.awt.*;

public class Function_Format {
    Notepad gui;
    Font ComicsCSMS, arial, timesnowRoman, jokerman, calibri, Blackadder_ITC;
    String selectedfont;
    Font Wingdings, Wingdings2, Wingdings3, MT_Extra;
    public Function_Format(Notepad gui) {
        this.gui = gui;
    }

    public void WordWarp() {
        if(!gui.WordWarpEnable) {
            gui.WordWarpEnable = true;
            gui.textArea.setLineWrap(true);
            gui.textArea.setWrapStyleWord(true);
            String EnabledName = gui.WordWarp.getText().replace("Off", "On");
            gui.WordWarp.setText(EnabledName);
        }
        else {
            gui.WordWarpEnable = false;
            gui.textArea.setLineWrap(false);
            gui.textArea.setWrapStyleWord(false);
            String EnabledName = gui.WordWarp.getText().replace("On", "Off");
            gui.WordWarp.setText(EnabledName);
        }
    }

    public void CreateFont(int size) {
        arial = new Font("Arial", Font.PLAIN, size);
        ComicsCSMS = new Font("Comic Sans MS", Font.PLAIN, size);
        timesnowRoman = new Font("Times Now Roman", Font.PLAIN, size);
        jokerman = new Font("Jokerman", Font.PLAIN, size);
        calibri = new Font("Calibri", Font.PLAIN, size);
        Wingdings = new Font("Wingdings", Font.PLAIN, size);
        Wingdings2 = new Font("Wingdings2", Font.PLAIN, size);
        Wingdings3 = new Font("Wingdings3", Font.PLAIN, size);
        Blackadder_ITC = new Font("Blackadder ITC", Font.PLAIN, 0);
        MT_Extra = new Font("MT Extra", Font.PLAIN, 0);

        SetFont(selectedfont);
    }

    public void SetFont(String font) {
        selectedfont = font;
        switch (selectedfont) {
            case "Arial" -> gui.textArea.setFont(arial);
            case "Comic Sans MS" -> gui.textArea.setFont(ComicsCSMS);
            case "Times Now Roman" -> gui.textArea.setFont(timesnowRoman);
            case "Jokerman" -> gui.textArea.setFont(jokerman);
            case "Calibri" -> gui.textArea.setFont(calibri);
            case "Blackadder ITC" -> gui.textArea.setFont(Blackadder_ITC);
            case "Wingdings" -> gui.textArea.setFont(Wingdings);
            case "Wingdings2" -> gui.textArea.setFont(Wingdings2);
            case "Wingdings3" -> gui.textArea.setFont(Wingdings3);
            case "MT Extra" -> gui.textArea.setFont(MT_Extra);
        }

    }



}
