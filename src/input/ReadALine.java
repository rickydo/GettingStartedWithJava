package input;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadALine {
  public static void main(String[] args) throws Throwable {
    InputStreamReader reader = new InputStreamReader(System.in);

    BufferedReader input = new BufferedReader(reader);

    System.out.print("Enter Balance: ");
    String balance = input.readLine();

    System.out.println("You typed: " + balance);

    int amountToWithdraw = 100;
    int newBalance = balance - amountToWithdraw;
  }
}