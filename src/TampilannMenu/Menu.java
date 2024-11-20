package TampilannMenu;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {
    public Menu(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setTitle("NGOMIKMAS!");
        setSize(screenSize);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        background();
    }

    private void background(){
        JLayeredPane latar = new JLayeredPane();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        latar.setBounds(0, 0, (int) screenSize.getWidth(), (int) screenSize.getHeight());

        ImageIcon Background = new ImageIcon(getClass().getResource("/images/Login.png"));
        JLabel gambar = new JLabel(Background);
        gambar.setBounds(0, 0, (int) screenSize.getWidth(), (int) screenSize.getHeight());
        latar.add(gambar, Integer.valueOf(0));
        this.add(latar);
    }
    public static void main(String[] args) {
        new Menu().setVisible(true);
    }
}
