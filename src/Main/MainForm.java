package Main;

import com.formdev.flatlaf.FlatIntelliJLaf;

import javax.swing.*;
import java.awt.*;

public class MainForm {

    private JPanel mainview;
    private JButton boswachtersButton;
    private JButton locatiesButton;
    private JButton boomkappersButton;


    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        JFrame frame = new JFrame("TreeSaver");
        frame.setContentPane(new MainForm().mainview);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
