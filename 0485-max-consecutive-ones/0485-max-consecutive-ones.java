class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count=0;
        int max =0;
   // 
        for( int i=0; i< nums.length; i++) 
    {
            if(nums[i]==1) 
            {
                count++;
                max = Math.max(max, count); // updating the value from max and current 
            }
            else 
            {
                count=0; // reseting the count value
    
            }
          
       
    }
        
         return max;
    }
}