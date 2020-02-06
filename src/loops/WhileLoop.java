package loops;

public class WhileLoop {
  public static void main(String[] args) {
    int balance = 1000;
    int withdraw = (((int)(Math.random() + 50)) + 1) * 10;
    
    while (balance >= withdraw) {
      // balance = balance - withdraw;
      balance -= withdraw;
      System.out.println("withdrawing " + withdraw + " new balance = " + balance);
    }
  }
}