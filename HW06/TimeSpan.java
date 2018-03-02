/*
    Chris Janousek
	 CS210 Assignment HW05 chapter 8 #7
    2/7/2018
*/

public class TimeSpan {

  public static void main(String[] args){
     TimeSpan one = new TimeSpan(1, 20);
     TimeSpan two = new TimeSpan(4, 30);
     one.add(4, 30);
     one.add(two);
     System.out.println(one.toString());
     System.out.println(two.toString());
   }

   private int totalMinutes;
   private int hours;
   private int minutes;

   public TimeSpan(int hours, int minutes) {
      totalMinutes = 0;
      this.hours = hours;
      this.minutes = minutes;
      add(hours, minutes);
   }

   public void add(int hours, int minutes) {
      totalMinutes += 60 * hours + minutes;
   }

   public void add(TimeSpan time) {
      add(time.hours, time.minutes);
    }

   public boolean equals(Object o) {
      if (o instanceof TimeSpan) {
         TimeSpan other = (TimeSpan) o;
         return totalMinutes == other.totalMinutes;
      } else {
         return false;
      }
   }

   public String toString() {
      return (totalMinutes / 60) + "h " +
            (totalMinutes % 60) + "m";
   }
}
