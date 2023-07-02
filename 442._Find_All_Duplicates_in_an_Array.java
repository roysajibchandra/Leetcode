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
    public static List<Integer> findDuplicates(int[] nums)
    {
        int i=0;
        while(i<nums.length)
        {
            int current = nums[i] - 1;
            if(nums[i] != nums[current])
            {
                swaparr(nums, i, current);
            }
            else
            {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1)
            {
                ans.add(nums[index]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner timtim = new Scanner(System.in);
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        findDuplicates(arr);
        System.out.println(findDuplicates(arr));
    }
}
