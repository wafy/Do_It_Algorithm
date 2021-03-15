import java.util.Scanner;

public class JudgeSign {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("정수를 입력하세요.");
    int a = kb.nextInt();
    if (a > 0) {
      System.out.println("입력하신 값은 양수입니다.");
    } else if (a < 0){
      System.out.println("입력하신 값은 음수입니다.");
    } else {
      System.out.println("입력하신 값은 0입니다.");
    }
    kb.close();
  }

}
