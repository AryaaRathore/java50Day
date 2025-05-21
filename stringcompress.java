public class stringcompress {
    public static void main(String[] args) {
        
        String str="aaabbccccddddd";
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        for(int i=0;i<str.length();i++){
        
        if(str.charAt(i)=='a'){
            count1++;
            
        }
        
        else if(str.charAt(i)=='b'){
            
            count2++;
        }
        else if(str.charAt(i)=='c'){
        
            count3++;
        }
        else if(str.charAt(i)=='d'){
            count4++;
        }
        }
        System.out.print("a"+count1);
       System.out.print("b"+count2);
        System.out.print("c"+count3);
        System.out.println("d"+count4);
        
    }
    
}


    

