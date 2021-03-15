import java.util.Scanner;

public class ArrayEquals {

  static boolean equals(int[] a, int[] b) {
    if (a.length != b.length) {
      return false;
    }

    for(int i=0; i<a.length; i++) {
      if(a[i] != b[i]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("배열a의 요솟수:");
    int na = kb.nextInt();
    int[] a = new int[na];

    for(int i=0; i<na; i++)  {
      a[i] = kb.nextInt();
    }

    System.out.print("배열b의 요솟수:");
    int nb = kb.nextInt();
    int[] b = new int[nb];
    for(int i=0; i<nb; i++) {
      b[i] = kb.nextInt();
    }

    System.out.println("배열 a와 b는"+ (equals(a, b)? "같다": "같지 않다."));
  }

}
