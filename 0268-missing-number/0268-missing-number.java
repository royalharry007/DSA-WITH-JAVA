class Solution {
    public int missingNumber(int[] nums) {
        
        int sumArray=0;
        int n= nums.length;
       int  naturalSum = (n*(n+1))/2; // find the sum of natural number 

        for( int i=0; i< nums.length; i++)

        {
            sumArray = sumArray + nums[i]; // finding the sum of the array

        }
        int missingArray = naturalSum  - sumArray;
        return missingArray;

    }
}