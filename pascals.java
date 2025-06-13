public class pascals
 {
    public static void main(String[] args)
     {
        int num=1;
        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=5-i;j++)
            {
                System.out.print("  ");
            }
            for(int k=0;k<=i;k++)
            {
        
                
                System.out.printf("%4d",num);//4 use width
                num=num*(i-k)/(k+1);//next number check
            }
            
            System.out.println( );
            num++;
            
        }
    }
    
}


    

