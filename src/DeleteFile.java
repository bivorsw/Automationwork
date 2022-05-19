import java.io.File;


    public class DeleteFile {
        public static void main(String[] args) {
            //Write a java program to delete the file.
            File f = new File("amazon2.txt");
            if (f.delete()) {
                System.out.println("Successfully deleted the file: " + f.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        }
    }