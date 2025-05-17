public class permutation {
    static void print_permutation(String str ,String result){
        if(str.length()==0){
            System.out.println(result+" ");
            return;

        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String res=str.substring(0, i)+str.substring(i+1);
            print_permutation(res,result+ch);
        }
    }
    public static void main(String[] args) {
        String strString="ABC";
        print_permutation(strString,"");
    }
    
}
