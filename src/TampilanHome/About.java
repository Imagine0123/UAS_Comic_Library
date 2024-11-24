package TampilanHome;

import TampilanMenu.MenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Objects;

public class About extends JFrame {
    public About() {
        setTitle("About");
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

    private void background() {
        JLayeredPane latar = new JLayeredPane();
        latar.setBounds(0, 0, 1440, 1024);

        ImageIcon Background = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/Background.png")));
        JLabel gambar = new JLabel(Background);
        gambar.setBounds(0, 0, 1440, 1024);
        latar.add(gambar, Integer.valueOf(0));
        this.add(latar);

        JPanel form = new JPanel() {
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
        form.setLayout(null);
        form.setBounds(100, 50, 1230, 650);
        form.setBackground(new Color(0, 0, 0, 0));
        form.setOpaque(false);
        latar.add(form, Integer.valueOf(1));

        JLabel labelTeks = new JLabel("<html><span style='font-family:Poppins; font-size:14px; font-weight:bold;'> About Us</span></html>");
        labelTeks.setForeground(Color.WHITE);
        labelTeks.setBounds(130, 40, 1000, 100);
        latar.add(labelTeks, Integer.valueOf(1));

        ImageIcon Dimas = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/Dimas.png")));
        ImageIcon scaledDimas = getScaledIcon(Dimas, 300, 500);

        JLabel dms = new JLabel(scaledDimas);
        dms.setBounds(115, 180, 300, 450);
        latar.add(dms, Integer.valueOf(1));
        JLabel namadimas = new JLabel("<html><span style='font-family:Poppins; font-size:12px; font-weight:bold;'> Dimas Rasyach Nur Fathi</span></html>");
        namadimas.setForeground(Color.WHITE);
        namadimas.setBounds(160, 600, 1000, 100);
        latar.add(namadimas, Integer.valueOf(2));
        JLabel nimdimas = new JLabel("<html><span style='font-family:Poppins; font-size:12px; font-weight:normal;'> 2310511043</span></html>");
        nimdimas.setForeground(Color.WHITE);
        nimdimas.setBounds(230, 620, 1000, 100);
        latar.add(nimdimas, Integer.valueOf(2));

        ImageIcon Ivan = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/Ivan.png")));
        ImageIcon scaledivan = getScaledIcon(Ivan, 300, 500);

        JLabel ivan = new JLabel(scaledivan);
        ivan.setBounds(415, 180, 300, 450);
        latar.add(ivan, Integer.valueOf(1));
        JLabel namaivan = new JLabel("<html><span style='font-family:Poppins; font-size:12px; font-weight:bold;'> Ivan Gustav Ramadhian</span></html>");
        namaivan.setForeground(Color.WHITE);
        namaivan.setBounds(470, 600, 1000, 100);
        latar.add(namaivan, Integer.valueOf(2));
        JLabel nimivan = new JLabel("<html><span style='font-family:Poppins; font-size:12px; font-weight:normal;'> 2310511052</span></html>");
        nimivan.setForeground(Color.WHITE);
        nimivan.setBounds(520, 620, 1000, 100);
        latar.add(nimivan, Integer.valueOf(2));

        ImageIcon Alya = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/Alya.png")));
        ImageIcon scaledalya = getScaledIcon(Alya, 300, 500);
        JLabel alya = new JLabel(scaledalya);
        alya.setBounds(715, 180, 300, 450);
        latar.add(alya, Integer.valueOf(1));
        JLabel namaalya = new JLabel("<html><span style='font-family:Poppins; font-size:12px; font-weight:bold;'> Alya Rahma Kusuma</span></html>");
        namaalya.setForeground(Color.WHITE);
        namaalya.setBounds(780, 600, 1000, 100);
        latar.add(namaalya, Integer.valueOf(2));
        JLabel nimalya = new JLabel("<html><span style='font-family:Poppins; font-size:12px; font-weight:normal;'> 231051105263</span></html>");
        nimalya.setForeground(Color.WHITE);
        nimalya.setBounds(820, 620, 1000, 100);
        latar.add(nimalya, Integer.valueOf(2));

        ImageIcon Rafdi = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/Rafdi.png")));
        ImageIcon scaledrafdi = getScaledIcon(Rafdi, 300, 500);

        JLabel rafdi = new JLabel(scaledrafdi);
        rafdi.setBounds(1015, 180, 300, 450);
        latar.add(rafdi, Integer.valueOf(1));
        JLabel namarafdi = new JLabel("<html><span style='font-family:Poppins; font-size:12px; font-weight:bold;'> Rafdi Nur Zhafir Rahman</span></html>");
        namarafdi.setForeground(Color.WHITE);
        namarafdi.setBounds(1070, 600, 1000, 100);
        latar.add(namarafdi, Integer.valueOf(2));
        JLabel nimrafdi = new JLabel("<html><span style='font-family:Poppins; font-size:12px; font-weight:normal;'> 2310511069</span></html>");
        nimrafdi.setForeground(Color.WHITE);
        nimrafdi.setBounds(1130, 620, 1000, 100);
        latar.add(nimrafdi, Integer.valueOf(2));

        RoundedPanel bar = new RoundedPanel();
        bar.setBounds(115, 110, 1200, 60);
        bar.setBackground(Color.decode("#B90F0F"));
        bar.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JLabel genreLabel2 = new JLabel("<html><span style='font-family:Poppins; font-size:20px; font-weight:bold;'>Kelompok 5 S1 INFORMATIKA KELAS B - PRAK PBO</span></html>");
        genreLabel2.setForeground(Color.WHITE);
        bar.add(genreLabel2);
        latar.add(bar, Integer.valueOf(1));

        TampilanMenu.MenuBar menuBar = new MenuBar();
        menuBar.setOpaque(false);
        menuBar.setForeground(Color.BLACK);
        menuBar.setFont(new Font("Poppins", Font.BOLD, 14));
        this.setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        About about = new About();
        about.setVisible(true);
    }
}
