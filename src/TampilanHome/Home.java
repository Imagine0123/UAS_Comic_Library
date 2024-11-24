package TampilanHome;

import TampilanMenu.MenuBar;
import TampilanOverview.OverviewGreatestEstateDeveloper;
import TampilanOverview.OverviewMountHua;
import TampilanOverview.OverviewSoloLeveling;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

import static TampilanMenu.MenuBar.addNumberBox;
import static TampilanMenu.MenuBar.getScaledIcon;

public class Home extends JFrame {
    public Home() {
        setTitle("NGOMIKMAS!");
        setSize(1440, 1024);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        background();
    }

    private void background() {
        JLayeredPane latar = new JLayeredPane();
        latar.setBounds(0, 0, 1440, 1024);

        ImageIcon Background = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/Background.png")));
        JLabel gambar = new JLabel(Background);
        gambar.setBounds(0, 0, 1440, 1024);
        latar.add(gambar, Integer.valueOf(0));
        this.add(latar);

        JSeparator horizontalSeparator2 = new JSeparator();
        horizontalSeparator2.setBounds(980, 130, 310, 2);
        horizontalSeparator2.setForeground(Color.decode("#6A6A6A"));
        latar.add(horizontalSeparator2, Integer.valueOf(2));

        addNumberBox(latar, 975, 235, 20, 20, 1);
        ImageIcon bintang1 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/Rate.png")));
        ImageIcon scaledbntg1 = getScaledIcon(bintang1, 30, 17);

        JLabel bntg1 = new JLabel(scaledbntg1);
        bntg1.setBounds(1040, 102, 250, 393);
        latar.add(bntg1, Integer.valueOf(1));

        JLabel judulTeks1 = new JLabel("<html><span style='font-family:Poppins; font-size:12px; font-weight:bold;'> Solo Leveling</span></html>");
        judulTeks1.setForeground(Color.WHITE);
        judulTeks1.setBounds(1150, 210, 1000, 100);
        latar.add(judulTeks1, Integer.valueOf(1));

        JLabel jenis1 = new JLabel("<html><span style='font-family:Poppins; font-size:6px; font-weight:normal;'> Action, Adventure, Fantasy, Shounen</span></html>");
        jenis1.setForeground(Color.WHITE);
        jenis1.setBounds(1150, 230, 1000, 100);
        latar.add(jenis1, Integer.valueOf(1));

        JLabel chapter1 = new JLabel("<html><span style='font-family:Poppins; font-size:8px; font-weight:normal;'> Chapter 200</span></html>");
        chapter1.setForeground(Color.WHITE);
        chapter1.setBounds(1150, 265, 1000, 100);
        latar.add(chapter1, Integer.valueOf(1));

        addNumberBox(latar, 975, 415, 20, 20, 2);
        ImageIcon bintang2 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/Rate.png")));
        ImageIcon scaledbntg2 = getScaledIcon(bintang2, 30, 17);

        JLabel bntg2 = new JLabel(scaledbntg2);
        bntg2.setBounds(1040, 285, 250, 393);
        latar.add(bntg2, Integer.valueOf(1));

        JLabel judulTeks2 = new JLabel("<html><span style='font-family:Poppins; font-size:12px; font-weight:bold;'> Return Of The Mou<br>Hua Sect</span></html>");
        judulTeks2.setForeground(Color.WHITE);
        judulTeks2.setBounds(1150, 380, 1000, 100);
        latar.add(judulTeks2, Integer.valueOf(1));

        JLabel jenis2 = new JLabel("<html><span style='font-family:Poppins; font-size:6px; font-weight:normal;'> Action, Comedy, Fantasy, Martial Arts</span></html>");
        jenis2.setForeground(Color.WHITE);
        jenis2.setBounds(1150, 410, 1000, 100);
        latar.add(jenis2, Integer.valueOf(1));

        JLabel chapter2 = new JLabel("<html><span style='font-family:Poppins; font-size:8px; font-weight:normal;'> Chapter 149</span></html>");
        chapter2.setForeground(Color.WHITE);
        chapter2.setBounds(1150, 450, 1000, 100);
        latar.add(chapter2, Integer.valueOf(1));


        addNumberBox(latar, 975, 595, 20, 20, 3);
        ImageIcon bintang3 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/Rate (1).png")));
        ImageIcon scaledbntg3 = getScaledIcon(bintang3, 30, 17);

        JLabel bntg3 = new JLabel(scaledbntg3);
        bntg3.setBounds(1040, 465, 250, 393);
        latar.add(bntg3, Integer.valueOf(1));

        JLabel judulTeks3 = new JLabel("<html><span style='font-family:Poppins; font-size:12px; font-weight:bold;'>The Greatest Estate<br>Developer</span></html>");
        judulTeks3.setForeground(Color.WHITE);
        judulTeks3.setBounds(1150, 560, 1000, 100);
        latar.add(judulTeks3, Integer.valueOf(1));

        JLabel jenis3 = new JLabel("<html><span style='font-family:Poppins; font-size:6px; font-weight:normal;'> Action, Adventure, Comedy, Fantasy</span></html>");
        jenis3.setForeground(Color.WHITE);
        jenis3.setBounds(1150, 590, 1000, 100);
        latar.add(jenis3, Integer.valueOf(1));

        JLabel chapter3 = new JLabel("<html><span style='font-family:Poppins; font-size:8px; font-weight:normal;'> Chapter 168</span></html>");
        chapter3.setForeground(Color.WHITE);
        chapter3.setBounds(1150, 630, 1000, 100);
        latar.add(chapter3, Integer.valueOf(1));

        ImageIcon Poster3 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/poster-3.png")));
        ImageIcon scaledPoster3 = getScaledIcon(Poster3, 110, 160);

        JLabel pstr3 = new JLabel(scaledPoster3);
        pstr3.setBounds(950, 50, 250, 393);
        latar.add(pstr3, Integer.valueOf(1));

        ImageIcon Poster4 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/poster-2.png")));
        ImageIcon scaledPoster4 = getScaledIcon(Poster4, 110, 160);

        JLabel pstr4 = new JLabel(scaledPoster4);
        pstr4.setBounds(950, 230, 250, 393);
        latar.add(pstr4, Integer.valueOf(1));

        ImageIcon Poster5 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/poster-4.png")));
        ImageIcon scaledPoster5 = getScaledIcon(Poster5, 110, 160);

        JLabel pstr5 = new JLabel(scaledPoster5);
        pstr5.setBounds(950, 410, 250, 393);
        latar.add(pstr5, Integer.valueOf(1));

        JLabel labelTeks6 = new JLabel("<html><span style='font-family:Poppins; font-size:16px; font-weight:bold;'> Popular Comics</span></html>");
        labelTeks6.setForeground(Color.WHITE);
        labelTeks6.setBounds(985, 60, 1000, 100);
        latar.add(labelTeks6, Integer.valueOf(1));

        JPanel form1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                int radius = 25;
                int thickness = 2;
                int xOffset = thickness / 2;
                int yOffset = thickness / 2;

                g2d.setColor(Color.decode("#6A6A6A"));
                g2d.setStroke(new BasicStroke(thickness));
                g2d.drawRoundRect(xOffset, yOffset, getWidth() - thickness, getHeight() - thickness, radius, radius);
            }
        };
        form1.setLayout(null);
        form1.setBounds(950, 70, 371, 650);
        form1.setBackground(new Color(0, 0, 0, 0));
        form1.setOpaque(false);
        latar.add(form1, Integer.valueOf(1));

        JButton btn9 = new JButton();
        btn9.setBounds(1020, 166, 110, 160);
        btn9.setOpaque(false);
        btn9.setContentAreaFilled(false);
        btn9.setBorderPainted(false);
        btn9.setFocusPainted(false);
        btn9.addActionListener(e -> {
            SwingUtilities.getWindowAncestor(btn9).setVisible(false);
            new OverviewSoloLeveling().setVisible(true);
        });
        latar.add(btn9, Integer.valueOf(1));

        JButton btn10 = new JButton();
        btn10.setBounds(1020, 346, 110, 160);
        btn10.setOpaque(false);
        btn10.setContentAreaFilled(false);
        btn10.setBorderPainted(false);
        btn10.setFocusPainted(false);
        btn10.addActionListener(e -> {
            SwingUtilities.getWindowAncestor(btn10).setVisible(false);
            new OverviewMountHua().setVisible(true);
        });
        latar.add(btn10, Integer.valueOf(1));

        JButton btn11 = new JButton();
        btn11.setBounds(1020, 526, 110, 160);
        btn11.setOpaque(false);
        btn11.setContentAreaFilled(false);
        btn11.setBorderPainted(false);
        btn11.setFocusPainted(false);
        btn11.addActionListener(e -> {
            SwingUtilities.getWindowAncestor(btn11).setVisible(false);
            new OverviewGreatestEstateDeveloper().setVisible(true);
        });
        latar.add(btn11, Integer.valueOf(1));

        MenuBar menuBar = new MenuBar();
        menuBar.setOpaque(false);
        menuBar.setForeground(Color.BLACK);
        menuBar.setFont(new Font("Poppins", Font.BOLD, 14));
        this.setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Home home = new Home();
            home.setVisible(true);
        });

    }
}