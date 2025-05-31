import java.util.ArrayList;

public class AlternatePositiveNegative {
    public static void main(String[] args) {
        int[] arr={1,2,3,-4,-1,-5};
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int num:arr){
            if(num>=0){
                pos.add(num);

            }
            else{
                neg.add(num);
            }
        }
        int[] res=new int[arr.length];
        int i=0,p=0,n=0;
        while (p<pos.size()&&n<neg.size()) {//alternate
            res[i++]=pos.get(p++);
            res[i++]=neg.get(n++);
            
        }
        while(p<pos.size()){
            res[i++]=pos.get(p++);
        }
        while(n<neg.size()){
            res[i++]=neg.get(n++);
        }
        for(int j:res){
        System.out.print(j+" ");
        
    }
}
    

    
}
