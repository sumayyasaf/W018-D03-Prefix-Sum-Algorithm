import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        //Compute prefix products and store in answer array
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            answer[i] = prefix;
            prefix *= nums[i];
        }

        //Compute suffix products and update answer array
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i]; //update prefix for next element
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums1);
        System.out.println(Arrays.toString(result));

        int[] nums2 = {-1, 1,0, -3, 3};
        int[] result2 = productExceptSelf(nums2);
        System.out.println(Arrays.toString(result2));
    }
}
