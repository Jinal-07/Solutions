/*
Class of the element of the array is as
class Height {
	int feet;
	int inches;
	public Height(int ft, int inc)
	{
	    feet = ft;
	    inches = inc;
	}
}
*/
// function must return the maximum Height
// return the height in inches
class GfG   //https://practice.geeksforgeeks.org/problems/maximum-in-struct-array/1
{
    public static int findMax(Height arr[], int n)
    {
         
          int max = arr[0].feet*12+arr[0].inches;
          for(int j=1; j<n; j++){
              int temp = arr[j].feet*12+arr[j].inches;
              if(temp > max){
                  max = temp;
              }
          }
          return max;
      }
    }
    
    /*
    public static boolean isEven(int i)
    {
        if(i%2==0)
            return true;
        else
            return false;
    }
    */
    
    
