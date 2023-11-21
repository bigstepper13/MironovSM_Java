import java.io.*;
import java.util.Scanner;
public class FileInputExample {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("C:\\Users\\hp-user\\IdeaProjects\\Practice13\\output.txt", false)) {
            // запись всей строки
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите текст для записи в файл (для завершения введите 'exit'):");
            String input;
            while (!(input = scanner.nextLine()).equals("exit")) {
                // Записываем введенную строку в файл
                writer.write(input);
            }
            System.out.println("Запись в файл успешно выполнена.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}