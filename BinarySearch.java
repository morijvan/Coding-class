import java.util.*;
public class Test {
    public static int binarySearch(int num[], int key) {
        int n = num.length;
        int start = 0, end = n-1;
        while(start <= end) {
            int mid = (start + end) /2;
            if(num[mid] == key) {
                return mid;
            }

            if(num[mid] < key) {
                start = mid + 1;
            }

            if(num[mid] > key) {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int num[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 12;
        System.out.println("index for key is : "+binarySearch(num, key));
    }
}
