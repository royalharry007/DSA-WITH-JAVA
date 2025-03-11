class Solution {
    public void moveZeroes(int[] nums) {

        int insertP=0;

        for( int i=0; i< nums.length; i++)
        {
            if( nums[i]!=0)
            {
                nums[insertP]=nums[i];
                insertP++;
            }
            
        }

        while( insertP < nums.length)
        {
            nums[insertP++]= 0;
                
        }
        
    }
}