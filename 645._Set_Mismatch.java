import java.util.Arrays;
import java.util.Scanner;

class MissingNumber {
    public static void swaparr(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    //    Cycle sort code
    public static int[] findErrorNums(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int current = arr[i] -1;
            if(arr[i] != arr[current])
            {
                swaparr(arr, i, current);
            }
            else
            {
                i++;
            }
        }

//        searching missing Number
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1)
            {
                return new int[] {arr[index], index+1};
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        Scanner timtim = new Scanner(System.in);
        int[] arr = {1, 2, 2, 4};
//        selectionsort(arr);
//        insettionsort(arr);
        findErrorNums(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(findErrorNums(arr));
    }
}
