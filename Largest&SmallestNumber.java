import java.util.*;
public class Test {
    public static int Largestnumber(int num[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<num.length; i++) {
            if(largest < num[i]) {
                largest = num[i];
            }

            if(smallest  > num[i]) {
                smallest = num[i];
            }
        }
        System.out.println("smallest value : "+ smallest);
        return largest;
    }
    public static void main(String args[]) {
        int num[] = {4, 5, 13, 15, 155, 1233, 33, 4};
        System.out.println("largest value : "+Largestnumber(num));
    }
}
