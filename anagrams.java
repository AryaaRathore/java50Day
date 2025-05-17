import java.util.Arrays;
public class anagrams {
    public static void main(String[] args) {
        String str1="silent";
        String str2="listen";

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()!=str2.length()){
            System.out.println("String is not anagrams");
        }
        else{
            char[] String1=str1.toCharArray();
            char[] String2=str2.toCharArray();
            Arrays.sort(String1);
            Arrays.sort(String2);
            if(Arrays.equals(String1,String2)==true){
                System.out.println("strings are anagrams");
            }
            else{
                System.out.println("strings are not anagrams");
            }
        }
    }
    
}
