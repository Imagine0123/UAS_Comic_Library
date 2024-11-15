package TampilanLogin;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    public Login(){
        setTitle("NGOMIKMAS!");
        setSize(1440, 1024);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        Backgrouddanform();
    }

    private void Backgrouddanform(){
        JLayeredPane latar = new JLayeredPane();
        latar.setBounds(0,0,1440,1024);

        ImageIcon Background = new ImageIcon(getClass().getResource("/images/Login.png"));
        JLabel gambar = new JLabel(Background);
        gambar.setBounds(0,0,1440,1024);
        latar.add(gambar, Integer.valueOf(0));

        // Atur JLabel dengan HTML tanpa tag HTML berulang
        JLabel labelTeks = new JLabel("<html><span style='font-family:Poppins; font-size:18px; font-weight:normal;'>" +
                "SELAMAT DATANG DI</span>" +
                "<span style='font-family:Poppins; font-size:18px; font-weight:bold; font-style:italic;'> NGOMIK</span>" +
                "<span style='font-family:Poppins; font-size:18px; font-weight:bold; font-style:italic; color:#9B1D21;'>MAS!</span></html>");
        labelTeks.setForeground(Color.WHITE);
        labelTeks.setBounds(530, 182, 1000, 100); // Posisi teks di luar form
        latar.add(labelTeks, Integer.valueOf(2));

        // Membuat form panel dengan border radius
        JPanel form = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                int radius = 25;
                g2d.setColor(Color.decode("#6A6A6A"));
                g2d.setStroke(new BasicStroke(2));
                g2d.drawRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
            }
        };
        form.setLayout(null);
        form.setBounds(520, 262, 401, 300);
        form.setBackground(Color.BLACK);
        form.setOpaque(true);
        latar.add(form, Integer.valueOf(1));

        this.add(latar);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }
}
