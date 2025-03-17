class Solution {
    public void sortColors(int[] nums) {
        

        // declearing three variable for 0 ,1 and 2
        int count0=0;
        int count1=0;
        int count2=0;

// counting the number of 0,1,2 in count variable 
        for( int i=0; i<nums.length; i++)
        {
            if(nums[i]==0)
            {
                count0++;
            }
            else if(nums[i]==1)
            {
                count1++;
            }
            else
            {
                count2++;
            }
        }

// now assigning value to the variable 
int idx=0;
       for(int i=0; i<count0; i++)
       {
        nums[idx++]=0;
       }
       for(int i=0; i<count1; i++)
       {
        nums[idx++]=1;

       }
       for(int i=0; i<count2; i++)
       {
        nums[idx++]=2;
       }
        
    }
}