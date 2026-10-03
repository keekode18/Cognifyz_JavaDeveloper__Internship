import java.io.*;
import java.util.Scanner;

public class FileEncryptionDecryption {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Encrypt File");
        System.out.println("2. Decrypt File");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter input file name: ");
        String inputFile = sc.nextLine();

        System.out.print("Enter output file name: ");
        String outputFile = sc.nextLine();

        int shift = 3;

        try {
            FileReader reader = new FileReader(inputFile);
            FileWriter writer = new FileWriter(outputFile);

            int ch;

            while ((ch = reader.read()) != -1) {

                char character = (char) ch;

                if (choice == 1) {
                    // Encryption
                    character = (char) (character + shift);
                }
                else if (choice == 2) {
                    // Decryption
                    character = (char) (character - shift);
                }
                else {
                    System.out.println("Invalid choice.");
                    reader.close();
                    writer.close();
                    sc.close();
                    return;
                }

                writer.write(character);
            }

            reader.close();
            writer.close();

            if (choice == 1) {
                System.out.println("File encrypted successfully!");
            }
            else {
                System.out.println("File decrypted successfully!");
            }

            System.out.println("Output saved as: " + outputFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}