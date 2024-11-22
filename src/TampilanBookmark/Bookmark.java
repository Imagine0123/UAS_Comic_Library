package TampilanBookmark;

import TampilanMenu.MenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Objects;

public class Bookmark extends JFrame {
    public Bookmark() {
        setTitle("Bookmark");
        setSize(1440, 1024);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        background();
    }

    private ImageIcon getScaledIcon(ImageIcon originalIcon, int targetWidth, int targetHeight) {
        Image originalImage = originalIcon.getImage();
        BufferedImage scaledImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = scaledImage.createGraphics();

        // Aktifkan rendering berkualitas tinggi
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.drawImage(originalImage, 0, 0, targetWidth, targetHeight, null);
        g2d.dispose();

        return new ImageIcon(scaledImage);
    }

    private void background() {
        JLayeredPane latar = new JLayeredPane();
        latar.setBounds(0, 0, 1440, 1024);

        ImageIcon Background = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/Login.png")));
        JLabel gambar = new JLabel(Background);
        gambar.setBounds(0, 0, 1440, 1024);
        latar.add(gambar, Integer.valueOf(0));

        ImageIcon Poster1 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/Poster1.png")));
        ImageIcon scaledPoster1 = getScaledIcon(Poster1, 220, 323);

        JLabel pstr1 = new JLabel(scaledPoster1);
        pstr1.setBounds(130, 110, 250, 393);
        latar.add(pstr1, Integer.valueOf(1));

        ImageIcon Poster2 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/Poster2.png")));
        ImageIcon scaledPoster2 = getScaledIcon(Poster2, 220, 323);

        JLabel pstr2 = new JLabel(scaledPoster2);
        pstr2.setBounds(400, 110, 250, 393);
        latar.add(pstr2, Integer.valueOf(1));

        ImageIcon Poster3 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/poster-3.png")));
        ImageIcon scaledPoster3 = getScaledIcon(Poster3, 110, 160);

        JLabel pstr3 = new JLabel(scaledPoster3);
        pstr3.setBounds(950, 30, 250, 393);
        latar.add(pstr3, Integer.valueOf(1));

        ImageIcon Poster4 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/poster-2.png")));
        ImageIcon scaledPoster4 = getScaledIcon(Poster4, 110, 160);

        JLabel pstr4 = new JLabel(scaledPoster4);
        pstr4.setBounds(950, 210, 250, 393);
        latar.add(pstr4, Integer.valueOf(1));

        ImageIcon Poster5 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/poster-4.png")));
        ImageIcon scaledPoster5 = getScaledIcon(Poster5, 110, 160);

        JLabel pstr5 = new JLabel(scaledPoster5);
        pstr5.setBounds(950, 390, 250, 393);
        latar.add(pstr5, Integer.valueOf(1));

        JLabel labelTeks1 = new JLabel("<html><span style='font-family:Poppins; font-size:16px; font-weight:bold;'> Bookmarks</span></html>");
        labelTeks1.setForeground(Color.WHITE);
        labelTeks1.setBounds(150, 60, 1000, 100);
        latar.add(labelTeks1, Integer.valueOf(1));

        JLabel labelTeks2 = new JLabel("<html><span style='font-family:Poppins; font-size:14px; font-weight:bold;'> Nano Machine</span></html>");
        labelTeks2.setForeground(Color.WHITE);
        labelTeks2.setBounds(150, 410, 1000, 100);
        latar.add(labelTeks2, Integer.valueOf(1));

        JLabel labelTeks3 = new JLabel("<html><span style='font-family:Poppins; font-size:10px; font-weight:normal;'> Chapter 233</span></html>");
        labelTeks3.setForeground(Color.WHITE);
        labelTeks3.setBounds(150, 430, 1000, 100);
        latar.add(labelTeks3, Integer.valueOf(1));

        JLabel labelTeks4 = new JLabel("<html><span style='font-family:Poppins; font-size:14px; font-weight:bold;'> Return Of The M...</span></html>");
        labelTeks4.setForeground(Color.WHITE);
        labelTeks4.setBounds(420, 410, 1000, 100);
        latar.add(labelTeks4, Integer.valueOf(1));

        JLabel labelTeks5 = new JLabel("<html><span style='font-family:Poppins; font-size:10px; font-weight:normal;'> Chapter 149</span></html>");
        labelTeks5.setForeground(Color.WHITE);
        labelTeks5.setBounds(420, 430, 1000, 100);
        latar.add(labelTeks5, Integer.valueOf(1));

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
        form1.setBounds(950, 70, 351, 650);
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
        form2.setBounds(100, 70, 800, 450);
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
        Bookmark bookmark = new Bookmark();
        bookmark.setVisible(true);
    }
}
