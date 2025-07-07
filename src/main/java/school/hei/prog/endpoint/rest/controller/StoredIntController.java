package school.hei.prog.endpoint.rest.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoredIntController {
  private static final String FILE_PATH = "/tmp/stored-int.txt";

  @GetMapping("/stored-int")
  public String getStoredInt() {
    File file = new File(FILE_PATH);

    try {
      if (file.exists()) {

        String content = Files.readString(Path.of(FILE_PATH));
        return "Stored number: " + content.trim();
      } else {

        int randomInt = new Random().nextInt();
        try (FileWriter writer = new FileWriter(file)) {
          writer.write(String.valueOf(randomInt));
        }
        return "Stored new number: " + randomInt;
      }
    } catch (IOException e) {
      return "Error accessing file: " + e.getMessage();
    }
  }
}
