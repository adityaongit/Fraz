import java.util.Arrays;

public class TwoSum_BF {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 13 };
        int target = 9;
        int res[] = twoSum(arr, target);
        System.out.println(Arrays.toString(res));
    }

    private static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { arr[i], arr[j] };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
