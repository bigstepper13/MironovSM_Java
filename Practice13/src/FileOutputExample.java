import java.io.*;
public class FileOutputExample {
    public static void main(String[] args) {
        try(FileReader reader = new
                FileReader("C:\\Users\\hp-user\\IdeaProjects\\Practice13\\output.txt"))
        {
            // чтение по символам
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
