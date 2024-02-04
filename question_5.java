// Majority Element

import java.util.HashMap;

public class question_5 {

    public static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (!hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], 1);
            } else {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            }

            if (hashMap.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        int result = majorityElement(nums);
        System.out.println(result);
    }
}
