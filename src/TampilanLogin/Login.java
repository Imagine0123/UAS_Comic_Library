package TampilanLogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import TampilanHome.Home;

public class Login extends JFrame {
    private static final Map<String, String> users = new HashMap<>();

    private static final String CONFIG_FILE = "remember_me_config.txt";

    private void saveLoginConfig(String email) {
        try {
            if (email != null) {
                java.nio.file.Files.write(java.nio.file.Paths.get(CONFIG_FILE), email.getBytes());
            } else {
                java.nio.file.Files.deleteIfExists(java.nio.file.Paths.get(CONFIG_FILE));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String readLoginConfig() {
        try {
            if (java.nio.file.Files.exists(java.nio.file.Paths.get(CONFIG_FILE))) {
                return new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(CONFIG_FILE)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    static {
        users.put("dimas.rasyach@gmail.com", hashPassword("dimas1234"));
        users.put("rafdi.nur@gmail.com", hashPassword("rafdi1234"));
        users.put("alya.rahma@gmail.com", hashPassword("alya1234"));
        users.put("ivan.gustav@gmail.com", hashPassword("ivan1234"));
        users.put("dosen@gmail.com", hashPassword("dosen1234"));
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

    private static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(password.getBytes(StandardCharsets.UTF_8));
            return bytesToHex(hashBytes);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public Login() {
        setTitle("NGOMIKMAS!");
        setSize(1440, 1024);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        Backgrouddanform();
    }

    private void Backgrouddanform() {
        JLayeredPane latar = new JLayeredPane();
        latar.setBounds(0, 0, 1440, 1024);

        ImageIcon Background = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/Background.png")));
        JLabel gambar = new JLabel(Background);
        gambar.setBounds(0, 0, 1440, 1024);
        latar.add(gambar, Integer.valueOf(0));

        JLabel labelTeks1 = new JLabel("<html><span style='font-family:Poppins; font-size:18px; font-weight:normal;'>SELAMAT DATANG DI</span>" +
                "<span style='font-family:Poppins; font-size:18px; font-weight:bold; font-style:italic;'> NGOMIK</span>" +
                "<span style='font-family:Poppins; font-size:18px; font-weight:bold; font-style:italic; color:#9B1D21;'>MAS!</span></html>");
        labelTeks1.setForeground(Color.WHITE);
        labelTeks1.setBounds(530, 182, 1000, 100);
        latar.add(labelTeks1, Integer.valueOf(2));

        JLabel labelTeks2 = new JLabel("<html><span style='font-family:Poppins; font-size:8px; font-weight:normal;'> Email / Register</span></html>");
        labelTeks2.setForeground(Color.WHITE);
        labelTeks2.setBounds(550, 260, 1000, 100);
        latar.add(labelTeks2, Integer.valueOf(2));

        JLabel labelTeks3 = new JLabel("<html><span style='font-family:Poppins; font-size:8px; font-weight:normal;'> Password</span></html>");
        labelTeks3.setForeground(Color.WHITE);
        labelTeks3.setBounds(550, 340, 1000, 100);
        latar.add(labelTeks3, Integer.valueOf(2));

        JPanel form = new JPanel() {
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

        JTextField emailField = new JTextField();
        emailField.setBounds(30, 65, 340, 40);
        emailField.setFont(new Font("Poppins", Font.PLAIN, 14));
        emailField.setForeground(Color.BLACK);
        emailField.setBackground(Color.WHITE);
        emailField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        form.add(emailField);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(30, 145, 340, 40);
        passwordField.setFont(new Font("Poppins", Font.PLAIN, 14));
        passwordField.setForeground(Color.BLACK);
        passwordField.setBackground(Color.WHITE);
        passwordField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        form.add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(50, 240, 300, 30);
        loginButton.setFont(new Font("Poppins", Font.PLAIN, 10));
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(Color.decode("#B90F0F"));
        loginButton.setFocusPainted(false);
        loginButton.setBorder(BorderFactory.createEmptyBorder());
        form.add(loginButton);

        JCheckBox rememberMe = new JCheckBox("Remember Me");
        rememberMe.setBounds(30, 205, 150, 20);
        rememberMe.setFont(new Font("Poppins", Font.PLAIN, 12));
        rememberMe.setForeground(Color.WHITE);
        rememberMe.setBackground(Color.BLACK);
        form.add(rememberMe);

        JLabel registerLabel = new JLabel("Register | Forget Password");
        registerLabel.setBounds(235, 205, 1000, 20);
        registerLabel.setFont(new Font("Poppins", Font.PLAIN, 10));
        registerLabel.setForeground(Color.WHITE);
        registerLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        form.add(registerLabel);

        JLabel errorLabel = new JLabel();
        errorLabel.setForeground(Color.RED);
        errorLabel.setFont(new Font("Poppins", Font.PLAIN, 8));
        errorLabel.setBounds(30, 185, 340, 20);
        form.add(errorLabel);

        String savedEmail = readLoginConfig();
        if (savedEmail != null) {
            emailField.setText(savedEmail);
            rememberMe.setSelected(true);
        }

        loginButton.addActionListener(e -> {
            String email = emailField.getText();
            String password = passwordField.getText();

            if (users.containsKey(email) && users.get(email).equals(hashPassword(password))) {
                if (rememberMe.isSelected()) {
                    saveLoginConfig(email);
                } else {
                    saveLoginConfig(null);
                }

                setVisible(false);
                new Home().setVisible(true);
            } else {
                errorLabel.setText("Email atau Password salah. Coba lagi.");
                emailField.setBorder(BorderFactory.createLineBorder(Color.decode("#B90F0F"), 1));
                passwordField.setBorder(BorderFactory.createLineBorder(Color.decode("#B90F0F"), 1));
                emailField.requestFocus();
                passwordField.setText("");
            }
        });

        emailField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    passwordField.requestFocus();
                }
            }
        });

        passwordField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    loginButton.doClick();
                }
            }
        });

        latar.add(form, Integer.valueOf(1));

        this.add(latar);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }
}