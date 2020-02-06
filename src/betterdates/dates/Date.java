package betterdates.dates;

public class Date {
  private int day;
  private int month;
  private int year;

  // Constructor NO RETURN TYPE, name IS CLASSNAME
  public Date(int day, int month, int year) {
    if (!isValid(day, month, year))
      throw new IllegalArgumentException("Bad date");
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public static String dayName(int dayNum)
    /*throws NoSuchDayOfWeekException*/ {
    if (dayNum < 0 || dayNum > 6)
      throw new NoSuchDayOfWeekException();
    switch (dayNum) {
      case 0:
        return "Saturday";
//      break; // normally needed
      case 1:
        return "Sunday";
      case 2:
        return "Monday";
      case 3:
        return "Tuesday";
      case 4:
        return "Wednesday";
      case 5:
        return "Thursday";
      case 6:
        return "Friday";
    }
    return "BAD DAY";
  }

  //  public int dayOfWeek(Date this) {
  public int dayOfWeek() {
    return dayOfWeek(this.day, this.month, this.year);
  }

  // Method "overload" -- same "name", same class,
  // different argument type sequence...
  public static int dayOfWeek(int day, int month) {
    return dayOfWeek(day, month, 2020);
  }

  public static int dayOfWeek(int day, int month, int year) {
    if (month < 3) {
      month += 12;
      year--;
    }
    return (day + 13 * (month + 1) / 5
        + year + year / 4 - year / 100 + year / 400) % 7;
  }

  public static boolean isLeap(int year) {
    return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
  }

  public static int daysInMonth(int month, int year) {
    switch (month) {
      case 9:
      case 4:
      case 6:
      case 11:
        return 30;
      case 2:
        return isLeap(year) ? 29 : 28;
      default:
        return 31;
    }
  }

  public boolean isValid() {
    return isValid(this.day, this.month, this.year);
  }

  public static boolean isValid(int day, int month, int year) {
    return month <= 12 && month >= 1
        && day >= 1 && day <= daysInMonth(month, year);
  }

  public void setDay(int day) {
    if (!isValid(day, this.month, this.year))
      throw new IllegalArgumentException("Bad Day for this date");
    this.day = day;
  }

  public int getDay() {
    return this.day;
  }

  @Override
  public String toString(/*Date this*/) {
    return "Date: d=" + this.day + ", m=" + this.month + ", y=" + this.year;
  }
}