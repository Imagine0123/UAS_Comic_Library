package TampilanMenu;

import TampilanBookmark.Bookmark;
import TampilanComic.AllComic;
import TampilanComic.Newest;
import TampilanComic.Popular;
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
        bookmarkItem1.addActionListener(e -> {
            SwingUtilities.getWindowAncestor(this).setVisible(false);
            new Bookmark().setVisible(true);
        });
        bookmarkMenu.add(bookmarkItem1);

        JMenu comicListMenu = new JMenu("<html><span style='font-family:Poppins; font-size:15px; font-weight:bold; color:black; '>Comics List</span></html>");
        comicListMenu.setFont(new Font("Poppins", Font.BOLD, 14));
        JMenuItem comicListItem1 = new JMenuItem("<html><span style='font-family:Poppins; font-size:15px; font-weight:normal;'>All</span></html>");
        comicListItem1.setFont(new Font("Poppins", Font.BOLD, 14));
        comicListItem1.addActionListener(e -> {
            SwingUtilities.getWindowAncestor(this).setVisible(false);
            new AllComic().setVisible(true);
        });
        JMenuItem comicListItem2 = new JMenuItem("<html><span style='font-family:Poppins; font-size:15px; font-weight:normal;'>Popular</span></html>");
        comicListItem2.setFont(new Font("Poppins", Font.BOLD, 14));
        comicListItem2.addActionListener(e -> {
            SwingUtilities.getWindowAncestor(this).setVisible(false);
            new Popular().setVisible(true);
        });
        JMenuItem comicListItem3 = new JMenuItem("<html><span style='font-family:Poppins; font-size:15px; font-weight:normal;'>Newest</span></html>");
        comicListItem3.setFont(new Font("Poppins", Font.BOLD, 14));
        comicListItem3.addActionListener(e -> {
            SwingUtilities.getWindowAncestor(this).setVisible(false);
            new Newest().setVisible(true);
        });
        comicListMenu.add(comicListItem1);
        comicListMenu.add(comicListItem2);
        comicListMenu.add(comicListItem3);

        JMenu profileMenu = new JMenu("<html><span style='font-family:Poppins; font-size:15px; font-weight:bold; color:black;'>Profile</span></html>");
        profileMenu.setFont(new Font("Poppins", Font.BOLD, 14));
        JMenuItem userItem = new JMenuItem("<html><span style='font-family:Poppins; font-size:15px; font-weight:normal;'>User</span></html>");
        userItem.setFont(new Font("Poppins", Font.BOLD, 14));
        JMenuItem logoutItem = new JMenuItem("<html><span style='font-family:Poppins; font-size:15px; font-weight:normal;'>Logout</span></html>");
        logoutItem.setFont(new Font("Poppins", Font.BOLD, 14));
        logoutItem.addActionListener(e -> {
            SwingUtilities.getWindowAncestor(this).setVisible(false);
            new Login().setVisible(true);
        });

        profileMenu.add(userItem);
        profileMenu.add(logoutItem);

        add(homeMenu);
        add(bookmarkMenu);
        add(comicListMenu);
        add(Box.createHorizontalGlue());
        add(searchField);
        add(Box.createRigidArea(new Dimension(10, 0)));
        add(profileMenu);
    }
}