public class eight {
  public static void main(String[] args) {
    quadratic(1, -7, 12);
    quadratic(1, -3, 2);
    quadratic(1, 3, 2);
  }

  public static void quadratic(double a, double b, double c) {
    double root1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c )))/(2 * a);
    double root2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c )))/(2 * a);
    System.out.println("x = " + root1 + ", x =  " + root2);
  }
}
