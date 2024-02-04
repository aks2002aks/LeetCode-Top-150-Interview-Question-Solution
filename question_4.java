// Remove Duplicates from Sorted Array II

import java.util.HashMap;

public class question_4 {

    public static int removeDuplicates(int[] nums) {
        int k = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], 1);
            } else {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            }

            if (hashMap.get(nums[i]) <= 2) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int result = removeDuplicates(nums);
        System.out.println(result);

        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}


// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int j=1;
//         int count=1;
//         for (int i=1; i<nums.length; i++) {
//             if (nums[i]==nums[i-1]) {
//                 count++;
//             } else {
//                 count=1;
//                 // write down the previous one
//                 nums[j++]=nums[i];
//             }
            
//             if(count==2) {
//                 nums[j]=nums[j-1];
//                 j++;
//             }
//         }
//         //System.out.println("j="+j);
//         return j;
//     }
// }