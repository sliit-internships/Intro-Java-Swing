package sliit.intern;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalAccessException, UnsupportedLookAndFeelException {
        //insert the theme before creating the form
        JFrame.setDefaultLookAndFeelDecorated(true);
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
//        MainFrame frame = new MainFrame();
//        frame.setVisible(true);
        
        
        RegForm frame = new RegForm();
        frame.setVisible(true);
    }
}
