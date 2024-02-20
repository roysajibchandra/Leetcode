class Solution {
    public void swaparr(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    //    Cycle sort code
    public int missingNumber(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int current = arr[i];
            if(arr[i]< arr.length && arr[i] != arr[current])
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
            if(arr[index] != index)
            {
                return index;
            }
        }
        return arr.length;
    }
}
