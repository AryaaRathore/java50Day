public class checkRotation {
    public static void main(String[] args) {
        String str1="mypencil";
        String str2="pencilmy";
        String concateString="";
           if (str1.length()!=str2.length()) {
             System.out.println("strings are same");    
                  
            }
            else{
            concateString=str1+str1;
            System.out.println(concateString);
            }
        
           if(concateString.contains(str2)){
           System.out.println("str2 is rotation of str1");
           }
        else{
            System.out.println(" str2 is not rotation of str1");
           }
       }
    }
    
    

