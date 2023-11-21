import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class AppendToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст для добавления в файл: ");
        String newText = scanner.nextLine();

        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\hp-user\\IdeaProjects\\Practice13\\replace.txt", true)) {
            fos.write(newText.getBytes());
            System.out.println("Текст успешно добавлен в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при добавлении текста в файл: " + e.getMessage());
        }
    }
}