package betterdates.dates;

public class UseDates {
  public static void printDateMessage(Date d) {
    System.out.println("Date is " + d + " and that's interesting...");
  }

  public static void main(String[] args) {

    Date myBirth = new Date(23, 7, 2020);
    System.out.println("Birthday is on day Number " + myBirth.dayOfWeek());

    Date today = new Date(6, 2, 2020);
    System.out.println("Date is " + today.getDay());
//    today.setDay(-3);
//    System.out.println("Date is " + today.getDay());

    System.out.println("birthday on " + myBirth);

    // both variable types are good here
    Date /*Holiday*/ h = new Holiday(1, 1, 2020, "New Year's Day");
    printDateMessage(h);
    printDateMessage(today);
    System.out.println("Holiday is " + h.toString());
  }
}