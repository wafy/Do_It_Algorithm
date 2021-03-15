public class CloneArray {

  public static void main(String[] args) {
    int[] a = {1,2,3,4,5};
    int[] b = a.clone();

    System.out.println("a=");
    for (int i: a) {
      System.out.println(i);
    }

    System.out.println("b=");
    for (int i: b) {
      System.out.println(i);
    }

    int max = 0;
    for (int i : a) {
      max = i;
      if (i > max) max = i;
    }
    System.out.println("max=");
    System.out.println(max);
  }
}
