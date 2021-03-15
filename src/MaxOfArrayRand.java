import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {

  static int maxOf(int[] a) {
    int max = 0;
    for(int i : a) {
      if (i > max) max = i;
    }
    return max;
  }
  public static void main(String[] args) {
    Random rand = new Random();
    int num = rand.nextInt(20);
    int[] height = new int[num];
    for(int i=0; i<num; i++) {

      height[i] = 100 + rand.nextInt(90);
      System.out.println(height[i]);
    }
    System.out.println("max: "+maxOf(height));


  }
}
