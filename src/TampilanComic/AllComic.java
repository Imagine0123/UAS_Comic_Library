package TampilanComic;

import TampilanMenu.MenuBar;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

import static TampilanMenu.MenuBar.addNumberBox;
import static TampilanMenu.MenuBar.getScaledIcon;

public class AllComic extends JFrame {
    public AllComic() {
        setTitle("ALL COMICS");
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

        JLabel judulTeks2 = new JLabel("<html><span style='font-family:Poppins; font-size:12px; font-weight:bold;'> Return Of The M...</span></html>");
        judulTeks2.setForeground(Color.WHITE);
        judulTeks2.setBounds(1150, 390, 1000, 100);
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

        JLabel judulTeks3 = new JLabel("<html><span style='font-family:Poppins; font-size:12px; font-weight:bold;'>The Greatest Estate<br>D...</span></html>");
        judulTeks3.setForeground(Color.WHITE);
        judulTeks3.setBounds(1150, 550, 1000, 100);
        latar.add(judulTeks3, Integer.valueOf(1));

        JLabel jenis3 = new JLabel("<html><span style='font-family:Poppins; font-size:6px; font-weight:normal;'> Action, Adventure, Comedy, Fantasy</span></html>");
        jenis3.setForeground(Color.WHITE);
        jenis3.setBounds(1150, 590, 1000, 100);
        latar.add(jenis3, Integer.valueOf(1));

        JLabel chapter3 = new JLabel("<html><span style='font-family:Poppins; font-size:8px; font-weight:normal;'> Chapter 168</span></html>");
        chapter3.setForeground(Color.WHITE);
        chapter3.setBounds(1150, 630, 1000, 100);
        latar.add(chapter3, Integer.valueOf(1));

        JSeparator horizontalSeparator1 = new JSeparator();
        horizontalSeparator1.setBounds(125, 130, 750, 2);
        horizontalSeparator1.setForeground(Color.decode("#6A6A6A"));
        latar.add(horizontalSeparator1, Integer.valueOf(2));

        JSeparator horizontalSeparator2 = new JSeparator();
        horizontalSeparator2.setBounds(980, 130, 310, 2);
        horizontalSeparator2.setForeground(Color.decode("#6A6A6A"));
        latar.add(horizontalSeparator2, Integer.valueOf(2));

        ImageIcon Poster1 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/poster-1.png")));
        ImageIcon scaledPoster1 = getScaledIcon(Poster1, 110, 160);

        JLabel pstr1 = new JLabel(scaledPoster1);
        pstr1.setBounds(110, 160, 150, 160);
        latar.add(pstr1, Integer.valueOf(1));

        ImageIcon Poster2 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/poster-2.png")));
        ImageIcon scaledPoster2 = getScaledIcon(Poster2, 110, 160);

        JLabel pstr2 = new JLabel(scaledPoster2);
        pstr2.setBounds(280, 160, 150, 160);
        latar.add(pstr2, Integer.valueOf(1));

        ImageIcon Poster6 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/Poster3.png")));
        ImageIcon scaledPoster6 = getScaledIcon(Poster6, 110, 160);

        JLabel pstr6 = new JLabel(scaledPoster6);
        pstr6.setBounds(450, 160, 150, 160);
        latar.add(pstr6, Integer.valueOf(1));

        ImageIcon Poster7 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/poster-4.png")));
        ImageIcon scaledPoster7 = getScaledIcon(Poster7, 110, 160);

        JLabel pstr7 = new JLabel(scaledPoster7);
        pstr7.setBounds(620, 160, 150, 160);
        latar.add(pstr7, Integer.valueOf(1));

        ImageIcon Poster8 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/poster-5.png")));
        ImageIcon scaledPoster8 = getScaledIcon(Poster8, 110, 160);

        JLabel pstr8 = new JLabel(scaledPoster8);
        pstr8.setBounds(110, 400, 150, 160);
        latar.add(pstr8, Integer.valueOf(1));

        ImageIcon Poster9 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/poster-6.png")));
        ImageIcon scaledPoster9 = getScaledIcon(Poster9, 110, 160);

        JLabel pstr9 = new JLabel(scaledPoster9);
        pstr9.setBounds(280, 400, 150, 160);
        latar.add(pstr9, Integer.valueOf(1));

        ImageIcon Poster10 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/poster-7.png")));
        ImageIcon scaledPoster10 = getScaledIcon(Poster10, 110, 160);

        JLabel pstr10 = new JLabel(scaledPoster10);
        pstr10.setBounds(450, 400, 150, 160);
        latar.add(pstr10, Integer.valueOf(1));

        ImageIcon Poster11 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/poster-8.png")));
        ImageIcon scaledPoster11 = getScaledIcon(Poster11, 110, 160);

        JLabel pstr11 = new JLabel(scaledPoster11);
        pstr11.setBounds(620, 400, 150, 160);
        latar.add(pstr11, Integer.valueOf(1));

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

        JLabel labelTeks1 = new JLabel("<html><span style='font-family:Poppins; font-size:16px; font-weight:bold;'> All Comic</span></html>");
        labelTeks1.setForeground(Color.WHITE);
        labelTeks1.setBounds(150, 60, 1000, 100);
        latar.add(labelTeks1, Integer.valueOf(1));

        JLabel labelTeks2 = new JLabel("<html><span style='font-family:Poppins; font-size:14px; font-weight:bold;'> Nano Machine</span></html>");
        labelTeks2.setForeground(Color.WHITE);
        labelTeks2.setBounds(130, 320, 500, 50);
        latar.add(labelTeks2, Integer.valueOf(1));

        JLabel labelTeks3 = new JLabel("<html><span style='font-family:Poppins; font-size:10px; font-weight:normal;'> Chapter 233</span></html>");
        labelTeks3.setForeground(Color.WHITE);
        labelTeks3.setBounds(130, 325, 1000, 100);
        latar.add(labelTeks3, Integer.valueOf(1));

        JLabel labelTeks4 = new JLabel("<html><span style='font-family:Poppins; font-size:14px; font-weight:bold;'> Return Of T...</span></html>");
        labelTeks4.setForeground(Color.WHITE);
        labelTeks4.setBounds(300, 320, 500, 50);
        latar.add(labelTeks4, Integer.valueOf(1));

        JLabel labelTeks5 = new JLabel("<html><span style='font-family:Poppins; font-size:10px; font-weight:normal;'> Chapter 149</span></html>");
        labelTeks5.setForeground(Color.WHITE);
        labelTeks5.setBounds(300, 325, 1000, 100);
        latar.add(labelTeks5, Integer.valueOf(1));

        JLabel labelTeks6 = new JLabel("<html><span style='font-family:Poppins; font-size:14px; font-weight:bold;'> Solo Level...</span></html>");
        labelTeks6.setForeground(Color.WHITE);
        labelTeks6.setBounds(470, 320, 500, 50);
        latar.add(labelTeks6, Integer.valueOf(1));

        JLabel labelTeks7 = new JLabel("<html><span style='font-family:Poppins; font-size:10px; font-weight:normal;'> Chapter 200</span></html>");
        labelTeks7.setForeground(Color.WHITE);
        labelTeks7.setBounds(470, 325, 1000, 100);
        latar.add(labelTeks7, Integer.valueOf(1));

        JLabel labelTeks8 = new JLabel("<html><span style='font-family:Poppins; font-size:14px; font-weight:bold;'> Greatest Es...</span></html>");
        labelTeks8.setForeground(Color.WHITE);
        labelTeks8.setBounds(640, 320, 500, 50);
        latar.add(labelTeks8, Integer.valueOf(1));

        JLabel labelTeks9 = new JLabel("<html><span style='font-family:Poppins; font-size:10px; font-weight:normal;'> Chapter 168</span></html>");
        labelTeks9.setForeground(Color.WHITE);
        labelTeks9.setBounds(640, 325, 1000, 100);
        latar.add(labelTeks9, Integer.valueOf(1));

        JLabel labelTeks10 = new JLabel("<html><span style='font-family:Poppins; font-size:14px; font-weight:bold;'> Heavenly Inqui...</span></html>");
        labelTeks10.setForeground(Color.WHITE);
        labelTeks10.setBounds(130, 550, 500, 50);
        latar.add(labelTeks10, Integer.valueOf(1));

        JLabel labelTeks11 = new JLabel("<html><span style='font-family:Poppins; font-size:10px; font-weight:normal;'> Chapter 97</span></html>");
        labelTeks11.setForeground(Color.WHITE);
        labelTeks11.setBounds(130, 555, 1000, 100);
        latar.add(labelTeks11, Integer.valueOf(1));

        JLabel labelTeks12 = new JLabel("<html><span style='font-family:Poppins; font-size:14px; font-weight:bold;'> Logging 10,000...</span></html>");
        labelTeks12.setForeground(Color.WHITE);
        labelTeks12.setBounds(300, 550, 500, 50);
        latar.add(labelTeks12, Integer.valueOf(1));

        JLabel labelTeks13 = new JLabel("<html><span style='font-family:Poppins; font-size:10px; font-weight:normal;'> Chapter 168</span></html>");
        labelTeks13.setForeground(Color.WHITE);
        labelTeks13.setBounds(300, 555, 1000, 100);
        latar.add(labelTeks13, Integer.valueOf(1));

        JLabel labelTeks14 = new JLabel("<html><span style='font-family:Poppins; font-size:14px; font-weight:bold;'> Absolute Regre...</span></html>");
        labelTeks14.setForeground(Color.WHITE);
        labelTeks14.setBounds(470, 550, 500, 50);
        latar.add(labelTeks14, Integer.valueOf(1));

        JLabel labelTeks15 = new JLabel("<html><span style='font-family:Poppins; font-size:10px; font-weight:normal;'> Chapter 22</span></html>");
        labelTeks15.setForeground(Color.WHITE);
        labelTeks15.setBounds(470, 555, 1000, 100);
        latar.add(labelTeks15, Integer.valueOf(1));

        JLabel labelTeks16 = new JLabel("<html><span style='font-family:Poppins; font-size:14px; font-weight:bold;'> The Game That...</span></html>");
        labelTeks16.setForeground(Color.WHITE);
        labelTeks16.setBounds(640, 550, 500, 50);
        latar.add(labelTeks16, Integer.valueOf(1));

        JLabel labelTeks17 = new JLabel("<html><span style='font-family:Poppins; font-size:10px; font-weight:normal;'> Chapter 224</span></html>");
        labelTeks17.setForeground(Color.WHITE);
        labelTeks17.setBounds(640, 555, 1000, 100);
        latar.add(labelTeks17, Integer.valueOf(1));

        JLabel labelTeks100 = new JLabel("<html><span style='font-family:Poppins; font-size:16px; font-weight:bold;'> Popular Comics</span></html>");
        labelTeks100.setForeground(Color.WHITE);
        labelTeks100.setBounds(985, 60, 1000, 100);
        latar.add(labelTeks100, Integer.valueOf(1));

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

        JPanel form2 = new JPanel() {
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
        form2.setLayout(null);
        form2.setBounds(100, 70, 800, 650);
        form2.setBackground(new Color(0, 0, 0, 0));
        form2.setOpaque(false);
        latar.add(form2, Integer.valueOf(1));

        this.add(latar);

        MenuBar menuBar = new MenuBar();
        menuBar.setOpaque(false);
        menuBar.setForeground(Color.BLACK);
        menuBar.setFont(new Font("Poppins", Font.BOLD, 14));
        this.setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        AllComic allComic = new AllComic();
        allComic.setVisible(true);
    }

}
