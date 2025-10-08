import java.util.*;
public class LinkedListRemoveupdate {
     public static void main(String args[]) {
        LinkedList<Integer> number = new LinkedList<>();
         //add elements in LenkedList
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        System.out.println("LinkedList : "+ number);

        //remove elements from index 
        int rem = number.remove(2);
        System.out.println("Remove Element : "+ rem);
        System.out.println("Update LinkedList : "+number );
  

    }
}
