public class nextGreaterElement {

    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3};
        int[] res = new int[arr.length];


        // find next greater element using bruteforce approach
        for(int i=0; i<arr.length; i++)
        {
            for( int j=i+1; j<arr.length; j++){

                if(arr[j] > arr[i]){
                    res[i] = arr[j];
                    break;

                }
                 res[i]=-1;
               
            }
             
                   
                    
                
        }
        res[arr.length-1]=-1;
       
        for( int i=0; i<res.length; i++)
        {
            System.out.print(res[i]+ " ");
        }
    }
    
}
