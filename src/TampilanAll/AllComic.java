package TampilanAll;

import TampilanLogin.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class AllComic extends JFrame {
    public AllComic() {
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

        JMenuBar menuBar = new JMenuBar() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(Background.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        menuBar.setOpaque(false);
        menuBar.setForeground(Color.WHITE);
        menuBar.setFont(new Font("Poppins", Font.BOLD, 14));

        JTextField searchField = new JTextField("Search");
        searchField.setFont(new Font("Poppins", Font.BOLD, 14));
        searchField.setPreferredSize(new Dimension(300, 30));
        searchField.setMinimumSize(new Dimension(300, 30));
        searchField.setMaximumSize(new Dimension(300, 30));
        searchField.setForeground(Color.GRAY);

        searchField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (searchField.getText().equals("Search")) {
                    searchField.setText("");
                    searchField.setForeground(Color.BLACK);
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (searchField.getText().isEmpty()) {
                    searchField.setText("Search");
                    searchField.setForeground(Color.GRAY);
                }
            }
        });

        JMenu homeMenu = new JMenu("<html><span style='font-family:Poppins; font-size:15px; font-weight:bold; color:white; font-style:italic;'> NGOMIK</span>" +
                "<span style='font-family:Poppins; font-size:15px; font-weight:bold; font-style:italic; color:#9B1D21;'>MAS!</span></html>");
        homeMenu.setFont(new Font("Poppins", Font.BOLD, 18));
        JMenuItem homeItem1 = new JMenuItem("<html><span style='font-family:Poppins; font-size:15px; font-weight:normal;'>Home</span></html>");
        homeItem1.setFont(new Font("Poppins", Font.BOLD, 14));
        JMenuItem homeItem2 = new JMenuItem("<html><span style='font-family:Poppins; font-size:15px; font-weight:normal;'>About</span></html>");
        homeItem2.setFont(new Font("Poppins", Font.BOLD, 14));
        homeMenu.add(homeItem1);
        homeMenu.add(homeItem2);

        JMenu bookmarkMenu = new JMenu("<html><span style='font-family:Poppins; font-size:15px; font-weight:bold; color:white; '>Bookmark</span></html>");
        bookmarkMenu.setFont(new Font("Poppins", Font.BOLD, 14));
        JMenuItem bookmarkItem1 = new JMenuItem("<html><span style='font-family:Poppins; font-size:15px; font-weight:normal;'>View</span></html>");
        bookmarkItem1.setFont(new Font("Poppins", Font.BOLD, 14));
        JMenuItem bookmarkItem2 = new JMenuItem("<html><span style='font-family:Poppins; font-size:15px; font-weight:normal;'>Manage</span></html>");
        bookmarkItem2.setFont(new Font("Poppins", Font.BOLD, 14));
        bookmarkMenu.add(bookmarkItem1);
        bookmarkMenu.add(bookmarkItem2);

        JMenu comicListMenu = new JMenu("<html><span style='font-family:Poppins; font-size:15px; font-weight:bold; color:white; '>Comics List</span></html>");
        comicListMenu.setFont(new Font("Poppins", Font.BOLD, 14));
        JMenuItem comicListItem1 = new JMenuItem("<html><span style='font-family:Poppins; font-size:15px; font-weight:normal;'>All</span></html>");
        comicListItem1.setFont(new Font("Poppins", Font.BOLD, 14));
        JMenuItem comicListItem2 = new JMenuItem("<html><span style='font-family:Poppins; font-size:15px; font-weight:normal;'>Popular</span></html>");
        comicListItem2.setFont(new Font("Poppins", Font.BOLD, 14));
        JMenuItem comicListItem3 = new JMenuItem("<html><span style='font-family:Poppins; font-size:15px; font-weight:normal;'>Newest</span></html>");
        comicListItem3.setFont(new Font("Poppins", Font.BOLD, 14));
        comicListMenu.add(comicListItem1);
        comicListMenu.add(comicListItem2);
        comicListMenu.add(comicListItem3);

        JMenuItem logoutItem = new JMenuItem("<html><span style='font-family:Poppins; font-size:15px; font-weight:bold; color:white;'>Hi, User | Logout</span></html>");
        logoutItem.setFont(new Font("Poppins", Font.BOLD, 14));
        logoutItem.setForeground(Color.WHITE);
        logoutItem.setOpaque(false);
        logoutItem.setContentAreaFilled(false);
        logoutItem.setBorderPainted(false);
        logoutItem.addActionListener(e -> {
            this.setVisible(false);
            new Login().setVisible(true);
        });
        menuBar.add(homeMenu);
        menuBar.add(bookmarkMenu);
        menuBar.add(comicListMenu);
        menuBar.add(Box.createHorizontalGlue());
        menuBar.add(searchField);
        menuBar.add(Box.createRigidArea(new Dimension(10, 0)));
        menuBar.add(logoutItem);

        this.setJMenuBar(menuBar);
    }

}
