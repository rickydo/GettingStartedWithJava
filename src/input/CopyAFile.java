package input;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CopyAFile {
  public static void main(String[] args) throws Throwable {
    try (
      BufferedReader input = new BufferedReader(new FileReader("data.txt"));
      PrintWriter pw = new PrintWriter(new FileWriter("out.txt"));
    ) {
      String userText;
      while ((userText = input.readLine()) != null) {
        pw.println("> " + userText);
      }
    } // Guaranteed to close both files, no matter what
  }
}