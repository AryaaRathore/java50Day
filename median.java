import java.util.ArrayList;
import java.util.Collections;


public class median {
    public static void main(String[] args) {
        int[][] matrix={{1,3,5},{7,8,9},{2,4,6}};
        ArrayList<Integer> singlerow=new ArrayList<>();
        for(int[] row:matrix){
            for(int element:row){
                
            singlerow.add(element);

            Collections.sort(singlerow);
        }
        
    }
    System.out.println(singlerow);
    int mid=singlerow.size()/2;
    System.out.println(singlerow.get(mid));
    
    
    }
    
}
