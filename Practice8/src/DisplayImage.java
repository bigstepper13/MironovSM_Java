import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DisplayImage {

    public static void main(String[] args) {
        // Получаем путь к картинке из аргументов командной строки
        String imagePath = args[0];

        // Создаем новый JFrame
        JFrame frame = new JFrame("Отображение картинки");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создаем новый JLabel для отображения картинки
        JLabel label = new JLabel();
        ImageIcon imageIcon = new ImageIcon(imagePath);
        label.setIcon(imageIcon);

        // Добавляем JLabel на JFrame
        frame.getContentPane().add(label);

        // Устанавливаем размеры окна на основе размеров картинки
        frame.pack();

        // Отображаем окно
        frame.setVisible(true);
    }
}