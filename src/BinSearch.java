import java.util.Arrays;

public class BinSearch {

  static int binSearch(int[] a, int n, int key) {
    int start = 0;
    int end = n - 1;
    do {
      int mid = (start + end) / 2;
      if (a[mid] == key) {
        return mid;
      } else if (a[mid] < key) {
        start = mid + 1;
      } else if (a[mid] > key){
        end = mid - 1;
      }

    } while(start <= end);

    return -1;
  }

  public static void main(String[] args) {

    int[] a = {1,2,3,4,5,6};
    System.out.println("a["+ binSearch(a, 5, 2) +"] 요소에 있습니다.");
    System.out.println(Arrays.binarySearch(a, 2));
  }
}
