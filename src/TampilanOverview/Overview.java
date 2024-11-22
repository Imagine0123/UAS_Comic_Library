package TampilanOverview;

import TampilanMenu.MenuBar;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Overview extends JFrame {
    public Overview() {
        setTitle("Overview");
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

        ImageIcon Background = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/Login.png")));
        JLabel gambar = new JLabel(Background);
        gambar.setBounds(0, 0, 1440, 1024);
        latar.add(gambar, Integer.valueOf(0));
        this.add(latar);

        MenuBar menuBar = new MenuBar();
        menuBar.setOpaque(false);
        menuBar.setForeground(Color.BLACK);
        menuBar.setFont(new Font("Poppins", Font.BOLD, 14));
        this.setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        Overview overview = new Overview();
        overview.setVisible(true);;
    }
}
