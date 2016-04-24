import java.io.File;
import java.io.IOException;

public class home_task1 {

        public static void main(String[] args) throws IOException {
            //File newFile = new File("C:\\Users\\ed\\IdeaProjects\\home_task1\\1.txt");
            File newFile = new File("C:\\1.txt");
            if (newFile.createNewFile()) {
                System.out.println("Новый файл создан");
            } else {
                System.out.println("Файл уже существует");
            }
        }
}