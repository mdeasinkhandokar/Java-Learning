import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Main {

    public static void main(String[] args) {
        /// How to write a file using java (4 popular options)
        /// FileWriter = Good for small or medium-sized text files
        /// BufferedWriter= Best for structured data , like reports or logs
        /// PrintWriter= Best for structured data ,like reports or logs
        /// FileOutputStream= Best for binary files(e.g , images, audio files)


        String filePath= " ";


        try (FileWriter writer = new FileWriter("E:\\work\\Summar\\java\\java learning")) {
            writer.write("I like pizza!");
            System.out.println("File has been written");

        }

        catch(FileNotFoundException e){
            System.out.println("Could not locate file location");

        }
catch (IOException e){
    System.out.println("Could not write file");
}

    }

}