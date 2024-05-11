package JFrameex.Notepad;
import javax.swing.*;

import JFrameex.JavaGamingHub.MainHub;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Notepad implements ActionListener {

    JFrame window;

    JTextArea textArea;

    JScrollPane scroller;

    JMenuBar menuBar;

    JMenu File, Edit, Format, Color;

    JMenuItem FNew, FOpen, FSave, FSaveAs, FExit;

    JMenuItem WordWarp, FontStyleCSMS, FontStyleArial, FontStyleTNR, FontStyleJoker, FontStyleCalibri, FontStyleBlackLadder_ITC, size8, size9, size11, size12, size16, size20, size24;

    boolean WordWarpEnable;

    JMenu FontStyle, FontSize, LeastUsedFontStyles;

    Function_File FileMethods;

    Function_Format FormatMethods;

    JMenuItem Wingdings, Wingdings2, Wingdings3, MT_Extra;
    JMenuItem Blue, Black, White;

    private JMenu GoBack;

    private JMenuItem clickme;

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        new Notepad();
    }

    public Notepad() {
        FormatMethods = new Function_Format(this);
        FileMethods = new Function_File(this);
        CreateWindow();
        addTextArea();
        addMenuBar();
        createFileMenu();
        createFormatMenu();
        createColorMenu();

        FormatMethods.selectedfont = "Calibri";
        FormatMethods.CreateFont(12);
        window.setVisible(true);
    }

    public void CreateWindow() {
        window = new JFrame("NotepadMm");
        window.setSize(800, 600);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void addTextArea() {
        textArea = new JTextArea();
        textArea.setBorder(null);
        scroller = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        window.add(scroller);
    }

    public void addMenuBar() {
        menuBar = new JMenuBar();
        window.setJMenuBar(menuBar);

        File = new JMenu("File");
        menuBar.add(File);

        Edit = new JMenu("Edit");
        menuBar.add(Edit);

        Format = new JMenu("Format");
        menuBar.add(Format);

        Color = new JMenu("Color");
        menuBar.add(Color);

    }

    public void createFileMenu() {
        FNew = new JMenuItem("new");
        FOpen = new JMenuItem("open");
        FSave = new JMenuItem("Save");
        FSaveAs = new JMenuItem("SaveAs");
        FExit = new JMenuItem("Exit");
        JMenuItem[] FileItem = {
                FNew,
                FOpen,
                FSave,
                FSaveAs,
                FExit
        };
        for (JMenuItem jMenuItem : FileItem) {
            jMenuItem.addActionListener(this);
            jMenuItem.setActionCommand(jMenuItem.getText());
            File.add(jMenuItem);
        }

		GoBack = new JMenu("Go Back");
		menuBar.add(GoBack);

		clickme = new JMenuItem("Ok so click me");
		clickme.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				window.setVisible(false);
				MainHub.dot();
			}
		});
		GoBack.add(clickme);
    }

    public void createFormatMenu() {
        WordWarp = new JMenuItem("Word Warp: Off");
        WordWarp.addActionListener(this);
        WordWarp.setActionCommand("Warp");
        Format.add(WordWarp);

        FontStyle = new JMenu("FontStyle");
        Format.add(FontStyle);
        LeastUsedFontStyles = new JMenu("Least Used Font Styles");

        FontStyleCSMS = new JMenuItem("Comic Sans MS");
        FontStyleArial = new JMenuItem("Arial");
        FontStyleTNR = new JMenuItem("Times Now Roman");
        FontStyleJoker = new JMenuItem("Jokerman");
        FontStyleCalibri = new JMenuItem("Calibri");
        FontStyleBlackLadder_ITC = new JMenuItem("BlackLadder ITC");
        Wingdings = new JMenuItem("Wingdings");
        Wingdings2 = new JMenuItem("Wingdings2");
        Wingdings3 = new JMenuItem("Wingdings3");
        MT_Extra = new JMenuItem("MT Extra");

        JMenuItem[] FontStyleItems = {
                FontStyleCSMS,
                FontStyleTNR,
                FontStyleArial,
                FontStyleTNR,
                FontStyleCalibri,
        };

        JMenuItem[] LeastUsedFonts = {
                Wingdings,
                Wingdings2,
                Wingdings3,
                MT_Extra
        };

        for (JMenuItem FontStyleItem : FontStyleItems) {
            FontStyleItem.setActionCommand(FontStyleItem.getText());
            FontStyleItem.addActionListener(this);
            FontStyle.add(FontStyleItem);
        }

        for (JMenuItem LeastUsedFont : LeastUsedFonts) {
            LeastUsedFont.setActionCommand(LeastUsedFont.getText());
            LeastUsedFont.addActionListener(this);
            FontStyle.add(LeastUsedFont);
        }

        FontSize = new JMenu("Font Size");
        Format.add(FontSize);

        size8 = new JMenuItem("8");
        size9 = new JMenuItem("9");
        size11 = new JMenuItem("11");
        size12 = new JMenuItem("12");
        size16 = new JMenuItem("16");
        size20 = new JMenuItem("20");
        size24 = new JMenuItem("24");
        JMenuItem[] FontSizeItem = {
                size8,
                size9,
                size11,
                size12,
                size16,
                size20,
                size24
        };
        for (JMenuItem jMenuItem : FontSizeItem) {
            FontSize.add(jMenuItem);
            jMenuItem.addActionListener(this);
            jMenuItem.setActionCommand(jMenuItem.getText());
        }
    }

    public void createColorMenu() {
        Blue = new JMenuItem("Blue");
        Black = new JMenuItem("Black");
        White = new JMenuItem("White");
        for(JMenuItem i : new JMenuItem[]{
                Blue,
                Black,
                White
        }) {
            Color.add(i);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "new" -> FileMethods.newFile();
            case "open" -> FileMethods.openFile();
            case "Save" -> FileMethods.SaveFile();
            case "SaveAs" -> FileMethods.SaveFileAs();
            case "Exit" -> FileMethods.Exit();
            case "Warp" -> FormatMethods.WordWarp();
            case "Arial" -> FormatMethods.SetFont(command);
            case "Comic Sans MS" -> FormatMethods.SetFont(command);
            case "Times Now Roman" -> FormatMethods.SetFont(command);
            case "Jokerman" -> FormatMethods.SetFont(command);
            case "Calibri" -> FormatMethods.SetFont(command);
            case "Wingdings" -> FormatMethods.SetFont(command);
            case "Wingdings2" -> FormatMethods.SetFont("Wingdings2");
            case "Wingdings3" -> FormatMethods.SetFont("Wingdings3");
            case "MT Extra" -> FormatMethods.SetFont("MT Extra");
            case "8" -> FormatMethods.CreateFont(8);
            case "9" -> FormatMethods.CreateFont(9);
            case "11" -> FormatMethods.CreateFont(11);
            case "12" -> FormatMethods.CreateFont(12);
            case "16" -> FormatMethods.CreateFont(16);
            case "20" -> FormatMethods.CreateFont(20);
            case "24" -> FormatMethods.CreateFont(24);
        }
    }
}
