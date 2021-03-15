import java.util.Scanner;

public class Max3 {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.println("세 정수의 최대값을 구합니다.");
    System.out.print("a의 값:");
    int a = kb.nextInt();
    System.out.print("b의 값:");
    int b = kb.nextInt();
    System.out.print("c의 값:");
    int c = kb.nextInt();
    int max = a;
    if (b > max) max = b;
    if (c > max) max = c;
    System.out.println("max:"+ max);
    kb.close();
  }
}
