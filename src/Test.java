import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("Ukuran Layar\nLebar: " + screenSize.getWidth() +"\nTinggi: " + screenSize.getHeight());

    }
}
