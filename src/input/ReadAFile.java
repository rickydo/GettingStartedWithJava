package input;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadAFile {
  public static void main(String[] args) throws Throwable {
    FileInputStream fis = new FileInputStream("data.txt");
    InputStreamReader reader =
        new InputStreamReader(fis);
    BufferedReader input = new BufferedReader(reader);

    String userText;
    while ((userText = input.readLine()) != null){
      System.out.println("> " + userText);;
    }
    System.out.println("End of File");
  }
}