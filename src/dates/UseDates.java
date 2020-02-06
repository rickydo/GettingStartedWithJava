package dates;

public class UseDates {
  public static void main(String[] args) throws NoSuchDayOfWeekException {
    try {
      String dayThreeName = Date.dayName(8);
      System.out.println("Name of day 8 is " + dayThreeName);

    } catch(NoSuchDayOfWeekException e) {
      System.out.println("oops, bad day of week");
    }
    System.out.println("Name of day 6 is " + Date.dayName((6)));
    System.out.println("Name of day 1 is " + Date.dayName((1)));

    System.out.println("Day of the week of Jan 1, 2000 is " + Date.dayName((Date.dayOfWeek(1, 1, 2000))));
    // should be saturday
  }
}