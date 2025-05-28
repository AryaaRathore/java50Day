public class countandsay {
    public static String count_say(int n){
        String res="1";
        for(int i=1;i<n;i++){
            String temp="";
            int count=1;

            for(int j=0;j<res.length();j++){
                if(j+1<res.length() && res.charAt(j)==res.charAt(j+1)){
                    count++;
                }
                else{
                    temp+=count+""+res.charAt(j);
                    count=1;
                }
            }
            res=temp;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(6);
    }
    
}
