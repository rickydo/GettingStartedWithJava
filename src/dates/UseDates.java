package dates;

public class UseDates {
  public static void main(String[] args) /*throws NoSuchDayOfWeekException*/ {

    try {
      String badDayName = Date.dayName(8);
      System.out.println("Name of day 8 is " + badDayName);
    } catch(NoSuchDayOfWeekException e) {
      System.out.println("oops, bad day of week");
    }
    String dayThreeName = Date.dayName(3);
    System.out.println("Name of day 3 is " + dayThreeName);
    System.out.println("Name of day 6 is " + Date.dayName(6) );
    System.out.println("Day of week of Jan 1, 2000 is "
        + Date.dayName(Date.dayOfWeek(1, 1, 2000)));
    System.out.println("Day of week of Jan 12, 2000 is "
        + Date.dayName(Date.dayOfWeek(12, 1)));

    System.out.println("is Valid 7, 33, 1000? " + Date.isValid(7, 33, 1000));

//    int myBirthDay = 23;
//    int myBirthMonth = 7;
//    int myBirthYear = 2020;
//
    Date myBirth = new Date(23, 7, 2020);
//    myBirth.day = 23;
//    myBirth.month = 7;
//    myBirth.year = 2020;
    System.out.println("Birthday is on day Number " + myBirth.dayOfWeek());

    Date bad = new Date(0, 0, 0);
    System.out.println("Date is " + bad.day + "/" + bad.month);
  }
}