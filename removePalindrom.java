public class removePalindrom {
    public static void main(String[] args) {
        String str="racecar";
        String newstr="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='e'){
                newstr=newstr+str.charAt(i);
            }
        }
        System.out.println("removing after string:"+newstr);
            String rev="";
            
            for(int j=newstr.length()-1;j>=0;j--){ 
                rev=rev+newstr.charAt(j);
       }
                System.out.println("reverse String:"+rev);

                if(rev.equals(newstr)){
                    System.out.println("palindrom");
                }
                else{
                    System.out.println("not palindrom");
                }
            }
        }
    
    
    

