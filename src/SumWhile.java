import java.util.Scanner;

public class SumWhile {

  public static void main(String[] args) {
    Scanner kb = new Scanner((System.in));
    int a = kb.nextInt();
    int b = kb.nextInt();
    int sum = sumof(a, b);
    System.out.println("total:"+ sum);
    kb.close();
  }

  private static int sumof(int a, int b) {
    int na, nb;
    if (b > a) {
      na = a;
      nb = b;
    } else {
      na = b;
      nb = a;
    }
    int sum = 0;
    for(int i = na; i <=nb; i++) {
      sum +=i;
    }
    return sum;
  }

}
