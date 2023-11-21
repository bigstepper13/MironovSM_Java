import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReplaceFileContent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите новую информацию для файла: ");
        String newContent = scanner.nextLine();

        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\hp-user\\IdeaProjects\\Practice13\\replace.txt")) {
            fos.write(newContent.getBytes());
            System.out.println("Информация успешно записана в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}