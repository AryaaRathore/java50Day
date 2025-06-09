//search in a 2D matrix
public class search
 {
        public static void search_matrix(int[][]arr,int target)
        {
            for(int i=0;i<arr.length;i++)
            {//row loop
                for(int j=0;j<arr[i].length;j++)
                { //column loop
                    if(arr[i][j]==target)
                    {
                        System.out.println("element "+target+" index:("+i+","+j+")");//2D index print
                                break;
                    }
                }
            }  
      }
      public static void main(String[] args) 
      {
        int[][] arr={{1,2,3},{4,5,6}};
        int target=3;
        int target2=6;
        System.out.println(" search target "+target );//bracket{1,2,3}
        search_matrix(arr, target);
        System.out.println("second bracket target "+target2);//bracket{4,5,6}
        search_matrix(arr, target2);
      }

    
}
