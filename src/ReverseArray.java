import java.util.Scanner;

public class ReverseArray {

  static void swap(String[] a, int idx1, int idx2) {
    String t = a[idx1];
    a[idx1] = a[idx2];
    a[idx2] = t;
  }

  static void reverse(String[] a) {
    for (int i=0; i< a.length / 2; i++) {
      swap(a, i,a.length - i -1);
    }
  }
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("요솟수: ");
    int num = kb.nextInt();
    String[] x = new String[num];

    for(int i=0; i < num; i++) {
      System.out.println("x["+ i +"]");
      x[i] = kb.next();
    }

    reverse(x);

    System.out.println("요소를 역순으로 정렬합니다.");
    for (int i = 0; i < x.length; i++) {
      System.out.println(x[i]);
    }

  }

}
