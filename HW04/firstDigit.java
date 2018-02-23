public class firstDigit {
  public static void main(String[] args) {
    firstDigit(3572);
    firstDigit(-947);
  }

  public static void firstDigit(int num) {
    while (num/10 != 0) {
      num /= 10;
    }
    System.out.println(Math.abs(num));
  }
}
