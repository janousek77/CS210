public class RationalNumber{

  public static void main(String[] args){
    RationalNumber a = new RationalNumber(2 , 4);
    RationalNumber b = new RationalNumber(30 , 90);
    RationalNumber c = new RationalNumber(0 , 1);
    RationalNumber d = new RationalNumber(-15 , 25);
    RationalNumber x = new RationalNumber(4 , -4);
    RationalNumber y = new RationalNumber(9 , -3);
    RationalNumber z = new RationalNumber(-3 , 10);
    // RationalNumber f = new RationalNumber(-15 , 0);
    System.out.println(a.toString());
    System.out.println(b.toString());
    System.out.println(c.toString());
    System.out.println(x.toString());
    System.out.println(y.toString());
    System.out.println(z.toString());
    System.out.println(d.toString());
    System.out.println(a.add(b));
    System.out.println(a.subtract(b));
    System.out.println(a.multiply(b));
    System.out.println(a.divide(b));
  }

  private int numerator, denominator;
  private int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37};

  public RationalNumber(int numerator, int denominator){
    if(denominator == 0){
      throw new IllegalArgumentException("Denominator cannot be 0");
    } else {
      this.numerator = numerator;
      this.denominator = denominator;
      reduce();
    }
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public String toString(){
    if(denominator == 1 || numerator == 0)
      return String.valueOf(numerator);
    return String.valueOf(numerator) + "/" + String.valueOf(denominator);
  }

  public void reduce(){
    for (int i = 0; i < primes.length; i++) {
      if(numerator % primes[i] == 0
         && denominator % primes[i] == 0
         && numerator != 1
         && denominator != 1){
           numerator /= primes[i];
           denominator /= primes[i];
           reduce();
      } else if (denominator < 0) {
        numerator *= -1;
        denominator *= -1;
      }
    }
  }

  public RationalNumber add(RationalNumber other){
    int n , d;
    n = (numerator*other.denominator) + (other.numerator*denominator);
    d = other.denominator * denominator;
    return new RationalNumber(n, d);
  }

  public RationalNumber subtract(RationalNumber other){
    int n , d;
    n = (numerator*other.denominator) - (other.numerator*denominator);
    d = other.denominator * denominator;
    return new RationalNumber(n, d);
  }

  public RationalNumber multiply(RationalNumber other){
    int n , d;
    n = other.numerator * numerator;
    d = other.denominator * denominator;
    return new RationalNumber(n, d);
  }

  public RationalNumber divide(RationalNumber other){
    int n , d;
    n = numerator*other.denominator;
    d = other.numerator*denominator;
    return new RationalNumber(n, d);
  }
}
