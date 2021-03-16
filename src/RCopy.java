import java.util.Scanner;

public class RCopy {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("배열 a의 요솟수를 입력하세요: ");
    int numa = kb.nextInt();
    int[] a = new int[numa];

    for(int i=0; i<numa; i++) {
      a[i] = kb.nextInt();
    }

    System.out.print("배열 b의 요솟수를 입력하세요: ");
    int numb = kb.nextInt();
    int[] b = new int[numb];
    for(int i=0; i<numb; i++) {
      b[i] = kb.nextInt();
    }
    System.out.println("배열b를 배열a에 역순으로 복사합니다.");
    reverseCopy(a, b);
    for(int i=0; i < a.length; i++) {
      System.out.println("a["+ i +"] "+ a[i]);
    }
  }

    private static void reverseCopy(int[] a, int[] b) {
    int num = a.length <= b.length? a.length: b.length;
    for(int i=0; i < num; i++) {
      a[i] = b[b.length -i -1];
    }

  }
  private static void swap(int[] b, int i, int i1) {
   int tmp = b[i];
   b[i] = b[i1];
   b[i1] = tmp;
  }

}
