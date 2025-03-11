class Solution {
    public void rotate(int[] nums, int k) {

        //Approach 1: using formula 1

        int temp[] = new int[nums.length]; // creating the temp array

        for( int i=0; i< nums.length; i++)
        {
            temp[(i+k) % (nums.length)] = nums[i]; // assing value to the temp array using formula
        }
        for( int i=0; i< nums.length; i++) // copying back temp array element to original array 
        {
            nums[i]= temp[i];
        }

        //Appraoch 2: Using reverse method in constant space complexity

        


    }
} 