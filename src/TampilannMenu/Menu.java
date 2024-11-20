package TampilannMenu;

import javax.swing.*;

public class Menu extends JFrame {
    public Menu() {
        //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setTitle("NGOMIKMAS!");
        setSize(1440, 1024);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        background();
    }

    private void background() {
        JLayeredPane latar = new JLayeredPane();
        //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        latar.setBounds(0, 0, 1440, 1024);

        ImageIcon Background = new ImageIcon(getClass().getResource("/images/Login.png"));
        JLabel gambar = new JLabel(Background);
        gambar.setBounds(0, 0, 1440, 1024);
        latar.add(gambar, Integer.valueOf(0));
        this.add(latar);
    }

    public static void main(String[] args) {
        new Menu().setVisible(true);
    }
}
