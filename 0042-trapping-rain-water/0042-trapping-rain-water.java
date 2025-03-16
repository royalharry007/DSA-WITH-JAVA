class Solution {
    public int trap(int[] height) {


        // edge case:1 when the no of bar is less than 2 no water can be store
        if(height.length < 2)
        {
            return 0;
        }

        // edge case:2 when the bar is arranged in ascending no water can be store
        // for(int i=1; i<height.length; i++)
        // {
        //     if( height[i] < height[i-1])
        //     {
        //         return -1;

        //     }
        //     return 0;
        // }

        // // edge case 3: when the bar is arranged in descending order no water can be store

        // for( int i=1; i< height.length; i++)
        // {
        //     if( height[i] > height[i-1])
        //     {
        //         return -1;
        //     }
        //     return 0;
        // }
// creating auxiliary array which will store the rightMax and leftMax from the array

int leftMax[] = new int[height.length];
int rightMax[] = new int[height.length];

leftMax[0]= height[0];
rightMax[height.length-1] = height[height.length-1];

// for leftMax auxiliary array
for( int i=1; i< height.length; i++)
{
    leftMax[i] = Math.max( height[i], leftMax[i-1]);
    
}

// for rightMax auxiliary array 

for( int i=height.length-2; i >= 0; i--)
{
    
    rightMax[i]  = Math.max( height[i],rightMax[i+1]);
    
    
}

// now finding the final number that can be conculude on the the water

int result = 0; 

for( int i=0; i< height.length; i++)
{
    int waterLevel = Math.min( leftMax[i] , rightMax[i]);
   if ( waterLevel < 0)
   {
    waterLevel = 0;
   }
 int  waterTrap = waterLevel - height[i];

 result  = result + waterTrap;
}

return result;

       }
        
    }
