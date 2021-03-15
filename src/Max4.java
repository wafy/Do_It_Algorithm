public class Max4 {

  public static void main(String[] args) {
    System.out.println("max4:" + max4(4,3,2,1));
    System.out.println("max4:" + max4(3,1,2,4));
    System.out.println("min3:"+ min3(4,3,2));
    System.out.println("min3:"+ min3(1,2,3));
    System.out.println("min4:"+ min4(4,3,2,1));
  }

  static int max4(int a, int b, int c, int d) {
    int max = a;
    if (b > max) max = b;
    if (c > max) max = c;
    if (d > max) max = d;
    return max;
  }

  static int min3(int a, int b, int c) {
    int min = a;
    if (b < min) min = b;
    if (c < min) min = c;
    return min;
  }

  static int min4(int a, int b, int c, int d) {
    int min = a;
    if (b < min) min = b;
    if (c < min) min = c;
    if (d < min) min = d;
    return min;
  }
}
