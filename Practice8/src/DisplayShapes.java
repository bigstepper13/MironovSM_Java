import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DisplayShapes {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Random random = new Random();

                for (int i = 0; i < 20; i++) {
                    int x = random.nextInt(getWidth());
                    int y = random.nextInt(getHeight());
                    Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

                    Shape shape;
                    if (random.nextBoolean()) {
                        int radius = random.nextInt(50) + 10;
                        shape = new Circle(color, new Point(x, y), radius);
                    } else {
                        int width = random.nextInt(100) + 10;
                        int height = random.nextInt(100) + 10;
                        shape = new Rectangle(color, new Point(x, y), width, height);
                    }

                    shape.draw(g);
                }
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}