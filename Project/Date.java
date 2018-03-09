public class Date{

  private int month, day, year;

  // Date constructor that checks to make sure that months are between 1-12 and days are between 1-31
  public Date(int month, int day, int year){
    if (month < 1 || month > 12 || day < 1 || day > 31)
      throw new IllegalArgumentException("Make sure months are between 1-12 and days are between 1-31");
    this.month = month;
    this.day = day;
    this.year = year;
  }

  // Moves this Date object forward in time by the given number of days.
  public void addDays(int days){
    int monthDays = 0;            // Variable that stores how many days are in the current month
    day += days;                  // Adds the amount of days passed into method onto the days of the object

    while (day > monthDays) {     // Starts while loop to start moving date forward and subtracting days.
      monthDays = 0;              // Resets monthDay variable after every iteration
      if(monthDays == 0){         // If monthDays equals 0 set it equal to the amount of days in the current month.
        if(month == 2)
          if(this.isLeapYear())   // Changes dates for Feb if it a leap year
            monthDays = 29;
          else
            monthDays = 28;
        else if (month == 4 || month == 6 || month == 9 || month == 11)
          monthDays = 30;
        else
          monthDays = 31;
      }
      if (day > 365) {            // If days are greater than 365 subtract from days and increment year
        if(this.isLeapYear()){    // Checks for leap year and adjusts days removed to 366.
          day -= 366;
          year++;
        } else {
          year++;
          day-= 365;
        }
      } else if (month == 12) {    // If december set month to Jan and increment year and subtract days in month.
        month = 1;
        day -= monthDays;
        year++;
      } else {                     // Remove the amount of days that equal the days
        day -= monthDays;          // in the month from the total days and increment the month
        month++;
      }
    }
  }

  // Moves this Date object forward in time by the given number of seven-day weeks.
  public void addWeeks(int weeks){
    weeks*=7;                      // multiples weeks by 7.
    addDays(weeks);                // Passes it into addDays method.
  }

  // Returns the number of days that this Date must be adjusted to make it equal to the other Date.
  public int daysTo(Date other){
    int[] dayArray = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};   // Array with values equal to each months days.
    int days = 0;                                                           // Sets days that will be returned at the end.
    Date current = new Date(month, day, year);                              // Creates a copy of original object to move forward to match the date other object.

    if (year > other.year || (year == other.year && month > other.month)) {
      return other.daysTo(this);                    // Reverses the objects if the older date is being passed in so there aren't any negative numbers.
    } else {
      while(current.month != other.month){           // Starts while loop to bring months equal to the other object's months.
        dayArray[2] = 28;
        if (current.isLeapYear()) {                  // Checks if the object is a leap year.
          dayArray[2] = 29;                          // Changes amount of days in array to 29 for leap year.
          if(current.month == 2                      // Adds day for edge case for when its a leap year and Feb so it doesn't add the extra day from the array.
             && other.year > current.year)
            day++;
        }
        days += dayArray[current.month];             // Adds the amount of days in the month to the days variable.
        current.month++;                             // Increments the month.
        if(current.month == 13){
          current.month = 1;                         // Moves month to Jan.
          current.year++;                            // Increments the year.
        }
      }

      while (current.year != other.year) {           // While loop to bring years equal to each other.
        if (current.isLeapYear())                    // Checks for leap year
          days += 366;                               // Adds days
        else if (!current.isLeapYear())              // Checks to make sure it isn't a leap year
          days += 365;                               // Adds days
        current.year++;                              // Increments the year.
      }
      if(other.isLeapYear() && !this.isLeapYear())   // Adds a day for when the original year isn't a leap year but the second one is.
      days++;

      if(day > other.day)                           // If the day is greater than the other objects day.
        return days - Math.abs(day-other.day);      // Subtract the days.
      return days + Math.abs(day-other.day);        // If not add the days.
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
      return year + "/0" + month + "/0" + day;              // Adds zeros for months and days < 10
    else if(month < 10)
      return year + "/0" + month + "/" + day;               // Adds zeros for days < 10
    return year + "/" + month + "/" + day;
  }
}
