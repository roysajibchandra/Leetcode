import java.util.Scanner;

class FirstMissingPositive {
    public static void swaparr(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    //    Cycle sort code
    public static int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int current = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[current]) {
                swaparr(arr, i, current);
            } else {
                i++;
            }
        }

//        searching missing Number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }
        return arr.length + 1;
    }

    public static void main(String[] args) {
        Scanner timtim = new Scanner(System.in);
        int[] arr = {1, 3, -1, 4};

        firstMissingPositive(arr);

        System.out.println(firstMissingPositive(arr));
    }

}
