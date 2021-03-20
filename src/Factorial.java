import java.util.Scanner;

public class Factorial {

  static int factorial(int n) {
    if (n > 0) {
      return n * factorial(n-1);
    }
    return 1;
  }

  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);
    System.out.print("정수를 입력하세요: ");
    int num = kb.nextInt();
    System.out.println("입력하신 "+ num +"의 팩토리얼은: "+ factorial(num));
  }

}
