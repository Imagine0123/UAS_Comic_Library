package TampilanMenu;

import TampilanHome.Home;
import TampilanLogin.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class MenuBar extends JMenuBar {
    public MenuBar() {
        setBorderPainted(false);
        setFont(new Font("Poppins", Font.BOLD, 14));
        setBackground(Color.BLACK);
        setForeground(Color.BLACK);
        setOpaque(true);

        JTextField searchField = new JTextField("Search");
        searchField.setFont(new Font("Poppins", Font.BOLD, 14));
        searchField.setPreferredSize(new Dimension(300, 30));
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

        add(searchField);

        JMenu homeMenu = new JMenu("<html><span style='font-family:Poppins; font-size:15px; font-weight:bold; color:black; font-style:italic;'> NGOMIK</span>" +
                "<span style='font-family:Poppins; font-size:15px; font-weight:bold; font-style:italic; color:#9B1D21;'>MAS!</span></html>");
        homeMenu.setFont(new Font("Poppins", Font.BOLD, 18));
        JMenuItem homeItem1 = new JMenuItem("<html><span style='font-family:Poppins; font-size:15px; font-weight:normal; color:black; '>Home</span></html>");
        homeItem1.setFont(new Font("Poppins", Font.BOLD, 14));
        homeItem1.addActionListener(e -> {
            SwingUtilities.getWindowAncestor(this).setVisible(false);
            new Home().setVisible(true);
        });
        JMenuItem homeItem2 = new JMenuItem("<html><span style='font-family:Poppins; font-size:15px; font-weight:normal;'>About</span></html>");
        homeItem2.setFont(new Font("Poppins", Font.BOLD, 14));
        homeMenu.add(homeItem1);
        homeMenu.add(homeItem2);

        JMenu bookmarkMenu = new JMenu("<html><span style='font-family:Poppins; font-size:15px; font-weight:bold; color:black; '>Bookmark</span></html>");
        bookmarkMenu.setFont(new Font("Poppins", Font.BOLD, 14));
        JMenuItem bookmarkItem1 = new JMenuItem("<html><span style='font-family:Poppins; font-size:15px; font-weight:normal;'>View</span></html>");
        bookmarkItem1.setFont(new Font("Poppins", Font.BOLD, 14));
        JMenuItem bookmarkItem2 = new JMenuItem("<html><span style='font-family:Poppins; font-size:15px; font-weight:normal;'>Manage</span></html>");
        bookmarkItem2.setFont(new Font("Poppins", Font.BOLD, 14));
        bookmarkMenu.add(bookmarkItem1);
        bookmarkMenu.add(bookmarkItem2);

        JMenu comicListMenu = new JMenu("<html><span style='font-family:Poppins; font-size:15px; font-weight:bold; color:black; '>Comics List</span></html>");
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

        JMenuItem logoutItem = new JMenuItem("<html><span style='font-family:Poppins; font-size:15px; font-weight:bold; color:black;'>Hi, User | Logout</span></html>");
        logoutItem.setFont(new Font("Poppins", Font.BOLD, 14));
        logoutItem.setForeground(Color.WHITE);
        logoutItem.setOpaque(false);
        logoutItem.setContentAreaFilled(false);
        logoutItem.setBorderPainted(false);
        logoutItem.addActionListener(e -> {
            SwingUtilities.getWindowAncestor(this).setVisible(false);
            new Login().setVisible(true);
        });

        add(homeMenu);
        add(bookmarkMenu);
        add(comicListMenu);
        add(Box.createHorizontalGlue());
        add(searchField);
        add(Box.createRigidArea(new Dimension(10, 0)));
        add(logoutItem);
    }
}