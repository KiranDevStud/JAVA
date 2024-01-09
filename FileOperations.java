import java.io.*;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Writing into a file
        System.out.println("Enter the file name:");
        String fileName = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter(fileName);
            System.out.println("Enter text to write into the file (press Enter to finish):");
            String input;
            while (!(input = scanner.nextLine()).isEmpty()) {
                writer.write(input + "\n");
            }
            writer.close();
            System.out.println("Writing into file successful.");
        } catch (IOException e) {
            System.out.println("Error writing into file: " + e.getMessage());
        }

        // Reading from a file
        System.out.println("\nReading from file:");
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }

        // Rename file
        System.out.println("\nEnter new file name:");
        String newFileName = scanner.nextLine();
        File oldFile = new File(fileName);
        File newFile = new File(newFileName);
        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("Error renaming file.");
        }

        // Delete file
        System.out.println("\nDo you want to delete the file? (yes/no)");
        String deleteChoice = scanner.nextLine();
        if (deleteChoice.equalsIgnoreCase("yes")) {
            File fileToDelete = new File(newFileName);
            if (fileToDelete.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Error deleting file.");
            }
        }
        scanner.close();
    }
}
