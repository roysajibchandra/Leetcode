import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class FindNUmber {
    public static void swaparr(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    //    Cycle sort code
    public static int findDuplicate(int[] nums)
    {
        int i=0;
        while(i<nums.length)
        {
            if(nums[i] != i+1)
            {
                int current = nums[i] - 1;
                if(nums[i] != nums[current])
                {
                    swaparr(nums, i, current);
                }
                else
                {
                    return nums[i];
                }
            }
            else {
                i++;
            }


        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner timtim = new Scanner(System.in);
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
//        selectionsort(arr);
//        insettionsort(arr);
        findDuplicate(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(findDuplicate(arr));
    }
}
