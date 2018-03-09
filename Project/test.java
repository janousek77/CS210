public class test{
  public static void main(String[] args){
    Date one = new Date(2,1,2000);                          // Objects created for tests
    Date two = new Date(12,1,2002);
    Date three = new Date(4,11,2016);
    Date four = new Date(1,21,2016);
    Date five = new Date(1,01,2004);
    Date six = new Date(2,01,2005);

    System.out.println("Days from 2/1/2000 - 12/1/2002");   // Tests
    System.out.println(one.daysTo(two));
    System.out.println();
    System.out.println("Days from 12/1/2002 - 4/11/2016");
    System.out.println(two.daysTo(three));
    System.out.println();
    System.out.println("Days from 4/11/2016 - 1/21/2016");
    System.out.println(three.daysTo(four));
    System.out.println();
    System.out.println("Days from 1/21/2016 - 1/1/2004");
    System.out.println(four.daysTo(five));
    System.out.println();
    System.out.println("Days from 1/1/2004 - 2/1/2005");
    System.out.println(five.daysTo(six));
    System.out.println();
    System.out.println(one.toString());
    System.out.println("getDay " + one.getDay());
    System.out.println("getMonth " + one.getMonth());
    System.out.println("getYear " + one.getYear());
    one.addDays(75);
    System.out.println("75 days from original date " + one.toString());
    System.out.println("It is a leap year: " + one.isLeapYear());
    System.out.println();
    System.out.println(two.toString());
    System.out.println("It is a leap year: " + two.isLeapYear());
    two.addDays(33);
    System.out.println("33 days from original date " + two.toString());
    System.out.println("It is a leap year: " + two.isLeapYear());
    two.addWeeks(208);
    System.out.println("208 weeks after last date " + two.toString());
    System.out.println();
    System.out.println(three.toString());
    three.addWeeks(57);
    System.out.println("57 weeks after original date " + three.toString());
    System.out.println();
  }
}
