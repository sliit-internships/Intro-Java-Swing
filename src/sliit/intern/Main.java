package sliit.intern;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class Main {
    public static void main(String[] args) throws Exception {
        JFrame.setDefaultLookAndFeelDecorated(true);
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        // UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        
        //MainFrame frame = new MainFrame();
        //frame.setVisible(true);
        
        //LoginForm form = new LoginForm();
        //form.setVisible(true);
        
        RegForm form = new RegForm();
        form.setVisible(true);
    }
}
