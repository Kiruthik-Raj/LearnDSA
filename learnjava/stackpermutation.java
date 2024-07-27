
import java.util.*;

public class stackpermutation {
    public static void main(String args[]){
        int[] x = {1,2,3,4};
        Queue<Integer> queue = new LinkedList<>();
        for(Integer element : x){
            queue.add(element);
        }
        System.out.println(queue);

        
    }
}
