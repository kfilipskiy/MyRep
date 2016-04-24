import java.io.*;
import java.io.File;
import java.lang.String;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.out;

public class FileOperations {

    public void create() throws IOException {
        Scanner in = new Scanner(System.in);
        out.println("Please, enter the path and the file name");
        String input = in.nextLine();
        File file = new File(input);
        file.createNewFile();
        out.println("Operation succesful");
    }

    public void delete () throws IOException{
        Scanner in = new Scanner(System.in);
        out.println("Please, enter the path and the file name");
        String input = in.nextLine();
        File file = new File(input);
        file.delete();
        out.println("Operation succesful");

        if (!file.isFile()) {
            System.err.println("There is no file @ given path");
            System.exit(0);
        }
    }

   public void rename() {  //i want just to rename file, but MAGIC happens, and a replacement functional appears =)

       Scanner in = new Scanner(System.in);
       out.println("Please, enter the path and the file name of necessary file");
       String input = in.nextLine();
       File oldfile = new File(input);

       if (!oldfile.isFile()) {
           System.err.println("There is no file @ given path");
           System.exit(0);
       }

       System.out.println("Enter new path or new name of your file .");
      String input1 = in.nextLine();

       File newfile = new File(input1);
       oldfile.renameTo(newfile);

   }

    public void copy() {
        Scanner in = new Scanner(System.in);
        out.println("Please, enter the path and the file name of necessary file");
        String input = in.nextLine();
        File sourceFile = new File(input);

        if (!sourceFile.isFile()) {
            System.err.println("There is no file @ given path");
            System.exit(0);
        }

        System.out.println("Enter new path or new name of your file .");
        String input1 = in.nextLine();

		/* destination file, where the content to be pasted */
        File destFile = new File(input1);

        /* if file not exist then create one */
        if (!destFile.exists()) {
          try {
             destFile.createNewFile();
         } catch (IOException e) {
              e.printStackTrace();
          }
         }

          InputStream input2 = null;
          OutputStream output2 = null;

          try {

			/* FileInputStream to read streams */
           input2 = new FileInputStream(sourceFile);

			/* FileOutputStream to write streams */
          output2 = new FileOutputStream(destFile);

         byte[] buf = new byte[1024];
         int bytesRead;

         while ((bytesRead = input2.read(buf)) > 0) {
           output2.write(buf, 0, bytesRead);
         }

         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }

         finally {
             try {

               if (null != input1) {
                  input2.close();
              }

              if (null != output2) {
          output2.close();
             }

         } catch (IOException e) {
             e.printStackTrace();
         }
          }
        }

}




