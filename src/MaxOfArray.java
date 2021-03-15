import java.util.Scanner;

public class MaxOfArray {

  static int maxOf(int[] a) {
    int max = 0;
    for (int i: a) {
      if (i > max) max = i;
    }
    return max;
  }

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("키의 최댓값을 구합니다.");
    int num = kb.nextInt();

    int[] height = new int[num];
    for (int i=0; i < num; i++) {
      System.out.println("height["+ i +"]");
      height[i] = kb.nextInt();
    }
    System.out.println(maxOf(height));

    kb.close();
  }
}
