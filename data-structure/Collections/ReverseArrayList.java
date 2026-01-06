import java.util.* ;

public class ReverseArrayList {
 public static void reverse(List<Integer> list) {
    int left = 0;
    int right = list.size() -1;
     while(left < right){
        int temp = list.get(left);
        list.set(left,list.get(right));
        list.set(right,temp);
        left++;
        right--;
     }
 }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5)) ;
        reverse(list);
        System.err.println("Reversed List : "+ list);
    }
}
