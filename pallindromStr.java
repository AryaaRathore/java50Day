public class pallindromStr {
    public static void main(String[] args) {
        String str="racecar";
        String rev=""; 
        
            for(int i=str.length()-1;i>=0;i--){
        rev+=str.charAt(i);
       }
       System.out.println(rev);
       if(rev.equals(str)){
        System.out.println("palindrom");
       }
       else{
        System.out.println("not palindrom");
       }

       
       }
    }
    


             
        
