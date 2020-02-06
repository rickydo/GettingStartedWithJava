package dates;

public class Date {

  public static String dayName(int dayNum)  {
    if (dayNum < 0 || dayNum > 6)
      throw new NoSuchDayOfWeekException();
    switch (dayNum) {
      case 0: return "Saturday";
      case 1: return "Sunday";
      case 2: return "Monday";
      case 3: return "Tuesday";
      case 4: return "Wednesday";
      case 5: return "Thursday";
      case 6: return "Friday";
    }
    return "Bad Day";
  }

  // Zeller's congruence
  public static int dayOfWeek(int day, int month, int year) {
    if (month < 3) {
      month += 12;
      year --;
    }

    return (day + 13 * (month + 1) / 5
    + year + year / 4 - year / 100 + year / 400) % 7;
  } 
}