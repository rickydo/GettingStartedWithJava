package many;

public class Array {
  public static void main(String[] args) {
    int[] numbers = new int[4];
    System.out.println("lengh of array is " + numbers.length);
    numbers[0] = 99;
    System.out.println("numbers[0] = " + numbers[0]);
    numbers[4] = 100;  // out of range. Cannot resize arrays
  }
}