public class Point{

  public static void main(String[] args){
    // Point p1 = new Point(7, 2);
    // Point p2 = new Point(4, 3);
    // System.out.println("p1 is " + p1);
    // System.out.println("distance from origin = " +p1.distanceFromOrigin());
    // System.out.println("p2 is " + p2);
    // System.out.println("distance from origin = " +p2.distanceFromOrigin());
    // p1 = p1.translate(11, 6);
    // p2 = p2.translate(1, 7);
    // System.out.println("p1 is " + p1);
    // System.out.println("p2 is " + p2);

    // manhattanDistance
    Point one = new Point();
    Point two = new Point(8,9);
    System.out.println("Manhattan Distance: " + one.manhattanDistance(two));
  }

  private int x;
  private int y;

  public Point(){
    this(0,0);
  }

  public Point(int x, int y){
    setLocation(x, y);
  }

  public double distanceFromOrigin(){
    return Math.sqrt(x * x + y * y);
  }

  public int getX(){
    return x;
  }

  public int getY(){
    return y;
  }

  public void setLocation(int x, int y){
    this.x = x;
    this.y = y;
  }

  public String toString(){
    return "(" + x + ", " + y + ")";
  }

  public Point translate(int dx, int dy){
    return new Point(x + dx, y + dy);
  }

  // manhattanDistance
  public int manhattanDistance(Point other){
    return Math.abs(this.x - other.x) +  Math.abs(this.y - other.y);
  }
}
