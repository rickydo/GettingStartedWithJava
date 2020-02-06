package input;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadALine {
  public static void main(String[] args) throws Throwable {
    // Investigate Scanner
    InputStreamReader reader =
        new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(reader);

    System.out.print("Enter Balance: ");
    String userText = input.readLine();
    int balance = Integer.parseInt(userText);

    System.out.println("Starting balance: " + balance);
    System.out.print("Do you want to make a withdrawal? ");
    String okToWithdraw = input.readLine();
//    if (okToWithdraw.equalsIgnoreCase("yes")) {
    if ("yes".equalsIgnoreCase(okToWithdraw)) {
      int amountToWithdraw = 1000;
      if (amountToWithdraw > balance) { // MUST be boolean result
        System.out.println("You don't have enough money");
      } else {
        int newBalance = balance - amountToWithdraw;
        System.out.println("You got the money, you now have "
            + newBalance + " left");
      }
    } else {
      System.out.println("Well, if you don't want money, why are you here");
    }
  }
}