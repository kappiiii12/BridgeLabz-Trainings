import java.util.*;

public class ReverseLinkedList {
    public static List<Integer> reverse(List<Integer> list){
         List<Integer> reversed = new LinkedList<>();
         for(int item : list){
            reversed.addFirst(item);

         }
         return reversed;
    }
    public static void main(String[] args) {
        
    }
}
