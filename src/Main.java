import java.io.*;
public class Main {
    public static void main(String[] args) {
        String fileName = "student.dat";


        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName))) {
            out.writeUTF("Alice");
            out.writeInt(21);
            out.writeDouble(87.5);
            System.out.println("Data written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }


        try (DataInputStream in = new DataInputStream(new FileInputStream(fileName))) {
            String name = in.readUTF();
            int age = in.readInt();
            double score = in.readDouble();

            System.out.println("\n Data read from file:");
            System.out.println("Name: " + name);
            //System.out.println("Age: " + age);
            //System.out.println("Score: " + score);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
