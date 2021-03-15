import java.util.Scanner;

public class Median {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.println("세 정수의 중앙값을 구합니다.");
    System.out.println("a의 값:");
    int a =  kb.nextInt();
    System.out.println("b읙 값:");
    int b =  kb.nextInt();
    System.out.println("c의 값:");
    int c = kb.nextInt();
  System.out.println("세값이 중앙값은:"+ med3(a, b, c));

    kb.close();
  }

  private static int med3(int a, int b, int c) {
     if (a >= b) {
       if (b >= c)
         return b;
       else if (a <= c)
         return a;
       else
         return c;
     } else if (a > c) {
       return a;
     } else if (b > c) {
       return c;
     } else {
       return b;
     }
  }
}
