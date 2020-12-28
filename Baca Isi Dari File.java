import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] yuda) {
      try {
        Path file = Paths.get("data.txt");
        byte[] data = Files.readAllBytes(file);
        String isi = new String(data);
        System.out.println(isi);
      } catch (IOException exception) {
        System.out.println("File tidak ditemukan");
      }

       
    }
}