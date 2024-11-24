package TampilanOverview;

import TampilanMenu.MenuBar;

import static TampilanMenu.MenuBar.addNumberBox;
import static TampilanMenu.MenuBar.getScaledIcon;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class OverviewNanoMachine extends JFrame {
    public OverviewNanoMachine() {
        setTitle("Overview");
        setSize(1440, 1024);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        overview();
        background();
    }

    public class RoundedButton extends JButton {
        private int cornerRadius;

        public RoundedButton(String text, int radius) {
            super(text);
            this.cornerRadius = radius;
            setContentAreaFilled(false);
            setFocusPainted(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            // Background
            if (getModel().isPressed()) {
                g2.setColor(getBackground().darker());
            } else if (getModel().isRollover()) {
                g2.setColor(getBackground().brighter());
            } else {
                g2.setColor(getBackground());
            }
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);

            FontMetrics fm = g2.getFontMetrics();
            int stringWidth = fm.stringWidth(getText());
            int stringHeight = fm.getAscent();
            g2.drawString(getText(), (getWidth() - stringWidth) / 2, (getHeight() + stringHeight) / 2 - 2);

            g2.dispose();
            super.paintComponent(g);
        }

        @Override
        protected void paintBorder(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getForeground());
            g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, cornerRadius, cornerRadius);
            g2.dispose();
        }
    }

    public class RoundedPanel extends JPanel {

        // Menentukan radius sudut
        private int radius = 10;

        public RoundedPanel() {
            setOpaque(false); // Agar panel transparan untuk menggambar custom border
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            // Menentukan warna border
            g.setColor(getBackground());
            // Menggambar border dengan radius
            g.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        }
    }

    private void overview(){
        JLayeredPane latarinformasi = new JLayeredPane();
        latarinformasi.setBounds(0, 0, 1440, 1024);
        ImageIcon PosterNano = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/poster-1.png")));
        ImageIcon scaledPosterNanos = getScaledIcon(PosterNano, 200, 303);

        JLabel pstrNano = new JLabel(scaledPosterNanos);
        pstrNano.setBounds(130, 130, 250, 393);
        latarinformasi.add(pstrNano, Integer.valueOf(1));

        JLabel Teks1 = new JLabel("<html><span style='font-family:Poppins; font-size:8px; font-weight:normal;'> Followed By 6314 Peoples</span></html>");
        Teks1.setForeground(Color.WHITE);
        Teks1.setBounds(370, 160, 1000, 100);
        latarinformasi.add(Teks1, Integer.valueOf(1));

        JLabel Teks2 = new JLabel("<html><span style='font-family:Poppins; font-size:14px; font-weight:bold;'> Nano Machine</span></html>");
        Teks2.setForeground(Color.WHITE);
        Teks2.setBounds(370, 195, 1000, 100);
        latarinformasi.add(Teks2, Integer.valueOf(1));

        JLabel Teks3 = new JLabel("<html><span style='font-family:Poppins; font-size:12px; font-weight:bold;'> Synopsis</span></html>");
        Teks3.setForeground(Color.GRAY);
        Teks3.setBounds(370, 235, 1000, 100);
        latarinformasi.add(Teks3, Integer.valueOf(1));

        JLabel Teks4 = new JLabel("<html><span style='font-family:Poppins; font-size:8px; font-weight:bold;'> Nanotechnology meets martial arts at the Mashin Academy. Yeo-un’s mother may not be one <br> " +
                "of the High Priest’s six official wives, but his father’s blood still qualifies him for a chance at <br> " +
                "onto the world. After the battle, he breathes his last breath on top of the headquarter mountain" +
                "<br> the position of Minor Priest. Will a mysterious nanomachine injection from a future" +
                "<br> descendent help Yeo-un in this fierce competition against his powerful half-siblings?</span></html>");
        Teks4.setForeground(Color.GRAY);
        Teks4.setBounds(370, 295, 1000, 100);
        latarinformasi.add(Teks4, Integer.valueOf(1));

        JLabel Teks5 = new JLabel("<html><span style='font-family:Poppins; font-size:10px; font-weight:bold;'> Rating</span></html>");
        Teks5.setForeground(Color.WHITE);
        Teks5.setBounds(370, 360, 1000, 100);
        latarinformasi.add(Teks5, Integer.valueOf(1));

        JLabel Teks6 = new JLabel("<html><span style='font-family:Poppins; font-size:10px; font-weight:bold;'> Author</span></html>");
        Teks6.setForeground(Color.WHITE);
        Teks6.setBounds(550, 360, 1000, 100);
        latarinformasi.add(Teks6, Integer.valueOf(1));

        ImageIcon gambar = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/RateBintang1.png")));
        ImageIcon scaledgambar = getScaledIcon(gambar, 98, 20);

        JLabel gmbr = new JLabel(scaledgambar);
        gmbr.setBounds(290, 240, 250, 393);
        latarinformasi.add(gmbr, Integer.valueOf(1));

        JLabel Teks7 = new JLabel("<html><span style='font-family:Poppins; font-size:8px; font-weight:normal;'> Hanjoong Wolya/Hyun Jeolmu</span></html>");
        Teks7.setForeground(Color.GRAY);
        Teks7.setBounds(550, 385, 1000, 100);
        latarinformasi.add(Teks7, Integer.valueOf(1));

        JLabel Teks8 = new JLabel("<html><span style='font-family:Poppins; font-size:10px; font-weight:bold;'> Last Update On</span></html>");
        Teks8.setForeground(Color.WHITE);
        Teks8.setBounds(370, 420, 1000, 100);
        latarinformasi.add(Teks8, Integer.valueOf(1));

        JLabel Teks9 = new JLabel("<html><span style='font-family:Poppins; font-size:8px; font-weight:normal;'> November 20th 2024</span></html>");
        Teks9.setForeground(Color.GRAY);
        Teks9.setBounds(370, 440, 1000, 100);
        latarinformasi.add(Teks9, Integer.valueOf(1));

        JLabel Teks10 = new JLabel("<html><span style='font-family:Poppins; font-size:10px; font-weight:bold;'> Genres</span></html>");
        Teks10.setForeground(Color.WHITE);
        Teks10.setBounds(370, 465, 1000, 100);
        latarinformasi.add(Teks10, Integer.valueOf(1));

        RoundedPanel genrePanel1 = new RoundedPanel();
        genrePanel1.setBounds(370, 530, 60, 20);
        genrePanel1.setBackground(Color.decode("#606060"));
        genrePanel1.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        JLabel genreLabel1 = new JLabel("<html><span style='font-family:Poppins; font-size:8px; font-weight:normal;'>Action</span></html>");
        genreLabel1.setForeground(Color.WHITE);
        genrePanel1.add(genreLabel1);
        latarinformasi.add(genrePanel1, Integer.valueOf(1));

        RoundedPanel genrePanel2 = new RoundedPanel();
        genrePanel2.setBounds(440, 530, 80, 20);
        genrePanel2.setBackground(Color.decode("#606060"));
        genrePanel2.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        JLabel genreLabel2 = new JLabel("<html><span style='font-family:Poppins; font-size:8px; font-weight:normal;'>Adventure</span></html>");
        genreLabel2.setForeground(Color.WHITE);
        genrePanel2.add(genreLabel2);
        latarinformasi.add(genrePanel2, Integer.valueOf(1));

        RoundedPanel genrePanel3 = new RoundedPanel();
        genrePanel3.setBounds(530, 530, 65, 20);
        genrePanel3.setBackground(Color.decode("#606060"));
        genrePanel3.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        JLabel genreLabel3 = new JLabel("<html><span style='font-family:Poppins; font-size:8px; font-weight:normal;'>Fantasy</span></html>");
        genreLabel3.setForeground(Color.WHITE);
        genrePanel3.add(genreLabel3);
        latarinformasi.add(genrePanel3, Integer.valueOf(1));

        RoundedPanel genrePanel4 = new RoundedPanel();
        genrePanel4.setBounds(605, 530, 85, 20);
        genrePanel4.setBackground(Color.decode("#606060"));
        genrePanel4.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        JLabel genreLabel4 = new JLabel("<html><span style='font-family:Poppins; font-size:8px; font-weight:normal;'>Martial Arts</span></html>");
        genreLabel4.setForeground(Color.WHITE);
        genrePanel4.add(genreLabel4);
        latarinformasi.add(genrePanel4, Integer.valueOf(1));

        JLabel Teks11 = new JLabel("<html><span style='font-family:Poppins; font-size:12px; font-weight:bold;'> Nano Machine’s Chapter</span></html>");
        Teks11.setForeground(Color.WHITE);
        Teks11.setBounds(150, 550, 1000, 100);
        latarinformasi.add(Teks11, Integer.valueOf(1));

        RoundedPanel genrePanel5 = new RoundedPanel();
        genrePanel5.setBounds(700, 530, 65, 20);
        genrePanel5.setBackground(Color.decode("#606060"));
        genrePanel5.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        JLabel genreLabel5 = new JLabel("<html><span style='font-family:Poppins; font-size:8px; font-weight:normal;'>Murim</span></html>");
        genreLabel5.setForeground(Color.WHITE);
        genrePanel5.add(genreLabel5);
        latarinformasi.add(genrePanel5, Integer.valueOf(1));

        RoundedPanel genrePanel6 = new RoundedPanel();
        genrePanel6.setBounds(775, 530, 90, 20);
        genrePanel6.setBackground(Color.decode("#606060"));
        genrePanel6.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        JLabel genreLabel6 = new JLabel("<html><span style='font-family:Poppins; font-size:8px; font-weight:normal;'>System</span></html>");
        genreLabel6.setForeground(Color.WHITE);
        genrePanel6.add(genreLabel6);
        latarinformasi.add(genrePanel6, Integer.valueOf(1));

        RoundedPanel status1 = new RoundedPanel();
        status1.setBounds(150, 520, 205, 30);
        status1.setBackground(Color.decode("#606060"));
        status1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        JLabel stts1 = new JLabel("<html><span style='font-family:Poppins; font-size:8px; font-weight:normal;'>Status Ongoing</span></html>");
        stts1.setForeground(Color.WHITE);
        status1.add(stts1);
        latarinformasi.add(status1, Integer.valueOf(1));

        RoundedPanel status2 = new RoundedPanel();
        status2.setBounds(150, 555, 205, 30);
        status2.setBackground(Color.decode("#606060"));
        status2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        JLabel stts2 = new JLabel("<html><span style='font-family:Poppins; font-size:8px; font-weight:normal;'>Type Manhwa</span></html>");
        stts2.setForeground(Color.WHITE);
        status2.add(stts2);
        latarinformasi.add(status2, Integer.valueOf(1));

        RoundedPanel firstchapter = new RoundedPanel();
        firstchapter.setBounds(150, 620, 250, 60);
        firstchapter.setBackground(Color.decode("#B90F0F"));
        firstchapter.setLayout(new BoxLayout(firstchapter, BoxLayout.Y_AXIS));

        JLabel chapterTitle = new JLabel("First Chapter");
        chapterTitle.setFont(new Font("Poppins", Font.PLAIN, 8));
        chapterTitle.setForeground(Color.WHITE);
        chapterTitle.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel chapterNumber = new JLabel("Chapter 1");
        chapterNumber.setFont(new Font("Poppins", Font.BOLD, 12));
        chapterNumber.setForeground(Color.WHITE);
        chapterNumber.setAlignmentX(Component.CENTER_ALIGNMENT);

        firstchapter.add(Box.createVerticalStrut(10));
        firstchapter.add(chapterTitle);
        firstchapter.add(Box.createVerticalStrut(4));
        firstchapter.add(chapterNumber);

        latarinformasi.add(firstchapter, Integer.valueOf(1));

        RoundedPanel lastchapter = new RoundedPanel();
        lastchapter.setBounds(420, 620, 250, 60);
        lastchapter.setBackground(Color.decode("#B90F0F"));
        lastchapter.setLayout(new BoxLayout(lastchapter, BoxLayout.Y_AXIS));

        JLabel lastchapterTitle = new JLabel("Last Chapter");
        lastchapterTitle.setFont(new Font("Poppins", Font.PLAIN, 8));
        lastchapterTitle.setForeground(Color.WHITE);
        lastchapterTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        lastchapterTitle.setAlignmentY(JLabel.CENTER);

        JLabel lastchapterNumber = new JLabel("Chapter 234");
        lastchapterNumber.setFont(new Font("Poppins", Font.BOLD, 12));
        lastchapterNumber.setForeground(Color.WHITE);
        lastchapterNumber.setAlignmentX(Component.CENTER_ALIGNMENT);
        lastchapterNumber.setAlignmentY(JLabel.CENTER);

        lastchapter.add(Box.createVerticalStrut(10));
        lastchapter.add(lastchapterTitle);
        lastchapter.add(Box.createVerticalStrut(4));
        lastchapter.add(lastchapterNumber);

        latarinformasi.add(lastchapter, Integer.valueOf(1));

        RoundedButton bookmark1 = new RoundedButton("Bookmarks", 10);
        bookmark1.setBounds(150, 485, 205, 30);
        bookmark1.setFont(new Font("Poppins", Font.PLAIN, 10));
        bookmark1.setBackground(Color.decode("#606060"));
        bookmark1.addActionListener(e -> {
            if (bookmark1.getBackground().equals(Color.decode("#606060"))) {
                bookmark1.setBackground(Color.decode("#B90F0F"));
                bookmark1.setText("Bookmarks");
            } else {
                bookmark1.setBackground(Color.decode("#606060"));
                bookmark1.setText("Bookmarks");
            }
        });

        latarinformasi.add(bookmark1, Integer.valueOf(2));
        this.add(latarinformasi);
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

        JLabel jenis2 = new JLabel("<html><span style='font-family:Poppins; font-size:6px; font-weight:normal;'> Action, Adventure, Comedy, Martial Arts</span></html>");
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

        JLabel labelTeks7 = new JLabel("<html><span style='font-family:Poppins; font-size:8px; font-weight:bold;'> NGOMIKMAS! > Nano Machine</span></html>");
        labelTeks7.setForeground(Color.WHITE);
        labelTeks7.setBounds(115, 45, 1000, 100);
        latar.add(labelTeks7, Integer.valueOf(1));

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
        form2.setBounds(100, 150, 800, 570);
        form2.setBackground(new Color(0, 0, 0, 0));
        form2.setOpaque(false);
        latar.add(form2, Integer.valueOf(1));

        JPanel form3 = new JPanel() {
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
        form3.setLayout(null);
        form3.setBounds(100, 70, 800, 50);
        form3.setBackground(new Color(0, 0, 0, 0));
        form3.setOpaque(false);
        latar.add(form3, Integer.valueOf(1));

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
        OverviewNanoMachine overviewNanoMachine = new OverviewNanoMachine();
        overviewNanoMachine.setVisible(true);
    }
}
