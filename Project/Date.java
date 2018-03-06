public class Date{

  public static void main(String[] args){
    Date one = new Date(2,1,2000);
    Date two = new Date(12,1,1700);
    Date three = new Date(4,11,2016);
    Date four = new Date(1,21,2016);
    Date five = new Date(1,01,2004);
    Date six = new Date(2,01,2005);
    System.out.println(four.daysTo(three));
    System.out.println(three.daysTo(four));
    System.out.println(three.toString());
    System.out.println(four.toString());

    System.out.println(three.daysTo(four));
    System.out.println(five.daysTo(six));
    System.out.println();

    System.out.println(one.toString());
    one.addDays(75);
    System.out.println("75 days from original date " + one.toString());
    System.out.println("It is a leap year: " + one.isLeapYear());
    System.out.println("getDay " + one.getDay());
    System.out.println("getMonth " + one.getMonth());
    System.out.println("getYear " + one.getYear());
    System.out.println();

    System.out.println(two.toString());
    System.out.println("It is a leap year: " + two.isLeapYear());
    two.addDays(33);
    System.out.println("33 days from original date " + two.toString());
    System.out.println("It is a leap year: " + two.isLeapYear());
    System.out.println();

    System.out.println(three.toString());
    System.out.println("It is a leap year: " + three.isLeapYear());
    three.addWeeks(57);
    System.out.println("57 weeks after original date " + three.toString());
    System.out.println();

  }

  private int month, day, year;

  public Date(int month, int day, int year){
    if (month < 1 || month > 12 || day < 1 || day > 31)
      throw new IllegalArgumentException("Make sure months are between 1-12 and days are between 1-31");
    this.month = month;
    this.day = day;
    this.year = year;
  }

  // Moves this Date object forward in time by the given number of days.
  public void addDays(int days){
    int monthDays = 0;
    day += days;

    while (day > monthDays) {
      monthDays = 0;
      if(monthDays == 0){
        if(month == 2)
          if(this.isLeapYear())
            monthDays = 29;
          else
            monthDays = 28;
        else if (month == 4 || month == 6 || month == 9 || month == 11)
          monthDays = 30;
        else
          monthDays = 31;
      }
      if (day > 365) {
        year++;
        day-= 365;
      } else if (month == 12) {
        month = 1;
        day -= monthDays;
        year++;
      } else {
        day -= monthDays;
        month++;
      }
    }
  }

  // Moves this Date object forward in time by the given number of seven-day weeks.
  public void addWeeks(int weeks){
    weeks*=7;
    addDays(weeks);
  }

  // Returns the number of days that this Date must be adjusted to make it equal to the other Date.
  public int daysTo(Date other){
    int[] dayArray = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int start = month;
    int days = 0;
    // int d = other.day
    // int m = other.month;
    // int y = other.year;

    if (year > other.year || (year == other.year && month > other.month)) {
      return other.daysTo(this);
    } else {
      while(start != other.month){
        if (this.isLeapYear())
          dayArray[2] = 29;
          if(month < 3 && other.year > year)
            days++;
        days += dayArray[start];
        start++;
        if(start == 13){
          start = 1;
          other.year-=1;
        }
      }

      while (other.year != year) {
        if (other.isLeapYear())
          days += 366;
        else if (!other.isLeapYear())
          days += 365;
        other.year--;
      }

      if(day > other.day)
        return Math.abs(days - Math.abs(day-other.day));
      return Math.abs(days + Math.abs(day-other.day));
    }
  }

  // Returns the day value of this date; for example, for the date 2006/07/22, returns 22
  public int getDay(){
    return day;
  }

  // Returns the month value of this date; for example, for the date 2006/07/22, returns 7
  public int getMonth(){
    return month;
  }

  // Returns the Month value of this date; for example, for the date 2006/07/22, returns 2006
  public int getYear(){
    return year;
  }

  // Returns true if the year of this date is a leap year.
  // A leap year occurs every four years, except for multiples of 100 that are not multiples of 400.
  // For example, 1956, 1844, 1600, 2000 are leap years, but 1983, 2002, 1700 and 1900 are not.
  public boolean isLeapYear(){
    if(year%4 == 0){
      if(year % 100==0 && year % 400!=0)
        return false;
      return true;
    } else {
        return false;
    }
  }

  // Returns a String representation of this date in year/month/day order, such as "2006/07/22".
  public String toString(){
    if(month < 10 && day < 10)
      return year + "/0" + month + "/0" + day;
    else if(month < 10)
      return year + "/0" + month + "/" + day;
    return year + "/" + month + "/" + day;
  }

}
