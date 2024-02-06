package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;

public class IntersectionOfArrays2 
{
    public static int[] intersectHashMap(int nums1[], int nums2[])
    {   
        HashMap<Integer,Integer> freqNums1 = new HashMap<>();
        for(int num : nums1)
        {
            freqNums1.put(num,freqNums1.getOrDefault(num, 0)+1);
        }

        ArrayList<Integer> intersection = new ArrayList<Integer>();

        for(int num : nums2)
        {
            if(freqNums1.containsKey(num) && freqNums1.get(num) > 0)
            {
                intersection.add(num);
                freqNums1.put(num,freqNums1.get(num)-1);
            }
        }

        // Converting ArrayList to array
        int[] array = new int[intersection.size()];

        for(int i = 0; i < intersection.size(); i++)
        {
            array[i] = intersection.get(i);
        }

        return array;
    }
    // Function to return the intersection of two arrays
    public static int[] intersect(int[] nums1, int[] nums2) 
    {
        // In order to find the intersection of two arrays
        int len1 = nums1.length;
        int len2 = nums2.length;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int k = 0;
        int i = 0;
        int j = 0;

        while (i < len1 && j < len2) 
        {
            if (nums1[i] == nums2[j])
            {
                nums1[k++] = nums2[j++];
                i++;
            }
            else
            {
                if(nums1[i] > nums2[j])
                {
                    j++;
                }
                else
                {
                    i++;
                }
            }
        }

        return Arrays.copyOfRange(nums1,0,k);
    }
    public static void main(String[] args) 
    {
        int nums1[] = {1,2,2,1};
        int nums2[] = {2,2};
        int intersection[] = intersect(nums1, nums2);
        System.out.println("Back here : ");
        for(int ele:intersection)
        {
            System.out.println(ele);
        }
    }    
}
