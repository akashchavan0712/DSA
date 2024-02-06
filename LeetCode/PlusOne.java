package LeetCode;

public class PlusOne 
{
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n-1; i >= 0; i--)
        {
            digits[i] = digits[i]+1;
            
            if(digits[i] >= 10)
            {
                digits[i] = 0;
            }
            else
            {
                return digits;
            }
        }

        int result[] = new int[n+1];
        result[0] = 1;
        return result;
    }
    public static void main(String[] args) 
    {
        int IntegerArray[] = {9,9,9};
        int addedArray[] = plusOne(IntegerArray);
        for(int ele:addedArray)
        {
            System.out.println(ele);
        }
    }    
}
