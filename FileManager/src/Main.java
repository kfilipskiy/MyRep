import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileOperations fileOperations = new FileOperations();

        System.out.println("Enter one of the following commands:");
        System.out.println("1 - Create file");
        System.out.println("2 - Delete file");
        System.out.println("3 - Rename/replace file");
        System.out.println("4 - Copy file");
        System.out.println("0 - Exit program");
        Scanner scanchoice = new Scanner(System.in);
        System.out.println();

        int choiceentry = -1;

        while(true) {

            System.out.println("Enter \"1\", \"2\", \"3\" , \"4\", \"or 0\"");
            if (scanchoice.hasNextInt())
                choiceentry = scanchoice.nextInt();


            switch (choiceentry) {
                case 1:
                    fileOperations.create();
                    break;

                case 2:
                    fileOperations.delete();
                    break;

                case 3:
                    fileOperations.rename();
                    break;

                case 4:
                    fileOperations.copy();
                    break;
            }

            if(choiceentry ==0 ) {
                return;
            }
        }
    }
}
